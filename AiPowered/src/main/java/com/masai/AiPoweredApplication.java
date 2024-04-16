package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.masai.Service.EmailSenderService;

@SpringBootApplication

public class AiPoweredApplication {
	@Autowired
	private EmailSenderService service;
	public static void main(String[] args) {
		SpringApplication.run(AiPoweredApplication.class, args);
	}
	@EventListener(ApplicationReadyEvent.class)
	public void SendMail() {
		service.sendEmail("ashishbhagat330@gmail.com", "Hello", "How are You");
	}

}
