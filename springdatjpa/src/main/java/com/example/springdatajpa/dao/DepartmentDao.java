package com.example.springdatajpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springdatajpa.entity.oneToMany.bidirectional.Department;

@Repository
public interface DepartmentDao extends JpaRepository<Department, Integer> {

}
