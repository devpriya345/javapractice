package com.p.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.p.entity.WeatherEntity;

public interface WeatherRepository  extends JpaRepository<WeatherEntity, String>{

}
