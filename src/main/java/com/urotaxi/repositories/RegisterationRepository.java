package com.urotaxi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.urotaxi.entities.Registeration;

public interface RegisterationRepository extends JpaRepository<Registeration, Integer> {
	
}
