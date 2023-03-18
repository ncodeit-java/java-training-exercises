package com.example.springdatjpa.service;

import com.example.springdatjpa.entity.oneToOne.bidirectional.Passport;


public interface PassportService {
	
	public void savePassport(Passport passport) throws Exception;
	
	public Passport fetchPassportById(int id) throws Exception;

}
