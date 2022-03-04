/*
 * PushCounter.java -- A basic GUI app using Javax.swing componens
 * Jason Melnik
 * CSC 120
 * 10/31/18
 */

import javax.swing.JFrame;

public class GreatDiceApp {
	public static void main(String [] args) {
		
		//this is seen everytime
		JFrame frame = new JFrame("Push Counter!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DiceThrowerPanel panel = new DiceThrowerPanel();
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);
		
	}
}
