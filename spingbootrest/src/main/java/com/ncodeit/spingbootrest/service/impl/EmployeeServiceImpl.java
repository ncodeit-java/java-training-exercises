package com.ncodeit.spingbootrest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncodeit.spingbootrest.dao.EmployeeDao;
import com.ncodeit.spingbootrest.domain.Employee;
import com.ncodeit.spingbootrest.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao empDao;

	@Override
	public Employee getEmployee(String empId) {
		return empDao.getEmployee(empId);
	}
	
	@Override
	public List<Employee> getEmployees() {
		return empDao.getEmployees();
	}

	@Override
	public void createEmployee(Employee emp) {
		empDao.createEmployee(emp);
	}

	@Override
	public void updateEmployee(Employee emp) {
		empDao.updateEmployee(emp);
	}

	@Override
	public void deleteEmployee(String empId) {
		empDao.deleteEmployee(empId);
	}	

}
