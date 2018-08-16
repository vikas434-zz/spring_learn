package com.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;

@Aspect
public class WelcomeAspect implements Ordered {
	
	@Before("execution (void com.model.WelcomeImpl.*(..))")
	public void callMeBefore() {
		System.out.println("I am called via Aspect before");
	}
	
	@After("execution (void com.model.WelcomeImpl.*(..))")
	public void callMeAfter() {
		System.out.println("I am called via Aspect and after ");
	}

	@Override
	public int getOrder() {
		return 2;
	}
	

}
