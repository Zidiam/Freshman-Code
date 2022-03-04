/**
 * ProgProj35.java -- Finds the volume and surface area of a sphere!
 * Jason Melnik
 * CSC 120 
 * Lab 3 Experiments
 * 9/25/18
 */
import java.util.Scanner;
public class ProgProj35 {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a radius: ");
		int r = scan.nextInt();
		
		//calculates and prints the volume and surface area of a sphere
		System.out.println("The Volume of a sphere: " + (4 * Math.PI * Math.pow(r, 3))/3);
		System.out.println("The Surface Area of a sphere: " + (4 * Math.PI * Math.pow(r, 2)));
		
	}

}
