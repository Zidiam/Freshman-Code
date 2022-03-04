/*
 * Project6_4.java -- Converting Fahrenheit into Celcius GUI
 * Jason Melnik
 * CSC 120
 * 11/07/2018
 */
import javax.swing.JFrame;
public class Project6_4 {
	public static void main(String [] args){
		JFrame frame = new JFrame("Fahrenheit Conversion");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new fahrenheitPanel());
		frame.pack();
		frame.setVisible(true);
	}
}
