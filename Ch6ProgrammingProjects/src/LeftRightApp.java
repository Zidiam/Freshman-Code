/*
 * LeftRightApp.java -- A gui with multiple push-buttons
 * Jason Melnik
 * CSC 120
 * 11/5/2018
 */
import javax.swing.JFrame;
public class LeftRightApp {
	public static void main(String [] args) {
		JFrame frame = new JFrame("Left and Right!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new LeftRightPanel());
		frame.pack();
		frame.setVisible(true);
	}
}
