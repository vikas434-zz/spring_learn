package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.model.Welcome;

public class Main {

	public static void main(String[] args) {
		
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
		Welcome welcome = (Welcome) ctx.getBean("welcome");
		welcome.sayWelcome("Akshay Kumar ", " MI");
//		welcome.sayHi("Tom Cruise");
//		welcome.callMeOfWelcome();

	}

}
