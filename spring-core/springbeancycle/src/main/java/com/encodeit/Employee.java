package com.encodeit;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {

	private String name;
	
	public Employee() {
		System.out.println("Employee instance created");
	}

	@PostConstruct
	private void init() {
		System.out.println("Employee Singleton : Verifying Resources Post Construction");
	}

	@PreDestroy
	private void shutdown() {
		System.out.println("Employee : Shutdown All Resources Pre Destroying");
	}

	public void close() {
		System.out.println("Employee : Closing All Resources");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmployeeName() {
		return "Employee Singleton : Employee Name is Raghavendra";
	}
	
}
