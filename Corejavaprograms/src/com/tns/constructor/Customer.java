package com.tns.constructor;
//program to demonstrate constructors
public class Customer {
	private int customerId;
	private String customercity;
	private String customerName;
	//default constructor
	public Customer() {
		System.out.println("Default Constructor");
		
	}
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomercity() {
		return customercity;
	}
	public void setCustomercity(String customercity) {
		this.customercity = customercity;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customercity=" + customercity + ", customerName="
				+ customerName + "]";
	}
	
	

}
