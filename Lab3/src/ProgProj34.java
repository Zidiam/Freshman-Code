/**
 * ProgProj34.java -- Finds the distance between two points!
 * Jason Melnik
 * CSC 120 
 * Lab 3 Experiments
 * 9/25/18
 */
import java.util.Scanner;
public class ProgProj34 {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first cord (x y)without comma: ");
		//scan the first int and second int and assign the values
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		System.out.println("Enter second cord (x y)without comma: ");
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		
		//print the distance calculated
		System.out.println("Your Distance is: " + (Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2))));
	}
}
