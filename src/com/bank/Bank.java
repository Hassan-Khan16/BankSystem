package com.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private List<Customer> customers;
	
	public Bank() {
		this.customers = new ArrayList<>();
	}
	
	public void addCustomer(Customer customer) {
		customers.add(customer);
		System.out.println("Customer " + customer.getName() + " added.");
	}
	
	public Customer findCustomer(String name) {
		for(Customer customer : customers) {
			if(customer.getName().equalsIgnoreCase(name)) {
				return customer;
			}
		}
		return null;
	}
}