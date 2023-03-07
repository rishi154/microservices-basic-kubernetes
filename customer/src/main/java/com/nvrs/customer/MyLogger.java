package com.nvrs.customer;

public class MyLogger {
	private String functionality;
	private float processingTime;
	public String getFunctionality() {
		return functionality;
	}
	public void setFunctionality(String functionality) {
		this.functionality = functionality;
	}
	public float getProcessingTime() {
		return processingTime;
	}
	public void setProcessingTime(float processingTime) {
		this.processingTime = processingTime;
	}
	public MyLogger(String functionality, float processingTime) {
		super();
		this.functionality = functionality;
		this.processingTime = processingTime;
	}
	
	
	
}
