package com.canddella.entity;

public abstract class CurrentAccount extends Account {

	private String gstNo;

	public CurrentAccount(String accountNumber, String gstNo) {
		super(accountNumber);
		this.gstNo = gstNo;
	}

	public String getGstNo() {
		return gstNo;
	}

	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}

}
