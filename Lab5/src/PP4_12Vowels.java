/*
 * PP4_12Vowels.java -- Prints the amount of vowels and non vowels in a string
 * Jason Melnik
 * CSC 120
 * 10/09/2018
 */
import java.util.Scanner;
public class PP4_12Vowels {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = scan.nextLine();
		
		int a, e, i, o, u, non;
		a = e = i = o = u = non = 0;
		//Loops through the string
		for(int index = 0; index < input.length(); index++) {
			if(input.charAt(index) == 'a')
				a ++;
			else if(input.charAt(index) == 'e')
				e ++;
			else if(input.charAt(index) == 'i')
				i ++;
			else if(input.charAt(index) == 'o')
				o ++;
			else if(input.charAt(index) == 'u')
				u ++;
			else
				non ++;
		}
		System.out.println("There are " + (a+e+i+o+u) + " vowel's");
		System.out.println("A vowels: " + a);
		System.out.println("E vowels: " + e);
		System.out.println("I vowels: " + i);
		System.out.println("O vowels: " + o);
		System.out.println("U vowels: " + u);
		System.out.println("Non vowels: " + non);
				
			
			
		
		
	}			
}
