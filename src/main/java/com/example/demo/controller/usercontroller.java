package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class usercontroller {
	
	
	@GetMapping("/welcome")
	public String display() {
		return "hello Using azure Functionality";
	}
}
