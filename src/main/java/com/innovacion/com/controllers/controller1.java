package com.innovacion.com.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class controller1 {
	
	
	@GetMapping
	public String saludo() {		
		return "Welcome, Friends!";
	}
	
	@GetMapping("/saludo2")
	public String saludo2() {		
		return "Welcome, Friends saludo 2!";
	}

}
