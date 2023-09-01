package com.canddella.entity;

public class PlatinumCurrentAccount extends CurrentAccount implements Platinum{

	public PlatinumCurrentAccount(String accountNumber, String rateOfInterest) {
		super(accountNumber, rateOfInterest);

	}

	@Override
	public void open() {
		
		System.out.println("Opening Platinum Current Account");
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Closing Platinum Current Account");
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Withdrawing from Platinum Current Account");
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
		System.out.println("Depositijng into Platinum Current Account");
		
	}

	public void getDiscount() {
		// TODO Auto-generated method stub
		System.out.println("get Discount");
	}

	public void getCard() {
		// TODO Auto-generated method stub
		System.out.println("get Card");
	}

}
