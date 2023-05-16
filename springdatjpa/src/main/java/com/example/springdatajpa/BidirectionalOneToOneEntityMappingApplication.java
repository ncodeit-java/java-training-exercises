package com.example.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springdatajpa.entity.oneToOne.bidirectional.Citizen;
import com.example.springdatajpa.entity.oneToOne.bidirectional.Passport;
import com.example.springdatajpa.service.CitizenService;
import com.example.springdatajpa.service.PassportService;

@SpringBootApplication
public class BidirectionalOneToOneEntityMappingApplication implements CommandLineRunner{
	
	@Autowired
	private CitizenService citizenService;	
	
	@Autowired
	private PassportService passportService;	

	public static void main(String[] args) {
		SpringApplication.run(BidirectionalOneToOneEntityMappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Citizen citizen=new Citizen();
		citizen.setFirstName("citizef1");
		citizen.setLastName("citizel1");
		
		Passport passport=new Passport();
		passport.setPassportNumber("12345");
			
		citizen.setPassport(passport);
		passport.setCitizen(citizen);
		int citizenId=citizenService.saveCitizen(citizen);
		//passportService.savePassport(passport);
		System.out.println("citizen saved ");
		
		Citizen citizen2=citizenService.fetchCitizenById(citizenId);
		System.out.println("citizen first name: "+citizen2.getFirstName());
		System.out.println("Passport Number: "+citizen2.getPassport().getPassportNumber());
		
	}

}
