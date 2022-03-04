/**
 *TempConverterIO.java -- Using scanner to ask the user what value to convert celsius to fahr.
 *CSC 120
 *Jason Melnik
 *09/18/2018
 */

import java.util.Scanner;
public class TempConverterIO {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		final int BASE = 32;//once assigned you can't change it
		final double CONVERSION_FACTOR = 9.0/5.0;
		
		double fahrTemp;
		int celsiusTemp;
		
		System.out.println("Enter Celsius: ");
		celsiusTemp = scan.nextInt();
		
		fahrTemp = celsiusTemp * CONVERSION_FACTOR + BASE;
		
		System.out.println("Celsius = " + celsiusTemp);
		System.out.println("Fahrenheit = " + fahrTemp);
	}
}
