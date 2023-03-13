package com.encodeit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackageClasses = CoreBean.class)
public class MyConfiguration {

	@Bean
	@Scope(value = "singleton")
	public CoreBean coreBean() {
		return new CoreBean();
	}

}
