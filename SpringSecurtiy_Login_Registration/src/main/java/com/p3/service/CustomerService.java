package com.p3.service;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.p3.entity.Customer;
import com.p3.repo.CustomerRepository;

@Service
public class CustomerService implements UserDetailsService {
	
	@Autowired
	private BCryptPasswordEncoder pwdEncoder;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username)throws UsernameNotFoundException{
		
		 Customer c = customerRepository.findByEmail(username);//load user record
		 
		return new User(c.getEmail(),c.getPwd(),Collections.emptyList()) ;
	}
	
	public boolean saveCustomer(Customer c) {
		
		String encodedPwd = pwdEncoder.encode(c.getPwd());
		c.setPwd(encodedPwd);
		 
		Customer savedCustomer = customerRepository.save(c);//insert record into table
		return savedCustomer.getCid() !=null;
	}
}
