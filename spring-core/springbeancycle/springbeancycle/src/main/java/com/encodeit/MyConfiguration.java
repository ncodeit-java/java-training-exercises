package com.encodeit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfiguration {

	@Bean
	@Scope(value = "singleton")
	public Employee employeeBean() {
		return new Employee();
	}

	@Bean
	@Scope(value = "prototype")
	public EmployeePrototype getEmployeeBean() {
		return new EmployeePrototype();
	}
}
