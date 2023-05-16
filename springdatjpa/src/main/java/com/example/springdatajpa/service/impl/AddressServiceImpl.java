package com.example.springdatajpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdatajpa.dao.AddressDao;
import com.example.springdatajpa.entity.unidirectional.Address;
import com.example.springdatajpa.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	private AddressDao addressDao;

	@Override
	public void createAddress(Address address) throws Exception {
		addressDao.save(address);
	}

}
