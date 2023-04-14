package com.ncodeit.spingbootrest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ncodeit.spingbootrest.domain.Employee;
import com.ncodeit.spingbootrest.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;

	// To return xml format enable media type xml and uncomment the required jar in pom
	@RequestMapping(value = "/employees/{employeeId}",method = RequestMethod.GET
			//,produces = MediaType.APPLICATION_XML_VALUE
			,produces = MediaType.APPLICATION_JSON_VALUE
			)
	public Employee getEmployee(@PathVariable("employeeId") String empId) {
		return empService.getEmployee(empId);
	}
	
	@RequestMapping(value = "/employees",method = RequestMethod.GET
			,produces = MediaType.APPLICATION_JSON_VALUE
			)
	public List<Employee> getEmployees() {
		return empService.getEmployees();
	}
	
	@RequestMapping(value = "/employees",method = RequestMethod.POST
			,consumes = MediaType.APPLICATION_JSON_VALUE
			)	
	public void createEmployee(@RequestBody Employee employee) {
		empService.createEmployee(employee);
	}
	
	@RequestMapping(value = "/employees",method = RequestMethod.PUT
			,consumes = MediaType.APPLICATION_JSON_VALUE
			)	
	public void updateEmployee(@RequestBody Employee employee) {
		empService.createEmployee(employee);
	}
	
	
	@RequestMapping(value = "/employees/{employeeId}",method = RequestMethod.DELETE)	
	public void deleteEmployee(@PathVariable("employeeId") String empId) {
		empService.deleteEmployee(empId);
	}	
}
