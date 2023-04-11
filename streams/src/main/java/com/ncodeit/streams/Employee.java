package com.ncodeit.streams;

public class Employee {

	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double d) {
		super();
		this.id = id;
		this.name = name;
		this.salary = d;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double salaryIncrement(double increment) {
		return this.salary + increment;
	}

}
