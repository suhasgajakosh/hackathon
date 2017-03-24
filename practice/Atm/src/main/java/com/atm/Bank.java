package com.atm;

public class Bank {
	private Account[] accounts;

	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

	//initialize constructor
	public Bank(Account accounts[]){
	}

	//return the account for the corresponding account number
	public Account getAccount(int accountNum){
	
		return new Account(accountNum, 1234, 500);
	}
	

	//Add your code here
	
	public boolean authenticateUser(int pin, int accountNum) {
		
		return true;
	}
	
	public int getAvailableBalance() {
		
		return accounts[0].getCurrentBalance();
	}
	
	public void credit(int accountNum, int amount) {
		
		
	}
	
	public void debit(int accountNum, int amount) {
		
	}
}
