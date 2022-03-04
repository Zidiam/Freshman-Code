import javax.swing.JFrame;

/*
 * Calculator.java -- Calculator
 * Jason Melnik
 * 11/5/2018
 */
import javax.swing.JFrame;
public class Calculator {
	public static void main(String [] args) {
		JFrame frame = new JFrame("Calculator!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new CalculatorPanel());
		frame.pack();
		frame.setVisible(true);
	}
}