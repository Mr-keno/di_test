package com.hostmdy.di.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.hostmdy.di.service.GreetingService;

@Controller
public class I18nGreetingController {
	
	private final GreetingService greetingService;

	public I18nGreetingController(@Qualifier("i18nGreetingBean") GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.greet();
	}

}
