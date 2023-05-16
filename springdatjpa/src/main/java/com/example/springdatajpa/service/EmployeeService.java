package com.example.springdatajpa.service;

import com.example.springdatajpa.entity.oneToMany.bidirectional.Employee;

public interface EmployeeService {
	
	public void saveEmployee(Employee employee) throws Exception;

}
