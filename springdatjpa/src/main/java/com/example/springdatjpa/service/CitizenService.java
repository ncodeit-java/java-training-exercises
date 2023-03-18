package com.example.springdatjpa.service;

import com.example.springdatjpa.entity.oneToOne.bidirectional.Citizen;

public interface CitizenService {
	
	public int saveCitizen(Citizen citizen) throws Exception;
	
	public Citizen fetchCitizenById(int id) throws Exception;

}
