package com.p3.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p3.RestApiJuntApplication;
import com.p3.service.WelcomeService;

@RestController
public class WelcomeRestController {
	private final RestApiJuntApplication restApiJuntApplication;
	@Autowired
	private WelcomeService service;

	WelcomeRestController(RestApiJuntApplication restApiJuntApplication) {
		this.restApiJuntApplication = restApiJuntApplication;
	}
	
@GetMapping("/welcome")
	
	public ResponseEntity<String>getWelcomeMsg(){
		System.out.println("Injected::"+ service.getClass().getName());
	String msg =service.getMsg();
	msg= msg.toUpperCase();
		return new ResponseEntity<String>(msg,HttpStatus.OK);
}

	
}
