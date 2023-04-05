package com.ncodeit.basicExamples.inheritance;

public class Person {
	
	protected int personId;
	private String personName;
	private String type;
	
	public Person() {
		super();
	}

	public Person(int personId, String personName, String type) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.type = type;
	}
	
	public String getPersonDetails() {
		return "Person Details: "+this.personId+" "+this.personName+" "+this.type;
	}

}
