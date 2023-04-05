package com.ncodeit.basicExamples.inheritance;

public class Employee extends Person {
	
	private int salary;

	public Employee() {
		super();
	}

	public Employee(int personId, String personName, String type) {
		super(personId, personName, type);
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void getSalaryDetails() {
		System.out.println("Employee with "+this.personId+" having a salary of "+this.salary);
	}
}
