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
		inputLabel = new JLabel("Enter Fahrenheit temperature: ");
		outputLabel = new JLabel("Temperature in Celcius: ");
		resultLabel = new JLabel("---");
		fahrenheit = new JTextField(5);
		fahrenheit.addActionListener(new TempListener());
		button = new JButton("Convert");
		buttons = new JPanel();
		
		TempListener listener = new TempListener();
		button.addActionListener(listener);
		
		buttons.add(button);
		
		add(inputLabel);
		add(fahrenheit);
		add(outputLabel);
		add(resultLabel);
		add(buttons);
		setPreferredSize(new Dimension(200, 120));
		setBackground(Color.YELLOW);
		
	}
	
	
	private class TempListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			int fahrTemp, celcTemp;
			String text = fahrenheit.getText();
			
			fahrTemp = Integer.parseInt(text);
			celcTemp = (fahrTemp - 32) * 5/9;
			
			resultLabel.setText(Integer.toString(celcTemp));
			if(event.getSource() == button) {
				text = fahrenheit.getText();
				
				fahrTemp = Integer.parseInt(text);
				celcTemp = (fahrTemp - 32) * 5/9;
				
				resultLabel.setText(Integer.toString(celcTemp));
			}
		}
	}
	
}
