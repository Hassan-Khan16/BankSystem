package com.bank;

public class BankAccount {
	private double accountNumber;
	private double balance;
	
	public BankAccount(double accountNumber) {
		this.accountNumber = accountNumber;
		this.balance = 0.0;
	}
	
	public double getAccountNumber() {
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