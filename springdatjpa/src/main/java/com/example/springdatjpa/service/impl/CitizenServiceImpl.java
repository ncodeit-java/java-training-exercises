package com.example.springdatjpa.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdatjpa.dao.CitizenDao;
import com.example.springdatjpa.entity.oneToOne.bidirectional.Citizen;
import com.example.springdatjpa.service.CitizenService;

@Service
public class CitizenServiceImpl implements CitizenService {
	
	@Autowired
	private CitizenDao citizenDao;	

	@Override
	public int saveCitizen(Citizen citizen) throws Exception {
		 Citizen c=citizenDao.save(citizen);
		 return c.getCitizenId();
	}

	@Override
	public Citizen fetchCitizenById(int id) throws Exception {
		 Optional<Citizen> optCitizen= citizenDao.findById(id);
		 if(optCitizen.isPresent()){
			 return optCitizen.get();
		 }
		 return null;

	}

}
