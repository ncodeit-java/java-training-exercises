package com.example.springdatajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdatajpa.entity.oneToOne.bidirectional.Citizen;
import com.example.springdatajpa.service.CitizenService;

@RestController
public class CitizenController {
	
	@Autowired
	private CitizenService citizenService;

	@RequestMapping(value = "/citizen",method = RequestMethod.POST
			,consumes = MediaType.APPLICATION_JSON_VALUE
			)	
	public void createCitizen(@RequestBody Citizen citizen) {
		try {
			citizenService.saveCitizen(citizen);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value = "/citizen/{citizenId}",method = RequestMethod.GET
			,produces = MediaType.APPLICATION_JSON_VALUE
			)	
	public void createCitizen(@PathVariable("citizenId") int citizenId) {
		try {
			citizenService.fetchCitizenById(citizenId);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
