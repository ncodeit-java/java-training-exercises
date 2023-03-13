package com.encodeit;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployerByName {
	
	private String employerName;

	@Autowired
	private Address address;
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
}
