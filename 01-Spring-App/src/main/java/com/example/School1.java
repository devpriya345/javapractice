package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class School1 {
	
	@Autowired
	private StudentService studentService;
	
	public void start() {
		studentService.study();
	}
}
