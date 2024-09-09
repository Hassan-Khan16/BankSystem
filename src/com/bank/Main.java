package com.bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Bank System");
		frame.setSize(600,450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setLayout(new FlowLayout());

		JLabel nameLabel = new JLabel("Enter Customer Name:");
		JTextField nameInput = new JTextField(15);
		JButton addButton = new JButton("Add Customer");

		JLabel resultLabel = new JLabel("");

		addButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				String customerName = nameInput.getText();
				resultLabel.setText("Customer Added: "+ customerName);
				nameInput.setText("");
			}
		});

		frame.add(nameLabel);
		frame.add(nameInput);
		frame.add(addButton);
		frame.add(resultLabel);
		frame.setVisible(true);
	}
}