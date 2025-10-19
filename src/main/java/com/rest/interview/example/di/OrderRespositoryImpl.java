package com.rest.interview.example.di;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRespositoryImpl implements OrderRespository {

	@Override
	public void saveOrder() {
		System.out.println("method executed" );
		
	}

}
