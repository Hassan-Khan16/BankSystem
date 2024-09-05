package com.bank;

import javax.swing.*;
import java.awt.*;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Bank System");
		frame.setSize(600,450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setLayout(new FlowLayout());

		JLabel welcomeLabel = new JLabel("Welcome to the Bank");
		JButton demoButton = new JButton("Demo button");

		frame.add(welcomeLabel);
		frame.add(demoButton);

		frame.setVisible(true);
	}
}