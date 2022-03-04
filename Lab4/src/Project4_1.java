/*
 *  Project4_1.java -- Input a year and return if its a leap year
 *  Jason Melnik
 *  10/1/2018
 *  CSC - 120
 */
import java.util.Scanner;
public class Project4_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a year: ");
		int year = scan.nextInt();
		
		if (year < 1582)//first it checks if its a legal year
			System.out.println("Not valid since it is less than the year 1582 which is when the Gregorian calendar was adopted.");
		else if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {//this is the calculations to check that the year is a leap year
					System.out.println(year + " IS a leap year! ");
				}
				else
					System.out.println(year + " is NOT a leap year! ");
			}
			else
				System.out.println(year + " IS a leap year! ");
		}
		else//if it is not a leap year do this
			System.out.println(year + " is NOT a leap year!");
	}

}
