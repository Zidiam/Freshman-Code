/*
 * IncorDecPanel.java -- A panel that holds a two buttons that can increase or decrease a value by 1
 * Jason Melnik
 * CSC 120
 * 11/07/2018
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IncorDecPanel extends JPanel{
	private JPanel buttons;
	private JButton Increment, Decrement;
	private JLabel value;
	private static int amount = 50;
	
	public IncorDecPanel() {
		Increment = new JButton("Increment");
		Decrement = new JButton("Decrement");
		
		ButtonListener listener = new ButtonListener();
		Increment.addActionListener(listener);
		Decrement.addActionListener(listener);
		
		buttons = new JPanel();
		buttons.add(Increment);
		buttons.add(Decrement);
		buttons.setPreferredSize(new Dimension(250, 50));
		
		value = new JLabel("" + amount);
		value.setPreferredSize(new Dimension(250, 50));
		
		setPreferredSize(new Dimension(250, 100));
		setBackground(Color.CYAN);
		add(value);
		add(buttons);
		
	}
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			if(event.getSource() == Increment) {
				amount ++;
				value.setText("" + amount);
			}
			else 
			{
				amount --;
				value.setText("" + amount);
			}
		}
		
	}
}
