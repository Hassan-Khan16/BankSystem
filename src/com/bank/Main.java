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

		JLabel welcomeLabel = new JLabel("Welcome to the Bank");
		JButton demoButton = new JButton("Demo button");

		demoButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				welcomeLabel.setText("Button Clicked!");
			}
		});

		frame.add(welcomeLabel);
		frame.add(demoButton);

		frame.setVisible(true);
	}
}