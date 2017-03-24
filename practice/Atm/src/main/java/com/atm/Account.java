package com.atm;

public class Account {
	private int accountNumber;
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	private int pin;
	private int currentBalance;
	
	public int getCurrentBalance() {
		return currentBalance;
	}

	//initialize constructor
	public Account(int accountNumber,int pin,int currentBalance){
        this.accountNumber=accountNumber;
        this.pin=pin;
        this.currentBalance=currentBalance;
		
	}
	
	//Add your code here
	public boolean validatePin(int pin) {
		return true;
	}
	
	
	
	public void credit(int amount) {
		
	}
	
	public void debit(int amount) {
		
	}



	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public void setCurrentBalance(int currentBalance) {
		this.currentBalance = currentBalance;
	}  
}

