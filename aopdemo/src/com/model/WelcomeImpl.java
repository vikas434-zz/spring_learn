package com.model;

public class WelcomeImpl implements Welcome {

	@Override
	public void sayWelcome(String name, String to) {
		System.out.println("Weclome "+name+ " to "+ to);
		
	}

}
