package com.p3.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.p3.entity.City;

public  interface CityRepo extends JpaRepository<City, Integer> {

	List<City> findByStateId(Integer stateid);
}
