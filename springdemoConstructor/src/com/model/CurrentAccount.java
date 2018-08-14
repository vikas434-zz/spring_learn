package com.model;

public class CurrentAccount implements InterestCalculator {
	
	public CurrentAccount(int duration, double roi) {
		super();
		this.duration = duration;
		this.roi = roi;
	}



	private int duration;
	
	private double roi;
	
	

	public CurrentAccount() {
		System.out.println("Inside the Current account");
	}



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
		return (amount+(roi)/duration)*10;
	}

}
