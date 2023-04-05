package com.ncodeit.basicExamples;

public class TestCustomer {

	public static void main(String[] args) {
		
		Customer cust1=new Customer(1,"John","US");
		Customer cust2=new Customer(2,"Mike","US");
		Customer cust3=new Customer(3,"Khan","India");
		
		String custDetails1=cust1.getCustomerDetails();
		System.out.println("Customer details :"+custDetails1);
		
		String custDetails2=cust2.getCustomerDetails();
		System.out.println("Customer details :"+custDetails2);		
	}

}
