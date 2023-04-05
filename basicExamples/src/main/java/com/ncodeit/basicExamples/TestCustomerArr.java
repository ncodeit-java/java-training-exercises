package com.ncodeit.basicExamples;

public class TestCustomerArr {

	public static void main(String[] args) {
		Customer cust1=new Customer(1,"John","US");
		Customer cust2=new Customer(2,"Mike","US");
		Customer cust3=new Customer(3,"Khan","India");
		
		//Customer[] custarray= {cust1,cust2,cust3};
		
		Customer[] custarray=new Customer[3];
		custarray[0]=cust1;
		custarray[1]=cust2;
		custarray[2]=cust3;
		
		for(int i=0;i<custarray.length;i++) {
			Customer cust= custarray[i];
			System.out.println(cust.getCustomerDetails());
			//System.out.println(custarray[i].getCustomerDetails());
		}
	}

}
