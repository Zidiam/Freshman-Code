/**
 * ProjectLab1App.java -- A simple program to illustrate ava syntax and samantics and
 * the Eclipse IDE functionality
 * 
 * Jason Melnik
 * CSC 120 F18 LAB0
 * 09/11/2018
 *
 */

public class JasonMelnikLab1Project {
	public static void main(String args[]) {
		
		double a;
		a = 3.1415;
		System.out.println("Hellow world! How're you today!");
		System.out.println("I am a computer program executing well");
		System.out.println(a);
		a = a + 1;
		System.out.println(a);
		
		int numBottles = 99;
		while (numBottles > 0) {
			System.out.println(numBottles + " bottles of beer on the wall");
			numBottles -= 1;
		}
		System.out.println("No bottles left undrunk!");
		
		numBottles = 6;//buy an extra six-pack!
		
		System.out.println("The square of "
				+ numBottles
				+ " is "
				+ sqr(numBottles));
		
	}
	
	public static int sqr(int a) {//returns the square of the input
		return a * a;
	}
}
