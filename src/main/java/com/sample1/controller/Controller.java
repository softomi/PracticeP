package com.sample1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample1.service.ServiceDemo;

@RestController
public class Controller {

	
	@Autowired
	ServiceDemo ser;
	
	@GetMapping("/cities")
	public String getCities() {
		return ser.cities();
	}
	

	
}
