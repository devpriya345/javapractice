package com.P3.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.P3.entity.UserAccount;
import com.P3.service.UserAccountService;


@Controller
public class UserAccountController {
	
	@Autowired
	private UserAccountService service;
	
	@GetMapping("/")
	public String index (Model model) {
	model.addAttribute("user",new UserAccount())	;
		return "index";  //this method  used to load index page
	} 
	
	@PostMapping("/save-user")
	
	public String saveUser(UserAccount user, Model model) {

	    String msg = service.saveOrUpdateUserAcc(user);

	    model.addAttribute("msg", msg);
	    model.addAttribute("user", new UserAccount());

	    return "index";
}
	@GetMapping("/users")
	public String getUsers(Model model) {
		List<UserAccount>userList = service.getAllUserAccounts();
		
		System.out.println("Users Found = " + userList.size());
		
		System.out.println(userList);
		
		model.addAttribute("users",userList);
		
		  model.addAttribute("user", new UserAccount());
		  
		return "view-users";
	}
	
	@GetMapping("/edit")
	public String editUser(@RequestParam("id")Integer id ,Model model) {
		
		UserAccount userAcc =service.getUserAccount(id);
		
		model.addAttribute("user",userAcc);
		
		return "index";
	}
	@GetMapping("/delete")
	public String deleteUser(@RequestParam("id") Integer uid,Model model) {
		
		boolean deleteUserAcc = service.deleteUserAcc(uid);
		return "redirect:/users";
	}
	
	@GetMapping("/update")
	public String statusUpdate(@RequestParam ("id") Integer uid,
			@RequestParam("status")String status) {
		
		service.updateUserAccStatus(uid, status);
		return"redirect:/users";
	}
	
}

	
