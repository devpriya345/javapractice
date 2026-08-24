package com.p3.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
	
	@GetMapping("/")
	 public String welcome() {
		 return "Welocme to class";
	 }
	 @GetMapping("/admin")
	 public String adminProcess() {
		 return "Welcome Admin";
	 }
	 @GetMapping("/user")
	 public String userProcess() {
		 return "Welcome User";
	 }
}
