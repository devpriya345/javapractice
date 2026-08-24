package com.p.service;

import org.springframework.stereotype.Service;

import com.p.entity.WeatherEntity;

@Service
public class WeatherService {

	public WeatherEntity getWeather() {
		return new WeatherEntity();
	}


}
