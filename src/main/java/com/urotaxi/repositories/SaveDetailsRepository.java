package com.urotaxi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.urotaxi.entities.PassangerData;

public interface SaveDetailsRepository extends JpaRepository<PassangerData, Integer> {

}
