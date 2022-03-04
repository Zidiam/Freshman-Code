/**
 * ProgProj36.java -- Asks for the three sides of a triangle and computes the area
 * Jason Melnik
 * CSC 120 
 * Lab 3 Experiments
 * 9/25/18
 */
import java.util.Scanner;
public class ProgProj36 {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		//asks for all sides of a triangle
		System.out.println("Enter the values of the three sides of a triangle for me to computer the area");
		System.out.println("Enter side1: ");
		double a = scan.nextDouble();
		System.out.println("Enter side2: ");
		double b = scan.nextDouble();
		System.out.println("Enter side3: ");
		double c = scan.nextDouble();
		
		//calculates the peremiter devided by 2
		double s = (a + b + c)/2;
		//calculates the area
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("The area is:  " + area);
	}
}
