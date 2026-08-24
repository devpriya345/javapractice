package com.P2.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRsetController {
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		String msg = "welcome to REST API"; 
		return msg;
	}
	
	@PostMapping("/msg")//use to map our method to post request
	public ResponseEntity<String> saveMsg() {//to get custom response code use responseEntity
		String responseBody = "Msg saved successfully";
		
		return new ResponseEntity<String>(responseBody, HttpStatus.CREATED);
	}// logic to ge ststus code
}
