/**
 * PP_2_8.java -- Convert Quarters, dimes, nickels, and pennies to dollar and cent ammount /java foundation by Lewis pg71
 * Jason Melnik
 * CSC 120
 * 09/18/2018
 */

import java.util.Scanner;
public class PP_2_8 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int quarters, dimes, nickels, pennies;
		
		System.out.println("This will convert your coins to dollar and cent ammount!");
		System.out.println("Quarters: ");
		quarters = scan.nextInt();
		System.out.println("Dimes: ");
		dimes = scan.nextInt();
		System.out.println("Nickels: ");
		nickels = scan.nextInt();
		System.out.println("Penies: ");
		pennies = scan.nextInt();
		
		System.out.println("Total: " + (double) (quarters * 25
				+ dimes * 10
				+ nickels * 5
				+ pennies)
				/ 100);
	}

}
