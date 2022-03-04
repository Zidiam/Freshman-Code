/*
 * CalculatorPanel - Panel
 * Jason Melnik
 * 11/5/2018
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorPanel extends JPanel{
	private JButton B1, B2, B3, B4, B5, B6, B7, B8, B9, B0, BPlus, BMinus, BEquals, BDivide, BMultiply, BNegative;
	private JLabel current, past;
	private JPanel buttonPanel;
	private String Numbers = "";
	
	public CalculatorPanel(){
		B1 = new JButton("1");
		B2 = new JButton("2");
		B3 = new JButton("3");
		B4 = new JButton("4");
		B5 = new JButton("5");
		B6 = new JButton("6");
		B7 = new JButton("7");
		B8 = new JButton("8");
		B9 = new JButton("9");
		B0 = new JButton("0");
		B0 = new JButton("0");
		BPlus = new JButton("+");
		BMinus = new JButton("-");
		BEquals = new JButton("=");
		BDivide = new JButton("/");
		BMultiply = new JButton("X");
		BNegative = new JButton("-");
		
		ButtonListener listener = new ButtonListener();
		B1.addActionListener(listener);
		B2.addActionListener(listener);
		B3.addActionListener(listener);
		B4.addActionListener(listener);
		B5.addActionListener(listener);
		B6.addActionListener(listener);
		B7.addActionListener(listener);
		B8.addActionListener(listener);
		B9.addActionListener(listener);
		B0.addActionListener(listener);
		BPlus.addActionListener(listener);
		BMinus.addActionListener(listener);
		BEquals.addActionListener(listener);
		BDivide.addActionListener(listener);
		BMultiply.addActionListener(listener);
		BNegative.addActionListener(listener);
		
		current = new JLabel("");
		current.setPreferredSize(new Dimension(250, 10));
		past = new JLabel("");
		past.setPreferredSize(new Dimension(250, 10));
		
		current.setHorizontalAlignment(current.getWidth());
		past.setHorizontalAlignment(past.getWidth());
		
		B1.setPreferredSize(new Dimension(50, 50));
		B2.setPreferredSize(new Dimension(50, 50));
		B3.setPreferredSize(new Dimension(50, 50));
		B4.setPreferredSize(new Dimension(50, 50));
		B5.setPreferredSize(new Dimension(50, 50));
		B6.setPreferredSize(new Dimension(50, 50));
		B7.setPreferredSize(new Dimension(50, 50));
		B8.setPreferredSize(new Dimension(50, 50));
		B9.setPreferredSize(new Dimension(50, 50));
		B0.setPreferredSize(new Dimension(50, 50));
		BPlus.setPreferredSize(new Dimension(50, 50));
		BMinus.setPreferredSize(new Dimension(50, 50));
		BEquals.setPreferredSize(new Dimension(50, 50));
		BDivide.setPreferredSize(new Dimension(50, 50));
		BMultiply.setPreferredSize(new Dimension(50, 50));
		BNegative.setPreferredSize(new Dimension(50, 50));
		
		buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension(250, 250));
		buttonPanel.add(B1);
		buttonPanel.add(B2);
		buttonPanel.add(B3);
		buttonPanel.add(BPlus);
		buttonPanel.add(B4);
		buttonPanel.add(B5);
		buttonPanel.add(B6);
		buttonPanel.add(BMinus);
		buttonPanel.add(B7);
		buttonPanel.add(B8);
		buttonPanel.add(B9);
		buttonPanel.add(BMultiply);
		buttonPanel.add(BNegative);
		buttonPanel.add(B0);
		buttonPanel.add(BDivide);
		buttonPanel.add(BEquals);
		
		setPreferredSize(new Dimension(250, 250));
		setBackground(Color.CYAN);
		add(past);
		add(current);
		add(buttonPanel);
		
	}
	
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			
			if(event.getSource() == B1) {
				Numbers += "1"; 
				current.setText(Numbers);
			}
			if(event.getSource() == B2) {
				Numbers += "2";
				current.setText(Numbers);
			}
			if(event.getSource() == B3) {
				Numbers += "3";
				current.setText(Numbers);
			}
			if(event.getSource() == B4) {
				Numbers += "4";
				current.setText(Numbers);
			}
			if(event.getSource() == B5) {
				Numbers += "5";
				current.setText(Numbers);
			}
			if(event.getSource() == B6) {
				Numbers += "6";
				current.setText(Numbers);
			}
			if(event.getSource() == B7) {
				Numbers += "7";
				current.setText(Numbers);
			}
			if(event.getSource() == B8) {
				Numbers += "8";
				current.setText(Numbers);
			}
			if(event.getSource() == B9) {
				Numbers += "9";
				current.setText(Numbers);
			}
			if(event.getSource() == B0) {
				Numbers += "0";
				current.setText(Numbers);
			}
			if(event.getSource() == BNegative) {
				Numbers = "" + Integer.parseInt(Numbers) * -1;
				current.setText(Numbers);
			}
			if(event.getSource() == BPlus) {
				if (past.getText() == "") {
						past.setText(Numbers);
						Numbers = "";
						current.setText(Numbers);
				}
				BPlus.setBackground(Color.orange);
				BMinus.setBackground(B1.getBackground());
				BDivide.setBackground(B1.getBackground());
				BMultiply.setBackground(B1.getBackground());
			}
			if(event.getSource() == BMinus) {
				if (past.getText() == "") {
					past.setText(Numbers);
					Numbers = "";
					current.setText(Numbers);
			}
				BMinus.setBackground(Color.orange);
				BPlus.setBackground(B1.getBackground());
				BDivide.setBackground(B1.getBackground());
				BMultiply.setBackground(B1.getBackground());
			}
			if(event.getSource() == BDivide) {
				if (past.getText() == "") {
					past.setText(Numbers);
					Numbers = "";
					current.setText(Numbers);
			}
				BDivide.setBackground(Color.orange);
				BPlus.setBackground(B1.getBackground());
				BMinus.setBackground(B1.getBackground());
				BMultiply.setBackground(B1.getBackground());
			}
			if(event.getSource() == BMultiply) {
				if (past.getText() == "") {
					past.setText(Numbers);
					Numbers = "";
					current.setText(Numbers);
			}
				BMultiply.setBackground(Color.orange);
				BPlus.setBackground(B1.getBackground());
				BMinus.setBackground(B1.getBackground());
				BDivide.setBackground(B1.getBackground());
			}
			if(event.getSource() == BEquals) {
				if (BPlus.getBackground() == Color.orange) {
						int answer = Integer.parseInt(past.getText()) + Integer.parseInt(current.getText());
						Numbers = "" + answer;
						past.setText("");
						current.setText(Numbers);
						BPlus.setBackground(B1.getBackground());
				}
				if (BMinus.getBackground() == Color.orange) {
					int answer = Integer.parseInt(past.getText()) - Integer.parseInt(current.getText());
					Numbers = "" + answer;
					past.setText("");
					current.setText(Numbers);
					BMinus.setBackground(B1.getBackground());
				}
				if (BMultiply.getBackground() == Color.orange) {
					int answer = Integer.parseInt(past.getText()) * Integer.parseInt(current.getText());
					Numbers = "" + answer;
					past.setText("");
					current.setText(Numbers);
					BMultiply.setBackground(B1.getBackground());
				}
				if (BDivide.getBackground() == Color.orange) {
					int answer = Integer.parseInt(past.getText()) / Integer.parseInt(current.getText());
					Numbers = "" + answer;
					past.setText("");
					current.setText(Numbers);
					BDivide.setBackground(B1.getBackground());
				}
			}			
		}
	}
}