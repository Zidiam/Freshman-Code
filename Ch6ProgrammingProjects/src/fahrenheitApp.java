/*
 * fahrenheitApp.java -- A gui with multiple push-buttons
 * Jason Melnik
 * CSC 120
 * 11/5/2018
 */
import javax.swing.JFrame;
public class fahrenheitApp {
	public static void main(String [] args) {
		JFrame frame = new JFrame("Left and Right!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new fahrenheitPanel());
		frame.pack();
		frame.setVisible(true);
	}
}
