package com.ncodeit.springjdbc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncodeit.springjdbc.dao.CusomerDao;
import com.ncodeit.springjdbc.domain.Customer;
import com.ncodeit.springjdbc.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CusomerDao userDao;

	@Override
	public void saveUser(Customer user) throws Exception {
		userDao.saveUser(user);

	}

	@Override
	public Customer getUser(String id) throws Exception {
		return userDao.getUser(id);
	}

	@Override
	public int getTotalCount() throws Exception {
		return userDao.getTotalCount();
	}

	@Override
	public void deleteUser(String id) throws Exception {
		userDao.deleteUser(id);
		
	}

	@Override
	public Customer getUserByEmail(String email) throws Exception {
		return userDao.getUserByEmail(email);
	}

	@Override
	public List<Customer> getAllUsers() throws Exception {
		return userDao.getAllUsers();
	}

	@Override
	public Customer getCustomerUsingSP(int id) throws Exception {
		return userDao.getCustomerUsingSP(id);
	}

}
