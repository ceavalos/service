package com.innovacion.com.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class controller1 {
	
	
	@GetMapping
	public String saludo() {		
		return "Este es un cambio";
	}
	
	@GetMapping("/saludo2")
	public String saludo2() {		
		return "Hola... este es el saludo2... !!!";
	}

}
