package com.encodeit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean
	public EmployerBeanPostProcessor employerBeanPostProcessor() {
		return new EmployerBeanPostProcessor();
	}

	@Bean
	public Employer employer() {
		return new Employer(1, "EncodeIT");
	}
}
