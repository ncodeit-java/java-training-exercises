package com.encodeit.springdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyEmployerFieldBasedInjection {

	// field-based dependency injection
	@Autowired
	private MessagingService messagingService;

	public boolean processMessage(String msg, String rec) {
		return this.messagingService.sendMessage(msg, rec);
	}
}
