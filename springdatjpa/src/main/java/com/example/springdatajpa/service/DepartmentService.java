package com.example.springdatajpa.service;

import com.example.springdatajpa.entity.oneToMany.bidirectional.Department;

public interface DepartmentService {
	
	public void saveDepartment(Department department) throws Exception;

}
