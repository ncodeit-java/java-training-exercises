package com.example.springdatajpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springdatajpa.entity.unidirectional.Address;

@Repository
public interface AddressDao extends JpaRepository<Address, Integer> {

}
