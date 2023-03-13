package com.encodeit.springdi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		//MyEmployerFieldBasedInjection  myEmployerFieldBasedInjection = context.getBean(MyEmployerFieldBasedInjection.class);
		//myEmployerFieldBasedInjection.processMessage("Hi EncodeIT", "admin@encodeit.com");

		//MyEmployerConstructorBasedInjection myEmployerConstructorBasedInjection = context.getBean(MyEmployerConstructorBasedInjection.class);
		//myEmployerConstructorBasedInjection.processMessage("Hi EncodeIT", "Employer");
		
		MyEmployerSetterInjection myEmployerSetterInjection = context.getBean(MyEmployerSetterInjection.class);
		myEmployerSetterInjection.processMessage("Hi EncodeIT", "Employer");
		
		context.close();
	}
}
