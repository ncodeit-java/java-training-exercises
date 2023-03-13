package com.ncodeit.springjdbc.domain;

public class Customer {
	
	private String customerId;
	private String firstName;
	private String lastName;
	private String email;
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String userId) {
		this.customerId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
