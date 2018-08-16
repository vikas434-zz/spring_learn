package com.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class WelcomeAspect {
	
	@Before("execution (void com.model.WelcomeImpl.callMeOfWelcome(..))")
	public void callMeBefore() {
		System.out.println("I am called via Aspect ");
	}

}
