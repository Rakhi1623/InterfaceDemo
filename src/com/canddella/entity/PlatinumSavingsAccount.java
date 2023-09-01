package com.canddella.entity;

public class PlatinumSavingsAccount extends SavingsAccount implements Platinum {

	public PlatinumSavingsAccount(String accountNumber, String gstNo) {
		super(accountNumber, gstNo);

	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		
		System.out.println("Opening Platinum Savings Account");
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
		System.out.println("Closing Platinum Savings Account");
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Withdrawing Platinum Savings Account");
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Depositing Platinum Savings Account");
		
	}

	@Override
	public void getDiscount() {
		// TODO Auto-generated method stub
		System.out.println("get Discount");
	}

	@Override
	public void getCard() {
		// TODO Auto-generated method stub
		System.out.println("get Card");
	}

}
