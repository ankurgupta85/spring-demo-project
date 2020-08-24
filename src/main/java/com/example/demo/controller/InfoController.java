package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.InfoService;

@RestController
@RequestMapping("/v1/info")
public class InfoController {

	@Autowired
	private InfoService infoService;
	
	@Autowired 
	private HttpServletRequest request;
	
	private Logger LOG  = LoggerFactory.getLogger(InfoController.class);
	
	@GetMapping("")
	public ResponseEntity<String> getInfo() {
		LOG.info("Called getInfo() from "+request.getRemoteHost());
		return infoService.getInfo();
	}

}
