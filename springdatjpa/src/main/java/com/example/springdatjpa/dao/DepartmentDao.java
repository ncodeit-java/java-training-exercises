package com.example.springdatjpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springdatjpa.entity.oneToMany.bidirectional.Department;

@Repository
public interface DepartmentDao extends JpaRepository<Department, Integer> {

}
