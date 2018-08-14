package com.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.model.InterestCalculator;

//@Service("service")
public class CalculateService {
	
	public CalculateService(InterestCalculator ic) {
		this.ic = ic;
	}

	@Autowired
	@Qualifier("fda")
	private InterestCalculator ic;

	public InterestCalculator getIc() {
		return ic;
	}

	public void setIc(InterestCalculator ic) {
		this.ic = ic;
	}
	
	public double service(double amount) {
		System.out.println("Inside calculate service doing calculation");
		return ic.calculate(amount);
	}

	public CalculateService() {
		System.out.println("Inside Calculate service constructor");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Inside init method of calculate service");
	}
	
	@PreDestroy
	public void destroyCustom() {
		System.out.println("Inside destroy method of calculate service");
	}
	

}
