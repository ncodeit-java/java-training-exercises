package com.encodeit;

public class MyEmployerService {

	private Employer employer;

	public Employer getEmployer() {
		return employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}
	
	public MyEmployerService(){
		System.out.println("MyEmployerService no-args constructor called");
	}

	//pre-destroy method
	public void destroy() throws Exception {
		System.out.println("MyEmployerService Closing resources");
	}

	//post-init method
	public void init() throws Exception {
		System.out.println("MyEmployerService initializing to dummy value");
		if(employer.getEmployerName() == null){
			employer.setEmployerName("EncodeIT");
		}
	}
}
