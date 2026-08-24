package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.AppSecurity;

@Configuration
public class AppConfig {
	
	public AppConfig() {
		System.out.println("Appconfig:: Constructor");
	}
	@Bean
	public AppSecurity createInstance() {
		AppSecurity as = new AppSecurity();
		return as;
	}
	
}
