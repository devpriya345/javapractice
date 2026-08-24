package com.p3.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.p3.entity.State;

public interface StateRepo extends JpaRepository<State, Integer> {

    @Query("select s from State s where s.country_id = :countryId")
    List<State> getStatesByCountryId(@Param("countryId") String countryId);

}