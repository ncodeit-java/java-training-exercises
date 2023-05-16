package com.example.springdatajpa.service;

import com.example.springdatajpa.entity.unidirectional.Customer;

public interface CustomerService {
	
	void createCustomer(Customer user) throws Exception;
	
	Customer findUser(String name) throws Exception;
}
