package com.example.springdatajpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdatajpa.dao.CustomerDao;
import com.example.springdatajpa.entity.unidirectional.Customer;
import com.example.springdatajpa.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;

	@Override
	public void createCustomer(Customer customer) throws Exception {
		customerDao.save(customer);

	}

	@Override
	public Customer findUser(String name) throws Exception {
		return customerDao.findByFirstName(name);
	}

}
