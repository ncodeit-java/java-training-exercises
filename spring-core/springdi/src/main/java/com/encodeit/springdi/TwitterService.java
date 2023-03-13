package com.encodeit.springdi;

public class TwitterService implements MessagingService {

	@Override
	public boolean sendMessage(String message, String receiver) {
		System.out.println("Twitter message sent to "+receiver+ " with Message : "+message);
		return true;
	}

}
