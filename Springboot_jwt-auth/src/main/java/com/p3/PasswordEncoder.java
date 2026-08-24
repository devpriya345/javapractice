package com.p3;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {
	
	 public static void main(String[] args) {
	        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

	        String password = "admin@123";
	        String encodedPassword = encoder.encode(password);

	        System.out.println(encodedPassword);
	    }
}
