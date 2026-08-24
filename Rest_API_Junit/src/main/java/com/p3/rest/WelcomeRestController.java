package com.p3.rest;

import org.springframework.beans.factory.annotation.Autowired;

import com.p3.Service.WelcomeService;

public class WelcomeRestController {
	
	@Autowired
	private WelcomeService service;
	
	@GetMapping()
	public ResponseEntity<String>getWelcomeMsg(){
		String msg = service.getMsg();
		return new ResponseEntity<>(msg,HttpStatus.Ok);
	}
	
}
