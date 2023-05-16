package com.example.springdatajpa.service;

import com.example.springdatajpa.entity.oneToOne.bidirectional.Passport;


public interface PassportService {
	
	public void savePassport(Passport passport) throws Exception;
	
	public Passport fetchPassportById(int id) throws Exception;

}
