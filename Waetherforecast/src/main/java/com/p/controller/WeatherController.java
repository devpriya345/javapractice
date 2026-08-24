package com.p.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p.entity.WeatherEntity;
import com.p.service.WeatherService;

@RestController
public class WeatherController {
	
	@Autowired
	private WeatherService weatherService;
	
	@GetMapping("/weather")
	public  WeatherEntity getWeatherEntity() {
		return weatherService .getWeather();
	
	}
	}