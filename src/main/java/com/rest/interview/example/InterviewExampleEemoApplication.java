package com.rest.interview.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.rest.interview.example.di.OrderService;

@SpringBootApplication
public class InterviewExampleEemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(InterviewExampleEemoApplication.class, args);
	 OrderService orderService=	context.getBean("orderService",OrderService.class);
	  orderService.test();
	}

}
