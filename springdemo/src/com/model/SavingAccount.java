package com.model;

import org.springframework.beans.factory.annotation.Required;

public class SavingAccount implements InterestCalculator {
	
	private int duration;
	
	private double roi;
	
	

	public int getDuration() {
		return duration;
	}


	@Required
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
