/*
 * PushCounterPanel.java -- JPanel that keeps track oof button presses!
 * Jason Melnik
 * CSC 120
 * 10/31/2018
 */
import java.awt.Color;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DiceThrowerPanel extends JPanel{

	//instance variables for our subclass lf JPanel
	PairOfDice dice;
	private JButton push;
	private JLabel label;
	
	public DiceThrowerPanel() {
		
		dice = new PairOfDice();
		
		push = new JButton("Push me!");
		push.addActionListener(new ButtonListener());
		
		label = new JLabel("throw: " + dice);
		
		add(push);
		add(label);
		
		setBackground(Color.CYAN);
		setPreferredSize(new Dimension(300, 400));
	}
	
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			dice.toss();
			label.setText("Pushes: " + dice);
		}
		
		
	}
	
}
