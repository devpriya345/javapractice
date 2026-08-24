package com.p3.repo;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.p3.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User>  findByEmail(String email);
	
}