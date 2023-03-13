package com.encodeit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class App {
	public static void main(String[] args) {

		// Creating Bean using @Bean and @Configuration
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(MyConfiguration.class);
		context.refresh();

		CoreBean coreBean = context.getBean(CoreBean.class);
		coreBean.printBean();

		context.close();

		// Creating Bean using @Component 
		
		/*
		 * AnnotationConfigApplicationContext context = new
		 * AnnotationConfigApplicationContext(); context.scan("com.encodeit");
		 * context.refresh();
		 * 
		 * CoreComponentBean coreComponentBean =
		 * context.getBean(CoreComponentBean.class);
		 * coreComponentBean.getComponentBean(); context.close();
		 */

	}
}
