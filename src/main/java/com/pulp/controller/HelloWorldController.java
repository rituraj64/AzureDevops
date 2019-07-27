package com.pulp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET) 
	public String registration() {
		//String message = "HELLO SPRING MVC HOW R U";
		return "Hello BOOT"; 
	}
}
