package com.p3.test;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.p3.rest.WelcomeRestController;
import com.p3.service.WelcomeService;

@WebMvcTest(value=WelcomeRestController.class)

public class WelcomeRestControllerTest {
	
	@MockB
	private WelcomeService service;
	
	@Autowired
	private void testGetWelcomeMsg() {
		
		//define mock obj behaviour
		
		when(service.getMsg()).thenReturn("Welcome to ashok it...");
		
		//prepare http get request
		
		MockHttpServletRequestBuilder reqBuilder   = MockMvcRequestBuilders.get("/welcome");
		
		//send request& hold response
		
		MvcResult mvcResult = mvc.perform(reqBuilder).andReturn();
		
		
		//validate response
		
		MockHttpServletResponse response = mvcResult.getResponse();
		int status = response.getStatus();
		Assertions.assertEquals(200,status);
	}
}
