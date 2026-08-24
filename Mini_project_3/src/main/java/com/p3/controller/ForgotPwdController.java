package com.p3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.p3.service.UserService;

public class ForgotPwdController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/forgot")
	public String forgotPage() {
		
		return "forgotpwd";
	}
	
	@PostMapping("/forgot")
	public String forgot(@RequestParam String email,Model model) {
		String msg = userService.forgotPassword(email);
		model.addAttribute("msg",msg) ;
		
		return "forgotPwd";
	}
}
