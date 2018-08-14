package com.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import com.model.InterestCalculator;

public class CalculateService {
	
	private InterestCalculator ic;

	public InterestCalculator getIc() {
		return ic;
	}

	public void setIc(InterestCalculator ic) {
		this.ic = ic;
	}
	
	public double service(double amount) {
		return ic.calculate(amount);
	}

	public CalculateService() {
		System.out.println("Inside Calculate service");
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
