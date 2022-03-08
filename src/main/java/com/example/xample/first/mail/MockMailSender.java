package com.example.xample.first.mail;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
public class MockMailSender implements MailSender{
	private static Log log = LogFactory.getLog(SmtpMailSender.class);

	@Override
	public void sendIt(String to, String subject, String body)  {

		log.info("Sending Mock mail ");
		log.info("To " + to);
		log.info("Subject:" + subject);
		log.info("Body:"+body);

	}

}

//mockMailSender