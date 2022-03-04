/*
 * Project4_8.java -- Hi-Lo guessing game with numbers
 * Jason Melnik
 * CSC 120
 * 10/02/2018
 * 
 */
import java.util.*;
public class Project4_8 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Random rand = new Random();
		int input = 0;
		int counter = 0;
		int num = rand.nextInt(100) + 1;//create a random number between 1-100
		while (input != -1) {
			System.out.println("Guess the number that is between 1-100 (type -1 to quit)");//as them to guess
			input = scan.nextInt();
			counter ++;//this counts their tries
			if (input == -1)//ends code if they want to quit
				break;
			if (input < num)//if input is less than num its to low
				System.out.println("Your guess was to LOW");
			else if (input > num)
				System.out.println("Your guess was to HIGH");
			else {//this is the reset part of code so it loops all oveer again with all values reset
				System.out.println("It took you " + counter + " guesses to get " + num);
				System.out.println("Do you want to continue? (y or n)");
				String answer = scan2.nextLine();
				if (answer.equalsIgnoreCase("y")) {
					counter = 0;
					num = rand.nextInt(100) + 1;
				}
				else
					input = -1;
					
			}
				
		}
		System.out.println("You quit out of the game, I hope you come back soon!");
		
	}
}
