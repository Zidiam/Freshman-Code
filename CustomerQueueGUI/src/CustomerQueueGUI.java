/*
 * CustomerQueueGUI.java -- Displays a window that can allow you to add a customer to a queue
 * Jason Melnik
 * CSC 121
 * 3/19/2019
 */

import javax.swing.JFrame;
public class CustomerQueueGUI{
	public static void main(String[] args) {
		JFrame frame = new JFrame("Customer Queue");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new CustomerQueuePanel());
		
		frame.pack();
		frame.setVisible(true);
		frame.setResizable(false);
	}
}
