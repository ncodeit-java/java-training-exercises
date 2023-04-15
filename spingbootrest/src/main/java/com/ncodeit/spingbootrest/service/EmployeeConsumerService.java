package com.ncodeit.spingbootrest.service;

import java.util.List;

import com.ncodeit.spingbootrest.domain.EmployeeConsumer;

public interface EmployeeConsumerService {
	
	public List<EmployeeConsumer> getEmployees();
	
	public EmployeeConsumer getEmployee(String empId);

	public EmployeeConsumer createEmployee(EmployeeConsumer employeeConsumer);

}
