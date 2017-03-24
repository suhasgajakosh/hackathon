package com.atm;

public abstract class Transaction {

	private int accountNum;
	private Bank bankData;
	
	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

	public Bank getBankData() {
		return bankData;
	}

	public void setBankData(Bank bankData) {
		this.bankData = bankData;
	}

	//initilize constructor
	public Transaction(int accountNum,Bank bankData){
		
	}
	
	public int getAccountNumber() {
		
		return 0;
	}
	
	
	
	abstract public void execute();
	

}
