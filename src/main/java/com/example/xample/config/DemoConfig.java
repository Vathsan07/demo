package com.example.xample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.example.xample.first.mail.MailSender;
import com.example.xample.first.mail.MockMailSender;
import com.example.xample.first.mail.SmtpMailSender;

@Component
public class DemoConfig {
	
	@Bean
	@Profile("default")
	public MailSender mockMailSender() {
		return new MockMailSender();
	}

	@Bean
	@Profile("!dev")
	public MailSender smtpMailSender() {
		return new SmtpMailSender();
	}
	
}
