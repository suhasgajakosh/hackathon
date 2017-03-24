package com.atm;

public class Withdrawal extends Transaction {
	private int amount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	//initialize constructor
	public Withdrawal(int accountNum, Bank bankData,int amount) {
		super(accountNum, bankData);
		this.amount = amount;
		
	}

	//check if withdrawal possible
	public boolean isWithdrawalPossible(){
		
		return true;
	}
	@Override
	public void execute() {
		
	}

}
