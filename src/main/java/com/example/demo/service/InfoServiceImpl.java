package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class InfoServiceImpl implements InfoService {

	@Value("${app.name}")
	private String appName;

	private Logger LOG = LoggerFactory.getLogger(InfoServiceImpl.class);

	@Override
	public ResponseEntity<String> getInfo() {
		LOG.debug("GetInfo name:"+appName);
		return new ResponseEntity<String>(appName, HttpStatus.OK);
	}

}
