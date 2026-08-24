package com.p3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.p3.service.UserService;



@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String loginpage() {
		
		return "login";
	}
	
	@PostMapping("/login")
	private String login(@RequestParam String email, @RequestParam String password,Model model) {
		String msg = userService.login(email, password);
		if(msg.equals("Success")) {
			return "dashboard";
		}
		 model.addAttribute("msg",msg);
		
		return "login";
	}		
		
		
		
		
		
		
		
		
		
	
}
