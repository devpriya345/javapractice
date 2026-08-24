package com.p3.security;

import java.util.Collections;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public  class MyUserDetailService implements  UserDetailsService{
	
	public UserDetails loadUserByUsername(String username) {
		
		return new User("admin", "$2a$10$OvP815EXmxcEBPqpkaH88u0V9uc5kbaXIuhKWv5PbUqtd2HcwPdlO", Collections.emptyList());
	}
}
