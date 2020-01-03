package com.pankaj.rana.microservice.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pankaj.rana.microservice.limitservice.configuration.Configuration;
import com.pankaj.rana.microservice.limitservice.model.LimitConfiguration;

@RestController
public class LimitServiceController {

	@Autowired
	private Configuration configuration;
	// get aa limit
	@GetMapping("/limits")
	 public LimitConfiguration getLimitConfiguration() {
		return new LimitConfiguration(configuration.getMinimum(), configuration.getMaximum());
		 
	 }
}
