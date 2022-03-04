/*
 * Project4_3.java -- Input a value and returns the amount of even numbers in it.
 * Jason Melnik
 * CSC 120
 * 10/02/2018
 * 
 */
import java.util.Scanner;
public class Project4_3 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Value: ");
		int value = scan.nextInt();
		int answer = 0;
		for(int index = 2; index <= value; index += 2)//goes in a for loop
			answer += index;//and ads index every 2 integers which will be even
		System.out.println("Answer: " + answer);
	}
}
