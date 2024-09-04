package com.bank;

public class BankAccount {
	private String accountNumber;
	private double balance;
	
	public BankAccount(String accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 0.0;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("Amount deposited: Rs" + amount);
		} else {
			System.out.println("Invalid deposit amount. ");
		}
	}
	public void withdraw(double amount) {
		if(amount > 0) {
			if(amount <= balance) {
				balance -= amount;
				System.out.println("Amount withdrawn: Rs" + amount);
			}
		} else {
			System.out.println("Invalid amount");
		}
	}
}