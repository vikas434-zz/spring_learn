package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aspect.WelcomeAspect;
import com.model.Welcome;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Welcome welcome = (Welcome) ctx.getBean("welcome");
		welcome.sayWelcome("Akshay Kumar ", " MI");

	}

}
