package com.nissan.model;

import java.util.Date;

public class Customer {
	
	private String customerName;
	private Double accountBalance;
	private Date dateOfJoin;
	//default constructor
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	//parameterized constructor
	public Customer(String customerName, Double accountBalance, Date dateOfJoin) {
		super();
		this.customerName = customerName;
		this.accountBalance = accountBalance;
		this.dateOfJoin = dateOfJoin;
	}


	

	//setter and getter
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public Date getDateOfJoin() {
		return dateOfJoin;
	}
	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}
	
	//toString
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", accountBalance="
				+ accountBalance + ", dateOfJoin=" + dateOfJoin + "]";
	}
	
	
	
	

}
