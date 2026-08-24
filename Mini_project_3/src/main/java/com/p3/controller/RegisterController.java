package com.p3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.p3.entity.City;
import com.p3.entity.Country;
import com.p3.entity.State;
import com.p3.entity.User;
import com.p3.service.UserService;



@Controller
public class RegisterController {
	
	@Autowired
	private UserService  userService;
	
	@GetMapping("/register")  //open registration page
	public String registerPage(Model model) {
		
		List<Country> countries = userService.getCountries();
		
		model.addAttribute("countries",countries);
		model.addAttribute("user", new User());
		
		return "register";
	}
	
	@PostMapping("/register/country")  //load states based on country
	 public String getStates(
	            @RequestParam Integer countryId,
	            Model model){
		 List<Country> countries = userService.getCountries();
		 
		 List<State> states = userService.getStates(countryId);
		 
		 model.addAttribute("countries",countries);
		 model.addAttribute("states",states);
		 model.addAttribute("selectedCountry",countryId);
		 model.addAttribute("user",new User());
		 
		 return "register";
	}
		@PostMapping("/register/state")  //load cities based on state
	   public String getCities(
	            @RequestParam Integer countryId,
	            @RequestParam Integer stateId,
	            Model model){
			 List<Country> countries = userService.getCountries();
			 
			 List<State> states = userService.getStates(countryId);

		     List<City> cities = userService.getCities(stateId);
		     
		     model.addAttribute("countries",countries);
		     model.addAttribute("states",states);
		     model.addAttribute("cities",cities);
			 model.addAttribute("selectedCountry",countryId);
			 model.addAttribute("selectedState",stateId);
			 model.addAttribute("user",new User());
			 
			 return "register";
		}
		
		@PostMapping("/register/save")  //to save registration
		 public String saveUser(
		            @ModelAttribute User user,
		            Model model){
		String msg = userService.registerUser(user);
		model.addAttribute("msg",msg);
		
		return "register";
		
		 }		
		
		
		
		
		
}