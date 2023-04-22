package com.encodeit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		// Creating Bean using xml based file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		CoreBean coreBean = (CoreBean) context.getBean("createBean");
		coreBean.printBean();
		
		context.close();
	}
}
