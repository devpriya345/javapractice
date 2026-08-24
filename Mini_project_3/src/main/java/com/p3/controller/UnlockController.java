package com.p3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.p3.service.UserService;

@Controller
public class UnlockController {
	
	@Autowired
	public UserService userService;
	
	@GetMapping("/unlock")
	public String unlockPage() {
		
		return "unlock";
	}
	
	@PostMapping("/unlock")
	 public String unlock(@RequestParam String  email,
			               @RequestParam String tempPwd,
			               @RequestParam String newPwd,
			               Model model) {
		String msg = userService.unlockAccount(email, tempPwd, newPwd);
		model.addAttribute("msg",msg);
		
		return "Unlock";
	}
	
}
