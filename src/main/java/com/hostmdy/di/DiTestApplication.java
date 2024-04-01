package com.hostmdy.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hostmdy.di.controller.I18nGreetingController;

@SpringBootApplication
public class DiTestApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DiTestApplication.class, args);

		I18nGreetingController controller = context.getBean(I18nGreetingController.class);
		System.out.println(controller.sayHello());
	}

}
