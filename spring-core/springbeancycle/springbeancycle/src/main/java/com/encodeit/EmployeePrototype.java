package com.encodeit;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class EmployeePrototype {

	private String name;
	
	public EmployeePrototype() {
		System.out.println("Employee Prototype instance created");
	}

	@PostConstruct
	private void init() {
		System.out.println("Employee Prototype : Verifying Resources post construction");
	}

	@PreDestroy
	private void shutdown() {
		System.out.println("Employee Prototype : Shutdown All Resources pre destroying");
	}

	public void close() {
		System.out.println("Employee Prototype : Closing All Resources");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmployeePrototypeName() {
		return "Employee Prototype :  Employee Name is Raghavendra";
	}
	
}
