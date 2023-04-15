package com.ncodeit.spingbootrest.service.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ncodeit.spingbootrest.domain.EmployeeConsumer;
import com.ncodeit.spingbootrest.domain.ListEmployeeResponse;
import com.ncodeit.spingbootrest.domain.SingleEmployeeResponse;
import com.ncodeit.spingbootrest.service.EmployeeConsumerService;

@Service
public class EmployeeConsumerServiceImpl implements EmployeeConsumerService {

	@Value("${employees.get.url}")
	private String employeesUrl;
	
	@Value("${employee.get.url}")
	private String employeeUrl;	
	
	@Value("${employee.create.url}")
	private String employeeCreateUrl;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public List<EmployeeConsumer> getEmployees() {
		List<EmployeeConsumer> employeeConsumers=null;
		
	    HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity<String> entity = new HttpEntity<String>(headers);
		
		ResponseEntity<ListEmployeeResponse> responseEntity= restTemplate.getForEntity(employeesUrl, ListEmployeeResponse.class);
		if(HttpStatus.OK== responseEntity.getStatusCode()){
			ListEmployeeResponse restResponse=responseEntity.getBody();
			employeeConsumers=restResponse.getEmployeeConsumers();
		}
		return employeeConsumers;
	}

	@Override
	public EmployeeConsumer getEmployee(String empId) {
		System.out.println("Inside getEmployee method :" +empId);
		Map<String, Object> variables=new HashMap<>();
		variables.put("employeeId", empId);
		
		ResponseEntity<SingleEmployeeResponse> responseEntity= restTemplate.getForEntity(employeeUrl, SingleEmployeeResponse.class,variables);
		System.out.println("after invocation " );
		if(HttpStatus.OK== responseEntity.getStatusCode()){
			System.out.println("after invocation OK Response" );
			SingleEmployeeResponse singleEmployeeResponse=responseEntity.getBody();
			return singleEmployeeResponse.getEmployeeConsumers();
		}
		return null;
	}

	@Override
	public EmployeeConsumer createEmployee(EmployeeConsumer employeeConsumer) {
		ResponseEntity<SingleEmployeeResponse> responseEntity=restTemplate.postForEntity(employeeCreateUrl, employeeConsumer, SingleEmployeeResponse.class);
		if(HttpStatus.OK== responseEntity.getStatusCode()){
			System.out.println("after invocation OK Response" );
			SingleEmployeeResponse singleEmployeeResponse=responseEntity.getBody();
			return singleEmployeeResponse.getEmployeeConsumers();			
		}
		return null;
	}

}
