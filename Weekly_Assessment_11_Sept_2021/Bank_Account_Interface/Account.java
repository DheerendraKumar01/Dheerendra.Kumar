package com.Bank_Account_Interface;


// class Account  ( Parent class)
public class Account {
	
	public String coustomerName;
	public String accountNumber;
	double balance;
	
	
		
//constructor having 3 parameters
	
	public Account(String coustomerName, String accountNumber, double balance) {
		super();
		this.coustomerName = coustomerName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		
		System.out.println("Customer Name   : "+coustomerName);
		System.out.println("Account Number  : "+accountNumber);
		System.out.println("Account Balance : "+balance);

	}
	
	
	
	/// setter and Getter methods
	
	public String getCoustomerName() {
		return coustomerName;
	}
	public void setCoustomerName(String coustomerName) {
		this.coustomerName = coustomerName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

}


