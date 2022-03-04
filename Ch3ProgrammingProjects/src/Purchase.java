/**
 * Purchase.java -- Illustrating NumberFormat objects
 * 
 *
 */
import java.util.Scanner;

import javax.swing.JOptionPane;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Purchase {
	public static void main(String [] args) {
		
		NumberFormat percentFmt = NumberFormat.getPercentInstance();
		
		percentFmt.setMinimumFractionDigits(2);
		double taxRate = 0.06;
		
		JOptionPane.showMessageDialog(null, "The tax rate is " + percentFmt.format(taxRate));
		
		//double costCamaro = 27.60;
		String costStr = JOptionPane.showInputDialog(null, "How much is that car?");
		double costCamaro = Double.parseDouble(costStr);
		
		NumberFormat moneyFmt = NumberFormat.getCurrencyInstance(Locale.UK);
		
		JOptionPane.showMessageDialog(null, "Our Camaro costs " + moneyFmt.format(costCamaro));
		
		int choice = JOptionPane.showConfirmDialog(null, "Do you want to know how much that is with tax?");
		
		if (choice != JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Okay, boss, catch you later");
			System.exit(0);
		}
		
		costCamaro = costCamaro + costCamaro*taxRate;
		JOptionPane.showMessageDialog(null, "And with tax its: " + costCamaro);
		
		DecimalFormat formZ = new DecimalFormat("####.00");
		System.out.println("The values " + formZ.format(12.7) + formZ.format(-25.3));
	}
}
