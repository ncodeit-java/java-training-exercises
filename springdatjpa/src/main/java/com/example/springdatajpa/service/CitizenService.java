package com.example.springdatajpa.service;

import com.example.springdatajpa.entity.oneToOne.bidirectional.Citizen;

public interface CitizenService {
	
	public int saveCitizen(Citizen citizen) throws Exception;
	
	public Citizen fetchCitizenById(int id) throws Exception;

}
