package com.ncodeit.json.json2object;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Person {
	
	private String firstName;
	private String lastName;
	
	@JsonGetter("firstName")
	public String getFirstName() {
		return firstName;
	}
	
	@JsonSetter("person_first_name")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@JsonGetter("lastName")
	public String getLastName() {
		return lastName;
	}
	
	@JsonSetter("person_last_name")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
