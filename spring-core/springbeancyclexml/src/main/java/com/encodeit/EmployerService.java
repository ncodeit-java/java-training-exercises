package com.encodeit;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class EmployerService implements InitializingBean, DisposableBean {

	private Employer employer;

	public Employer getEmployer() {
		return employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

	public EmployerService() {
		System.out.println("EmployerService no-args constructor called");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("EmployerService initializing to a value");
		if (employer.getEmployerName() == null) {
			employer.setEmployerName("EncodeIT");
		}
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("EmployerService Closing resources");
	}
}
