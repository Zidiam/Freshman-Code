/**
 * ProgProj32.java -- Read two integer values and print the sum of the values raised to the third power
 * Jason Melnik
 * CSC 120 
 * Lab 3 Experiments
 * 9/25/18
 */
import java.util.Scanner;
public class ProgProj32 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		//Take the first and second value
		System.out.println("Enter the first value to be cubed: ");
		int first = scan.nextInt();
		System.out.println("Enter the second value to be cubed: ");
		int second = scan.nextInt();
		//print the value
		System.out.println("Your first and second value's cubed and summed: " 
		+ (Math.pow(first, 3) + Math.pow(second, 3)));
	}
}
