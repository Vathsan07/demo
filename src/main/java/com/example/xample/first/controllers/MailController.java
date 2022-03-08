package com.example.xample.first.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.xample.first.mail.MailSender;

@RestController
public class MailController {

//	@Autowired
	private MailSender mailSender;
	
	@Value("${app.name}")
	private String name;
	
	@Autowired
	public MailController(MailSender mockMailSender) {
		this.mailSender=mockMailSender;
	}
	
	//@Controller -> MVC 

	@GetMapping("/mail")
	public String mail() {

		System.out.println(name);
		mailSender.sendIt("Vathsan@gmail.com", "Leave Communication", "On Sick Leave today");
		return "MailSent";

	}
}
//MailSent.jsp