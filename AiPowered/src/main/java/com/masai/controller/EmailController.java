package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Service.EmailSenderService;

@RestController
public class EmailController {
	@Autowired
	private EmailSenderService service;
	@GetMapping("/")
	public void SendMail() {
		service.sendEmail("ashishbhagat330@gmail.com", "Hello", "How are You");
	}

}
