package com.P3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class WelcomeRestController {

	@GetMapping("/welcome")
	public String welcomeMsg() {
		System.out.println("Request recieved");
		String msg = "welcome to ashokit...";
		return msg;
	}
	
	}
