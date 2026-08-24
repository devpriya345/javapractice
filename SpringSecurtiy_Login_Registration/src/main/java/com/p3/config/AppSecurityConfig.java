package com.p3.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.p3.service.CustomerService;



@Configuration
@EnableWebSecurity
public class AppSecurityConfig {
	
	@Autowired
	private CustomerService customerService;
	@Bean
	public BCryptPasswordEncoder pwdEncoder() {//
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	
    public DaoAuthenticationProvider authenticationProvider() {

        DaoAuthenticationProvider authenticationProvider =
                new DaoAuthenticationProvider(customerService);

        authenticationProvider.setPasswordEncoder(pwdEncoder());

        return authenticationProvider;
    }
	@Bean
	public AuthenticationManager auhtManager(AuthenticationConfiguration configuration) {
		
	return configuration.getAuthenticationManager();//to check login credentials are valid or not
	}
	
	@Bean
	public SecurityFilterChain security(HttpSecurity http) throws Exception{
		
		http

        .csrf(csrf -> csrf.disable())
		.authorizeHttpRequests((req) -> {
			req.requestMatchers("/register","/login")
			.permitAll()
			.anyRequest()
			.authenticated();
			
		});
		return http.build(); // to specify for which url security required or for not
		
	}
	
}
