package com.example.springdatajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdatajpa.entity.unidirectional.Customer;
import com.example.springdatajpa.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;	
	
	@RequestMapping(value = "/customer",method = RequestMethod.POST
			,consumes = MediaType.APPLICATION_JSON_VALUE
			)	
	public void createCustomer(@RequestBody Customer customer) {
		try {
			customerService.createCustomer(customer);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value = "/customer/{customerName}",method = RequestMethod.GET
			,produces = MediaType.APPLICATION_JSON_VALUE
			)
	public Customer getCustomer(@PathVariable("customerName") String customerName) {
		Customer customer=null;
		try {
			customer= customerService.findUser(customerName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return customer;
	}	

}
