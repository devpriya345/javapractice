package com.p3.rest;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	org.slf4j.Logger logger = LoggerFactory.getLogger(MsgRestController.class);
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		
		logger.trace("this is log-trace msg");
		logger.debug("this is log -debug msg");
		logger.info("this is log-info msg");
		logger.warn("this is log -warn msg");
		logger.error("this is log -error msg");
		
	String msg = "Welcome to class";
	
	return msg;
	
	}
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		
		String msg = "Good Morning";
		return msg;
		
	}
}
