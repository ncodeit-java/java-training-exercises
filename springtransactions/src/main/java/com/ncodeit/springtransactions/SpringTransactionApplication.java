package com.ncodeit.springtransactions;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.ncodeit.springtransactions.domain.Person;
import com.ncodeit.springtransactions.service.AppService;



@SpringBootApplication
public class SpringTransactionApplication implements CommandLineRunner{
	
	@Autowired
	private AppService appService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringTransactionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Person p1=new Person();
		p1.setFirstName("P1");
		p1.setLastName("P1");
		p1.setEmail("p1@gmail.com");
		
		Person p2=new Person();
		p2.setFirstName("P2");
		p2.setLastName("P2");
		p2.setEmail("p2@gmail.com");
		
		List<Person> persons=Arrays.asList(p1,p2);
		
		//appService.savePersonsWithTransactionAnnotation(persons);
		appService.savePersonsWithDeclarativeTransaction(persons);
	}

}
