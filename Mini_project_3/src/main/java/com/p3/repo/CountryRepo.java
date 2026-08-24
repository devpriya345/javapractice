package com.p3.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.p3.entity.Country;

public interface CountryRepo  extends JpaRepository<Country, Integer>{

	}
