package com.p3.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	@GetMapping("/welcome")
	public String welcomeMsg() {
		
		return "Welcome to class";
	}
	@GetMapping("/greet")
	public String greetMsg() {
		
		return "Good Day";
	
}
}