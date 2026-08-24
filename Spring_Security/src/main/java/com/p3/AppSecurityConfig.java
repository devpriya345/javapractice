package com.p3;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class AppSecurityConfig {
	@Bean
	public SecurityFilterChain securtityFilter(HttpSecurity http) throws Exception{
		
		  http
          .authorizeHttpRequests(auth -> auth
		.requestMatchers("/welcome")
		.permitAll()
		.anyRequest()
		.authenticated()
		)
          .formLogin(withDefaults());
		
		return http.build();
	}
	
	
}
