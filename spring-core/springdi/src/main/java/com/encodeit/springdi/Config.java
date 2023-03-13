package com.encodeit.springdi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = { "com.encodeit.springdi" })
public class Config {

	@Bean
	public MessagingService getMessageService() {
		//return new EmailService();
		//return new SmsService();
		return new TwitterService();
	}
}
