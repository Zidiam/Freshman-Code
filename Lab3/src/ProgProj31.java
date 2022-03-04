/**
 * ProgProj31.java -- Showing how to use Random with Scanners and String aps
 * Jason Melnik
 * CSC 120 
 * Lab 3 Experiments
 * 
 * This program creates a user name from an input name, using the first
 * initial and first five letter of the last name, plus a random number 
 * between 10-99 inclusive.
 * 9/25/18
 */
//imports:
import java.util.*;
public class ProgProj31 {
	public static void main(String []args) {
		// Create Random and Scanner objects to use
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		// Get user's first and last name
		System.out.println("Tell me your first name! ");
		String fname = scan.nextLine();
		
		System.out.println("Tell me your last name! ");
		String lname = scan.nextLine();
		
		System.out.println("First name: " + fname + "\nLast name: " + lname);
		
		//this part makes the code less brittle
		while(lname.length() < 5)
			lname += "x";
		
		// Get random number between 10-99 inclusive
		int num = rand.nextInt(90)+10;
		
		// Convert first and last names to lowercase
		fname = fname.toLowerCase();
		lname = lname.toLowerCase();
		// Extract first initial and five letters from last and make final string
		char firstChar = fname.charAt(0);
		String lastFive = lname.substring(0, 5);
		// Print out new name
		
		String userName = firstChar + lastFive + num;
		System.out.println("Your user login is " + userName);
		
		System.out.println("The program finished!");
	}
}
