package com.ncodeit.spingbootrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ncodeit.spingbootrest.domain.EmployeeConsumer;
import com.ncodeit.spingbootrest.service.EmployeeConsumerService;

@RestController
public class EmployeeConsumerController {
	
	@Autowired
	private EmployeeConsumerService employeeConsumerService;
	
	@GetMapping(value = "/getEmployeeConsumers",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<EmployeeConsumer> getEmployees(){
		return employeeConsumerService.getEmployees();
	}
	
	@GetMapping(value = "/getEmployeeConsumers/{empId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeConsumer getEmployee(@PathVariable("empId") String empId){
		return employeeConsumerService.getEmployee(empId);
	}
	
	@PostMapping(value = "/getEmployeeConsumers"
			,produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeConsumer createEmployee(@RequestBody EmployeeConsumer employeeConsumer){
		return employeeConsumerService.createEmployee(employeeConsumer);
	}	

}
