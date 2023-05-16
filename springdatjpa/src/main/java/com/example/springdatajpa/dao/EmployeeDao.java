package com.example.springdatajpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springdatajpa.entity.oneToMany.bidirectional.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
