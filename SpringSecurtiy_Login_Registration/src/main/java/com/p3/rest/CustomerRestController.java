package com.p3.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.p3.entity.Customer;
import com.p3.service.CustomerService;

@RestController
public class CustomerRestController {

	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody Customer c){
		
		UsernamePasswordAuthenticationToken token = //set login credentials for validation
				new UsernamePasswordAuthenticationToken(c.getEmail(), c.getPwd());
		Authentication authenticate = authenticationManager .authenticate(token);
		
		boolean status = authenticate.isAuthenticated();
		
		if(status) {
			return new ResponseEntity<String>("Welcome",HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("Failed",HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/register")
	public ResponseEntity<String> registerCustomer(@RequestBody Customer c){
		boolean status= customerService.saveCustomer(c);
		if(status) {
			return new ResponseEntity<>("Success",HttpStatus.CREATED);
		} else{ 
			return new ResponseEntity<>("Failed",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
