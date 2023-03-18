package com.example.springdatjpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springdatjpa.entity.oneToOne.bidirectional.Citizen;
import com.example.springdatjpa.entity.oneToOne.bidirectional.Passport;

@Repository
public interface PassportDao extends JpaRepository<Passport, Integer> {

}
