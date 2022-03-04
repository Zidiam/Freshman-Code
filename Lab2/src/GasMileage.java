/**
 *GasMileage.java -- Listing 2.9 from Lewis, Pg.64/65
 *CSC 120
 *Jason Melnik
 *09/18/2018
 */

import java.util.Scanner;
public class GasMileage {
	public static void main(String [] args) {
		int miles;
		double gallons, mpg;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of miles: ");
		miles = scan.nextInt();
		
		System.out.print("Enter the gallons of fuel used: ");
		gallons = scan.nextDouble();
		
		mpg = miles/gallons;
		
		System.out.println("Miles Per Gallon: " + mpg);
	}
}
