package com.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;

@Aspect
public class WelcomeAspectAnother implements Ordered {
	
	@Before("execution (void com.model.WelcomeImpl.*(..))")
	public void callMeBefore() {
		System.out.println("I am called via Aspect before from another");
	}

	@Override
	public int getOrder() {
		return 1;
	}
	

}
