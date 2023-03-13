package com.encodeit;

import org.springframework.stereotype.Component;

@Component
public class CoreComponentBean {

	public CoreComponentBean() {
		System.out.println("Core Component Bean : Constructor");
	}

	public void getComponentBean(){
        System.out.println("Core Component Bean");
    }
}
