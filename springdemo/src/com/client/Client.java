package com.client;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.CalculateService;

public class Client {

	private static ConfigurableApplicationContext ctx;

	public static void main(String[] args) {
		
		ctx = new ClassPathXmlApplicationContext("beans.xml");
		// Usage phase.
		CalculateService cs = (CalculateService) ctx.getBean("service");
//		CalculateService cs2 = (CalculateService) ctx.getBean("service");
//		System.out.println(cs.hashCode());
//		System.out.println(cs2.hashCode());
		System.out.println(cs.service(12345));
		ctx.close();
		

	}

}
