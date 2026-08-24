package com.p3.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class AppSecurityConfig {
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	public void authManager(AuthenticationManagerBuilder auth) {
		auth.jdbcAuthentication()
		.dataSource(dataSource)
		.passwordEncoder(new BCryptPasswordEncoder())
		.usersByUsernameQuery("SELECT username ,password,enabled FROM human WHERE username=?")
		.authoritiesByUsernameQuery("SELECT username,auhtority FROM authorities WHERE username=?");
	}
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
		.authorizeHttpRequests ((req) ->req
	    .requestMatchers("/", "/login").permitAll()		
		.requestMatchers("/admin").hasRole("ADMIN")
		.requestMatchers("/user").hasAnyRole(" ADMIN"," USER")
		.requestMatchers("/").permitAll()
		.anyRequest().authenticated()
	)
	.formLogin(form -> form.permitAll());
	
	return http.build();
}
}	
	
	

