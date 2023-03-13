package com.encodeit.springdi;

public class EmailService implements MessagingService {

	@Override
	public boolean sendMessage(String message, String receiver) {
		System.out.println("Email sent to "+receiver+ " with Message : "+message);
		return true;
	}

}
