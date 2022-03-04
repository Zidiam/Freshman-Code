/*
 * Project6_3.java -- A program that can increment or decrement a value by 1
 * Jason Melnik
 * CSC 120
 * 11/07/2018
 */
import javax.swing.JFrame;
public class Project6_3 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Increment or Decrement!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new IncorDecPanel());
		frame.pack();
		frame.setVisible(true);
	}
}
