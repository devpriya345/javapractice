package com.p3.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.p3.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	public Customer findByEmail(String email);
		
}
