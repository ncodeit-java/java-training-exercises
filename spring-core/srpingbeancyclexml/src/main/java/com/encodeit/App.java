package com.encodeit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

		System.out.println("Spring Context initialized");

		EmployerService employerService = ctx.getBean("employerService", EmployerService.class);

		System.out.println("EmployerService Bean retrieved from Spring Context");

		System.out.println("Employer Name=" + employerService.getEmployer().getEmployerName());

		// MyEmployerService myEmployerService = ctx.getBean("myEmployerService",
		// MyEmployerService.class);

		// System.out.println("MyEmployerService Bean retrieved from Spring Context");

		// System.out.println("My Employer Name="
		// +myEmployerService.getEmployer().getEmployerName());

		ctx.close();

		System.out.println("Spring Context Closed");
	}
}
