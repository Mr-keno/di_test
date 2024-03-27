package com.hostmdy.di.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.hostmdy.di.service.GreetingService;

@Service
@Primary
public class PropertyGreetingService implements GreetingService {

	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return "Hello Property Injection...";
	}

}
