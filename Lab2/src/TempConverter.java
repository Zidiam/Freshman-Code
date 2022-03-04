/**
 *TempConverter.java -- Listing 2.7 from Lewis, Pg.55
 *CSC 120
 *Jason Melnik
 *09/18/2018
 */

public class TempConverter {
	public static void main(String [] args) {
		final int BASE = 32;//once assigned you can't change it
		final double CONVERSION_FACTOR = 9.0/5.0;
		
		double fahrTemp;
		int celsiusTemp = 24;
		
		fahrTemp = celsiusTemp * CONVERSION_FACTOR + BASE;
		
		System.out.println("Celsius = " + celsiusTemp);
		System.out.println("Fahrenheit = " + fahrTemp);
	}
}
