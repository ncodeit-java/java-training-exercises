package com.example.springdatjpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.springdatjpa.dao.EmployeeDao;
import com.example.springdatjpa.entity.oneToMany.bidirectional.Employee;
import com.example.springdatjpa.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;		

	@Override
	public void saveEmployee(Employee employee) throws Exception {
		employeeDao.save(employee);
	}

}
