package com.model;

import org.springframework.stereotype.Component;

@Component("welcome")
public class WelcomeImpl implements Welcome {

	@Override
	public void sayWelcome(String name, String to) {
		System.out.println("Weclome "+name+ " to "+ to);
		
	}

	@Override
	public void sayHi(String name) {
		System.out.println("Hi Mr. "+name);
	}

	@Override
	public void callMeOfWelcome() {
		System.out.println("This is just a call me function in welcome class");
	}

}
