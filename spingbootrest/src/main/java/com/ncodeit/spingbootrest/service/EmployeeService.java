package com.ncodeit.spingbootrest.service;

import java.util.List;

import com.ncodeit.spingbootrest.domain.Employee;

public interface EmployeeService {
	
	public Employee getEmployee(String empId);
	public List<Employee> getEmployees();
	
	public void createEmployee(Employee emp);
	public void updateEmployee(Employee emp);
	public void deleteEmployee(String empId);
}
