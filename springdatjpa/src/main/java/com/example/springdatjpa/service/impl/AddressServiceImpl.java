package com.example.springdatjpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdatjpa.dao.AddressDao;
import com.example.springdatjpa.entity.unidirectional.Address;
import com.example.springdatjpa.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	private AddressDao addressDao;

	@Override
	public void createAddress(Address address) throws Exception {
		addressDao.save(address);
	}

}
