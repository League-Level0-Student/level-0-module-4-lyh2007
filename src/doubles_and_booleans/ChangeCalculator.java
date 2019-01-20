package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String Change = JOptionPane.showInputDialog("how many nickels do you have? ");
		// Convert their answer to an int using Integer.parseInt()
		int C = Integer.parseInt(Change);
		// Ask the user how many dimes they have, and convert their answer
		String Dimes = JOptionPane.showInputDialog("how many dimes do you have?");
		int D = Integer.parseInt(Dimes);
		// Ask the user how many quarters they have, and convert their answer
		String Quarters = JOptionPane.showInputDialog("how many quarters do you have?");
		int Q = Integer.parseInt(Quarters);
		// Calculate how much money the user has and save it in a double variable
		double money = 0.01 * C + 0.1 * D + 0.25 * Q;
		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, "you have $" + money);
		JOptionPane.showMessageDialog(null,
				"I made you a figurative sandwich.(you said to make you a sandwich, you didn't specify which kind. :3)");
	}
}
