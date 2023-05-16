package com.example.springdatajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdatajpa.entity.oneToMany.bidirectional.Employee;
import com.example.springdatajpa.entity.oneToOne.bidirectional.Citizen;
import com.example.springdatajpa.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/employee",method = RequestMethod.POST
			,consumes = MediaType.APPLICATION_JSON_VALUE
			)	
	public void createEmployee(@RequestBody Employee employee) {
		try {
			employeeService.saveEmployee(employee);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*@RequestMapping(value = "/employee/{empId}",method = RequestMethod.GET
			,produces = MediaType.APPLICATION_JSON_VALUE
			)	
	public void createCitizen(@PathVariable("empId") int employeeId) {
		try {
			employeeService.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	*/

}
