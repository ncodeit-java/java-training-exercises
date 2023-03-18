package com.example.springdatjpa.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdatjpa.dao.PassportDao;
import com.example.springdatjpa.entity.oneToOne.bidirectional.Passport;
import com.example.springdatjpa.service.PassportService;

@Service
public class PassportServiceImpl implements PassportService {
	
	@Autowired
	private PassportDao passportDao;

	@Override
	public void savePassport(Passport passport) throws Exception {
		passportDao.save(passport);
	}

	@Override
	public Passport fetchPassportById(int id) throws Exception {
		 Optional<Passport> optPassport= passportDao.findById(id);
		 if(optPassport.isPresent()){
			 return optPassport.get();
		 }
		 return null;
	}

}
