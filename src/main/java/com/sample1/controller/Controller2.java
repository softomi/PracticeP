package com.sample1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample1.service.ServiceDemo2;

@RestController
public class Controller2 {

	@Autowired
	ServiceDemo2 ser;
	
	@GetMapping("/country")
	public String getCountry() {
		return ser.countries();
	}

}
