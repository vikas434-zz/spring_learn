package com.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("fda")
public class FixedDeposit implements InterestCalculator {
	
	public FixedDeposit(int duration, double roi) {
		this.duration = duration;
		this.roi = roi;
	}

	private int duration;
	
	private double roi;
	
	public int getDuration() {
		return duration;
	}

	@Value(value="4")
	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getRoi() {
		return roi;
	}

	@Value(value="5.99")
	public void setRoi(double roi) {
		this.roi = roi;
	}

	@Override
	public double calculate(double amount) {
		return amount*(roi)/duration;
	}

	public FixedDeposit() {
		System.out.println("Inside FDA");
	}
	
	

}
