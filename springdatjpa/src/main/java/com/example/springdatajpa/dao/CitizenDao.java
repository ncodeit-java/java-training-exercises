package com.example.springdatajpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springdatajpa.entity.oneToOne.bidirectional.Citizen;

@Repository
public interface CitizenDao extends JpaRepository<Citizen, Integer> {

}
