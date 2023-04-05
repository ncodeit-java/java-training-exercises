package com.ncodeit.basicExamples.encapsulation;

public class Employee {

	private int empId;
	private String empName;
	private double salary;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		if(empId>0) {
			this.empId = empId;
		}
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
