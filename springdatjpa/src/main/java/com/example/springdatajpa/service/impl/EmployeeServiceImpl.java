package com.example.springdatajpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.springdatajpa.dao.EmployeeDao;
import com.example.springdatajpa.entity.oneToMany.bidirectional.Employee;
import com.example.springdatajpa.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;		

	@Override
	public void saveEmployee(Employee employee) throws Exception {
		employeeDao.save(employee);
	}

}
