package com.masai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "Hello Home";
	}
	
	@GetMapping("/secured")
	public String Secured() {
		return "Hello Secured";
	}

}
