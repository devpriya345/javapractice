package com.p3.util;

import java.util.Random;

public class PasswordUtil {
	
	private static final String CHARS =
			 "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$";
	
	public static String generatePassword() {
		
		Random r = new Random();
		
		StringBuilder sb = new StringBuilder();
		
		for( int i=0 ; i<8 ; i++) {
			
            sb.append(CHARS.charAt(r.nextInt(CHARS.length())));
		}
		
		return sb.toString();
	}
	
}
