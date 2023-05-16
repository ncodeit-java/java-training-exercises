package com.example.springdatajpa;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springdatajpa.entity.unidirectional.Address;
import com.example.springdatajpa.entity.unidirectional.Customer;
import com.example.springdatajpa.service.AddressService;
import com.example.springdatajpa.service.CustomerService;

//@SpringBootApplication
public class EntityMappingsApplication implements CommandLineRunner{

	@Autowired
	private CustomerService userService;
	
	@Autowired
	private AddressService addressService;	
	
	public static void main(String[] args) {
		SpringApplication.run(EntityMappingsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//OneToOne mapping
		/*Address address=new Address("st1", "cy1");
		Customer user=new Customer("f1","l1",address);
		userService.createUser(user);
		
		Customer f1User=userService.findUser("f1");
		System.out.println("LastName: "+f1User.getLastName());*/
		
		//OneToMany mapping
		/*Address address1=new Address("st1", "cy1");
		Address address2=new Address("st2", "cy2");
		List<Address> addresses=Arrays.asList(address1,address2);
		Customer cust=new Customer("f1","l1",addresses);
		userService.createUser(cust);
		
		Customer f1User=userService.findUser("f1");
		System.out.println("LastName: "+f1User.getLastName());
		System.out.println("City: "+f1User.getAddresses());*/
		
		Address address1=new Address("st1", "cy1");
		//Address address2=new Address("st2", "cy2");
		/*Address address3=new Address("st3", "cy2");
		List<Address> addresses1=Arrays.asList(address1,address2);	
		List<Address> addresses2=Arrays.asList(address2,address3);	
		*/
		Customer c1=new Customer("c1","l1",Arrays.asList(address1));
		
		Customer c2=new Customer("c2","l1",Arrays.asList(address1));
		
		List<Customer> customers1=Arrays.asList(c1,c2);
		address1.setCustomers(customers1);
		
		userService.createCustomer(c1);
		userService.createCustomer(c2);
		System.out.println("done");
	}
	
	
}
