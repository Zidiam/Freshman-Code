/**
 * ExpressionTests.java -- test expression evaluation, and use a Scanner to get some answer
 * Jason Melnik
 * CSC 120 F18
 * 9.17/18
 */

import java.util.Scanner;

public class ExpressionTests {
	public static void main (String [] args) {
		
		int a;
		int b;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter value for nueminator: ");
		a = scan.nextInt();
		System.out.println("Enter value for denominator: ");
		b = scan.nextInt();
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("a/b = " + a/b);
		System.out.println("a%b = " + a%b);
		
		System.out.println("This program quit normally.");
		
	}

}
