/**
 *StringFunApp.java -- getting Strings from Scanners and doing stuff with them.
 * Jason Melnik
 * CSC 120
 * 9.21.18
 *
 */
import java.util.Scanner;
public class StringFunApp {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tell me your name! ");
		String name = scan.nextLine();
		
		System.out.println("Hi " + name + ", how are you today?");
		
		char firstChar = name.charAt(0);
		int len = name.length();
		
		System.out.println("The first character in your name is " + firstChar);
		System.out.println(" and your name has " + len + " charaters!");
		
		boolean endsWell = name.endsWith("Flintstone");
		
		if (endsWell)
		{
			boolean isWilma = name.startsWith("Wilma");
			if (isWilma)
				System.out.println("Hello Mrs.Flintstone");
			else
				System.out.println("Hello Mr.Flintstone");
		}
		else
			System.out.println("You're not a Flintstone!");
		
		String newName = name.replace("Flint", "Soap");
		System.out.println(newName);
		
		System.out.println("The program exited normally");
	}
}
