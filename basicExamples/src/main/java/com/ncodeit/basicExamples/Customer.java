package com.ncodeit.basicExamples;

public class Customer {
	
	private int customerId;
	private String customerName;
	private String address;
	
	
	public String getCustomerDetails() {
		return this.customerId+" "+this.customerName+" "+this.address;
	}
	
	// this - refers to current object
	public Customer(int custId, String custName, String address) {
		this.customerId=custId;
		this.customerName=custName;
		this.address=address;
	}

	public Customer() {
		super();
	}
	
	
}
