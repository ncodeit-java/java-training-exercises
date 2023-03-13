package com.ncodeit.springjdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ncodeit.springjdbc.dao.CusomerDao;
import com.ncodeit.springjdbc.domain.Customer;
import com.ncodeit.springjdbc.service.CustomerService;

@SpringBootApplication
public class SpringjdbcApplication implements CommandLineRunner{
	
	@Autowired
	private CustomerService userService;

	public static void main(String[] args) {
		SpringApplication.run(SpringjdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Customer user=new Customer();
		user.setFirstName("uf1");
		user.setLastName("ul1");
		user.setEmail("uf1@gmail.com");
		
		userService.saveUser(user);
		
		Customer u1=userService.getUser("1");
		System.out.println(u1.getEmail());
		
		int totalCount=userService.getTotalCount();
		System.out.println(totalCount);
		
		userService.deleteUser("3");

		int total=userService.getTotalCount();
		System.out.println(total);
		
		Customer user2=new Customer();
		user2.setFirstName("uf2");
		user2.setLastName("ul2");
		user2.setEmail("uf2@gmail.com");		
		
		userService.saveUser(user2);
		Customer u2=userService.getUserByEmail("uf2@gmail.com");
		System.out.println("first Name:"+u2.getFirstName());
		
		Customer user3=new Customer();
		user3.setFirstName("uf3");
		user3.setLastName("ul3");
		user3.setEmail("uf3@gmail.com");		
		userService.saveUser(user3);
		
		int tc=userService.getTotalCount();
		System.out.println(tc);
		
		List<Customer> users=userService.getAllUsers();
		System.out.println("total users:"+users.size());
		
		System.out.println("done");
		
		
		Customer customer=userService.getCustomerUsingSP(1);
		System.out.println("Customer first Name:"+customer.getFirstName());
	}

}
