package com.best.goldenguide.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.best.goldenguide.model.State;

public interface StateRepository extends JpaRepository<State, Long> {
	public List<State> findByName(String name);
	
}
