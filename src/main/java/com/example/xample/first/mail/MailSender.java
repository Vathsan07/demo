package com.example.xample.first.mail;

public interface MailSender {
	
	void sendIt(String to, String subject, String body);
}
