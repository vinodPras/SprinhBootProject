package com.rest.interview.example.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Component;

//@Component
@RestController
public class InterviewController {
	
	   @GetMapping("/")
	    public String getMessage1() {
	       return "Welcome to Aws elastic bean stack mesage";
	    }


}
