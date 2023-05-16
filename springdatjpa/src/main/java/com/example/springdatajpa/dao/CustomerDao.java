package com.example.springdatajpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springdatajpa.entity.unidirectional.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {

	Customer findByFirstName(String name) throws Exception;

}
