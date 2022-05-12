package com.qa.week3.day4.encapsulation;

public class BankDetails {
	private String accountNum;
	private String name;
	private float balance;
	private String passWord;

	public BankDetails(String accountNum, String name, float balance, String passWord) {
		super();
		this.accountNum = accountNum;
		this.name = name;
		this.balance = balance;
		this.passWord = passWord;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getName(String c) {
		if (c==this.passWord) {
			return name;
		}else {
			return "incorrect password";
		}
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public String setBalance(float balance) {
		if (balance >= 10000f) {
			return "ERROR set too high";

		} else {
			this.balance = balance;
			return "new balence has been set to £" + this.balance ;
		}
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

}
