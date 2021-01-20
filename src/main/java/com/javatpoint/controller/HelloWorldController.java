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

	public void deleteMethod() {

		System.out.println("I am delete Method");
		System.out.println("I am delete again");

	}

	public String addMethod() {

		return "I am from add Method..........";

	}
	
	public String calculateTripDeails(){
		
		
		return "I will calculate TRIP details ";
	}
	
	public String getAddress(){
		
		return "I will bring address";
	}
	
	public String getReservation(){
		
		return "reservation demo";
	}
}
