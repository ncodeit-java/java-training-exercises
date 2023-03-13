package com.encodeit.springdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyEmployerSetterInjection {

	private MessagingService messagingService;

	// setter-based dependency injection
	@Autowired
	public void setService(MessagingService messagingService){
		this.messagingService=messagingService;
	}

	public boolean processMessage(String msg, String rec) {
		return this.messagingService.sendMessage(msg, rec);
	}
}
