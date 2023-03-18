package com.example.springdatjpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springdatjpa.entity.oneToMany.bidirectional.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
