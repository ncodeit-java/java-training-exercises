package com.encodeit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);

		// Creating singleton bean
		// Employee employeeOne = context.getBean(Employee.class);
		// System.out.println("Hello : " + employeeOne.getEmployeeName()+ " with hashcode : " + employeeOne.hashCode());
		 
		// Employee employeeTwo = context.getBean(Employee.class);
		// System.out.println("Hello : " + employeeTwo.getEmployeeName()+ " with hashcode : " + employeeOne.hashCode());
		 

		// Creating prototype bean
		EmployeePrototype employeePrototypeOne = context.getBean(EmployeePrototype.class);
		System.out.println("Hello : " + employeePrototypeOne.getEmployeePrototypeName()+ " with hashcode : " + employeePrototypeOne.hashCode());
		
		EmployeePrototype employeePrototypeTwo = context.getBean(EmployeePrototype.class);
		System.out.println("Hello : " + employeePrototypeTwo.getEmployeePrototypeName()+ " with hashcode : " + employeePrototypeTwo.hashCode());
		
		context.close(); // predestroy will get called when the bean instance is getting removed from context
	}
}
