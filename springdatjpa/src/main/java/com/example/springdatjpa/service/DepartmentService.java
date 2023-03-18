package com.example.springdatjpa.service;

import com.example.springdatjpa.entity.oneToMany.bidirectional.Department;

public interface DepartmentService {
	
	public void saveDepartment(Department department) throws Exception;

}
