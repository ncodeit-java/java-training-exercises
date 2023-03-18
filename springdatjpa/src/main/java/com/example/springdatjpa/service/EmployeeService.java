package com.example.springdatjpa.service;

import com.example.springdatjpa.entity.oneToMany.bidirectional.Employee;

public interface EmployeeService {
	
	public void saveEmployee(Employee employee) throws Exception;

}
