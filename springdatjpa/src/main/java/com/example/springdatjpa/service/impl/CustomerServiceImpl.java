package com.example.springdatjpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdatjpa.dao.CustomerDao;
import com.example.springdatjpa.entity.unidirectional.Customer;
import com.example.springdatjpa.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao userDao;

	@Override
	public void createUser(Customer user) throws Exception {
		userDao.save(user);

	}

	@Override
	public Customer findUser(String name) throws Exception {
		return userDao.findByFirstName(name);
	}

}
