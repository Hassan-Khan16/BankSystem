package com.bank;

public class Customer {
	private String name;
	private BankAccount bankAccount;
	
	public Customer(String name, String accountNumber) {
		this.name = name;
		this.bankAccount = new BankAccount(accountNumber);
	}
	
	public String getName() {
		return name;
	}
	
	public BankAccount getBankAccount() {
		return bankAccount;
	}
}