package com.hostmdy.di.controller;

import com.hostmdy.di.service.GreetingService;


public class GreetingController {
	
	private final GreetingService greetingService;

	public GreetingController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.greet();
	}

}
