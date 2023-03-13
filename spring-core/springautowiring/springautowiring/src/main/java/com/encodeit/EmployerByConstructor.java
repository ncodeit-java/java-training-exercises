package com.encodeit;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployerByConstructor {
	
	private String employerName;

	private Address address;
	
	@Autowired
	public EmployerByConstructor (Address address, String employerName) {
		this.address = address;
		this.employerName = employerName;
	}

	public String getEmployerName() {
		return employerName;
	}

	public Address getAddress() {
		return address;
	}
	
}
