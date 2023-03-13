package com.encodeit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		Employer employer = context.getBean(Employer.class);

		System.out.println("New Employer : "+employer.getName());
		
		context.close();
	
	}
}
