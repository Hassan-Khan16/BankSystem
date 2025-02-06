package com.bank;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JDialog;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Bank System");

        // Set the width and height of the frame
        frame.setSize(800, 600);

        // Close the program when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        
        JLabel nameLabel = new JLabel("Enter Customer Name: ");
        JTextField nameInput = new JTextField(15);
        JButton addButton = new JButton("Add Customer");
        JButton viewButton = new JButton("View All Customers");
        
        // Create a Label
        JLabel resultLabel = new JLabel("");
        
        addButton.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		String customerName = nameInput.getText();
        		resultLabel.setText("Customer Added: " + customerName);
        		nameInput.setText("");
        	}
        });
        
        viewButton.addActionListener(new ActionListener(){
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		JDialog dialog = new JDialog(frame, "Customer List", true);
        		dialog.setSize(300,200);
        		dialog.setLayout(new FlowLayout());
        		JLabel customerLabel = new JLabel("Customer: John Doe");
        		dialog.add(customerLabel);
        		dialog.setVisible(true);
        	}
        });
        
        // Call Label and button
        frame.add(nameLabel);
        frame.add(nameInput);
        frame.add(addButton);
        frame.add(viewButton);
        frame.add(resultLabel);
        
        // Make the frame visible
        frame.setVisible(true);
		
	}
}