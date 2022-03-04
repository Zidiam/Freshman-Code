/*
 * RandomIntPanel.java -- A panel that holds a button and label that display a random int
 * Jason Melnik
 * CSC 120
 * 11/07/2018
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
public class RandomIntPanel extends JPanel{
	private JButton button;
	private JPanel buttonPanel;
	private JLabel randInt;
	private Random rand = new Random();
	
	public RandomIntPanel() {
		button = new JButton("Click Here");
		ButtonListener listener = new ButtonListener();
		button.addActionListener(listener);
		
		randInt = new JLabel("Click Here");
		randInt.setPreferredSize(new Dimension(250, 25));
		
		buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension(250, 250));
		buttonPanel.add(button);
		setPreferredSize(new Dimension(250, 65));
		setBackground(Color.CYAN);
		add(randInt);
		add(button);
		add(buttonPanel);
	}
	
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			
			if(event.getSource() == button)
				randInt.setText("" + (rand.nextInt(100) + 1));
		}
	}
	
}
