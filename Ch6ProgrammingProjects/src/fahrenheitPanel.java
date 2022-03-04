/*
 * LeftRightPanel.java -- A Panel that has a button and a text field that can convert 
 * fahrenheit to celcius with either pressing Enter or clicking the button
 * Jason Melnik
 * CSC 120
 * 11/5/18
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class fahrenheitPanel extends JPanel{

	private JLabel inputLabel, outputLabel, resultLabel;
	private JTextField fahrenheit;
	private JButton button;
	private JPanel buttons;
	
	public fahrenheitPanel(){
		button = new JButton("button");
		buttons = new JPanel();
		
		inputLabel = new JLabel("test");
		
		button.addActionListener(new ButtonListener());
		buttons.add(button);
		
		add(inputLabel);
		add(buttons);
		
	}
	
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			if(event.getSource() == button) {
				inputLabel.setText("t");
			}
		}
	}
	
}
