package com.javatpoint.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class HelloWorldController {
	@GetMapping("/hello")
	public String hello() {

		return "Hello UNITED STATES OF AMERICA";
		
	}
	
	public String helloIndia() {
		
		return "Hello India!!";
	}
	
	
	public boolean validateSouthAfricanId(){
		
		return true;
	}
	
	public void validateGreenCard(){
		
	}
	
	//conflict method
	public void bookReservation() {
		
		
	}
	
	
	public void bookRCIReservation() {
		
		
	}
	
	
}
