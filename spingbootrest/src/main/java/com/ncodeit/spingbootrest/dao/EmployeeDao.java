package com.ncodeit.spingbootrest.dao;

import java.util.List;

import com.ncodeit.spingbootrest.domain.Employee;

public interface EmployeeDao {
	
	public Employee getEmployee(String id);
	public List<Employee> getEmployees();
	
	public void createEmployee(Employee emp);
	public void updateEmployee(Employee emp);
	
	public void deleteEmployee(String empId);
}
