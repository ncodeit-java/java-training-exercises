package com.ncodeit.springjdbc.service;

import java.util.List;

import com.ncodeit.springjdbc.domain.Customer;

public interface CustomerService {
	
	public void saveUser(Customer user) throws Exception;
	
	public Customer getUser(String id) throws Exception;
	
	public int getTotalCount() throws Exception;
	
	public void deleteUser(String id) throws Exception;
	
	public Customer getUserByEmail(String email) throws Exception;
	
	public List<Customer> getAllUsers() throws Exception;
	
	public Customer getCustomerUsingSP(int id) throws Exception;

}
