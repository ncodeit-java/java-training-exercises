package com.example.springdatjpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springdatjpa.entity.oneToOne.bidirectional.Citizen;

@Repository
public interface CitizenDao extends JpaRepository<Citizen, Integer> {

}
