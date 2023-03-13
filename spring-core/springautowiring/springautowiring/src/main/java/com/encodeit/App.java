package com.encodeit;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		/*
		 * Employer employer = (Employer) context.getBean("employer");
		 * System.out.println("Employer Name : "+employer.getEmployerName());
		 * System.out.println("City : "+employer.getAddress().getCity());
		 * System.out.println("State : "+employer.getAddress().getState());
		 */
		
		Employer employerByName = (Employer) context.getBean("employerByName");
		System.out.println("Autowire ByName");
		System.out.println("Employer Name : "+employerByName.getEmployerName());
		System.out.println("City : "+employerByName.getAddress().getCity());
		System.out.println("State : "+employerByName.getAddress().getState());
		
		System.out.println("Autowire ByType");
		EmployerByType employerByType = (EmployerByType) context.getBean("employerByType");
		System.out.println("Employer Name : "+employerByType.getEmployerName());
		System.out.println("City : "+employerByType.getAddress().getCity());
		System.out.println("State : "+employerByType.getAddress().getState());
		
		System.out.println("Autowire usingConstructor");
		EmployerByConstructor employerByConstructor = (EmployerByConstructor) context.getBean("employerByConstructor");
		System.out.println("Employer Name : "+employerByConstructor.getEmployerName());
		System.out.println("City : "+employerByConstructor.getAddress().getCity());
		System.out.println("State : "+employerByConstructor.getAddress().getState());
		
		context.close();
	}
}
