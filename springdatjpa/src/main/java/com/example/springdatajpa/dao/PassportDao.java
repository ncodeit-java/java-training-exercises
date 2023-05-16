package com.example.springdatajpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springdatajpa.entity.oneToOne.bidirectional.Citizen;
import com.example.springdatajpa.entity.oneToOne.bidirectional.Passport;

@Repository
public interface PassportDao extends JpaRepository<Passport, Integer> {

}
