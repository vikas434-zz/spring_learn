package com.model;

import org.springframework.stereotype.Component;

@Component("sa")
public class SavingAccount implements InterestCalculator {
	
	public SavingAccount(int duration, double roi) {
		this.duration = duration;
		this.roi = roi;
	}

	private int duration;
	
	private double roi;

	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getRoi() {
		return roi;
	}

	public void setRoi(double roi) {
		this.roi = roi;
	}

	@Override
	public double calculate(double amount) {
		return amount*(duration)/roi;
	}

	public SavingAccount() {
		System.out.println("Inside SA");
	}
	
}
