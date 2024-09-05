package com.bank;

import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void clearScreen() {
        for (int i = 0; i < 50; i++) { // print 50 blank lines
            System.out.println();
        }
    }
	
	public static void pauseForKey(Scanner scanner) {
        System.out.println("\nPress any key to continue...");
        scanner.next(); // Wait for the user to press Enter
    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Bank bank = new Bank();
		
		while(true){
			System.out.println("\nBank Account Management System");
            System.out.println("1. Add Customer");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. List Customers");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
            	case 1:
            		System.out.print("Enter customer name: ");
            		String name = scanner.next();
            		System.out.print("Enter account number: ");
            		String accountNumber = scanner.next();
            		Customer customer = new Customer(name, accountNumber);
            		bank.addCustomer(customer);
            		pauseForKey(scanner); 
            		break;
            	case 2:
            		System.out.print("Enter customer name: ");
            		name = scanner.next();
            		customer = bank.findCustomer(name);
            		if(customer != null) {
            			System.out.print("Enter deposit amount: ");
            			double amount = scanner.nextDouble();
            			customer.getBankAccount().deposit(amount);
            		} else {
            			System.out.println("Customer not found.");
            		}
            		pauseForKey(scanner); 
            		break;
            	case 3:
            		System.out.print("Enter customer name: ");
            		name = scanner.next();
            		customer = bank.findCustomer(name);
            		if(customer != null) {
            			System.out.print("Enter withdrawal amount: ");
            			double amount = scanner.nextDouble();
            			customer.getBankAccount().withdraw(amount);
            		} else {
            			System.out.println("Customer not found.");
            		}
            		pauseForKey(scanner); 
            		break;
            	case 4:
                    System.out.print("Enter customer name: ");
                    name = scanner.next();
                    customer = bank.findCustomer(name);
                    if ( customer != null ) {
                    	System.out.println("Balance: Rs" + customer.getBankAccount().getBalance());
                    } else {
                    	System.out.println("Customer not found. ");
                    }
                    pauseForKey(scanner); 
                    break;
            	case 5:
            		List<Customer> customers =  bank.getAllCustomers();
            		if(customers.isEmpty()) {
            			System.out.println("No customers available. ");
            		} else {
            			System.out.println("List of Customers: ");
            			for(Customer c :customers) {
            				System.out.println("Customer Name: " + c.getName() + " || Account Number: "+ c.getBankAccount().getAccountNumber());
            			}
            		}
            		pauseForKey(scanner); 
            		break;
            	case 6:
            		System.out.println("Exiting...");
            		scanner.close();
            		return;
            	default:
            		System.out.println("Invalid option. Please try again.");
            		pauseForKey(scanner); 
            		break;
            }
            clearScreen();
		}
	}
}