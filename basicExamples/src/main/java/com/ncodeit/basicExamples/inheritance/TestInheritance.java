package com.ncodeit.basicExamples.inheritance;

public class TestInheritance {

	public static void main(String[] args) {
		
		Employee emp1=new Employee(1,"emp1","Employee");
		emp1.setSalary(100);
		String employeeDetails=emp1.getPersonDetails();
		System.out.println(employeeDetails);
		emp1.getSalaryDetails();
		
		Customer cust1=new Customer(2, "cust1", "Customer");
		String customerDetails=cust1.getPersonDetails();
		System.out.println(customerDetails);

	}

}
