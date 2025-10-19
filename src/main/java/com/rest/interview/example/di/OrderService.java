package com.rest.interview.example.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class OrderService {
	
	@Autowired
	OrderRespository orderRespository;
	
	public void test() {
		orderRespository.saveOrder();
  }
	
	

}
