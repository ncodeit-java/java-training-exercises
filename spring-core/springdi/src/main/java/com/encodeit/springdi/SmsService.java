package com.encodeit.springdi;

public class SmsService implements MessagingService {

	@Override
	public boolean sendMessage(String message, String receiver) {
		System.out.println("Sms sent to "+receiver+ " with Message : "+message);
		return true;
	}

}
