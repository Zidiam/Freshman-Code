/**
 * ObjectTests.java -- Test Objects
 * Jason Melnik
 * CSC 120
 * 9/24/2018
 */
import java.util.Scanner;
import java.util.*;
class Dog{
	
	public String toString() {
		return "I'm a happy dog!";
	}
	public String speak() {
		return "Bark";
	}
}
public class ObjectTests {
	public static void main(String[] args) {
		Object obj = new Object();
		String s = new String("This is a new string!");
		Object obj2 = s;
		
		Dog fido = new Dog();
		System.out.println("My Object: " + obj2);
		System.out.println("Dog Object: " + fido);
		System.out.println("Dog Object speaks: " + fido.speak());
		
		//other stuff
		System.out.println("Enter a sentence!");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		System.out.println("You inputed: " + input);
		
		Scanner lexer = new Scanner(input);
		int total = 0;
		while( lexer.hasNextInt() )
			total += lexer.nextInt();
		System.out.println("Your total squared is: " + Math.sqrt(total));
		
		Random rand = new Random();
		System.out.println("A random double is: " + (rand.nextInt(11) + 1));
		
		System.out.println("Now I'm all done!");
		
	}
}
