/*
 * Project4_4.java -- Reads an inputed string and returns each character line by line
 * Jason Melnik
 * CSC 120
 * 10/02/2018
 * 
 */
import java.util.Scanner;
public class Project4_4 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String input = scan.nextLine();
		
		for(int index = 0; index < input.length(); index++)//a for loop that goes through the entire
			System.out.println(input.charAt(index));//length of the input and prints each character at index
	}
}
