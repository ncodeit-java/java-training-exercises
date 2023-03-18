package com.example.springdatjpa.service;

import com.example.springdatjpa.entity.unidirectional.Customer;

public interface CustomerService {
	
	void createUser(Customer user) throws Exception;
	
	Customer findUser(String name) throws Exception;
}
