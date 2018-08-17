package com.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class WelcomeAspect {
	
//	@Before("execution (void com.model.WelcomeImpl.*(..))")
//	public void callMeBefore(JoinPoint jp) {
//		System.out.println("I am called via Aspect before "+jp.getSignature().getName());
//	}
	
	@Around("execution (void com.model.WelcomeImpl.*(..))")
	public void callMeBefore(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("I am called via Aspect before "+jp.getSignature().getName());
		jp.proceed();
		System.out.println("Now after ");
	}
	
	
//	@After("execution (void com.model.WelcomeImpl.*(..))")
//	public void callMeAfter() {
//		System.out.println("I am called via Aspect and after ");
//	}

	
	

}
