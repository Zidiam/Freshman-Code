/*
 * PP4_15Casino -- A gambling game that can win you some money!
 * Jason Melnik
 * CSC 120
 * 10/09/18
 */
import java.util.*;
import java.text.*;
public class PP4_15Casino {
	
	/*
	 * Test() -- checks if a number of 3 digits has identical numbers and returns the amount
	 * @param a -- then number to test
	 */
	public static int Test(int a) {
		String num = "" + a;
		if(num.charAt(0) == num.charAt(1) && num.charAt(0) == num.charAt(2))
			return (3);
		else if(num.charAt(0) == num.charAt(1) || num.charAt(0) == num.charAt(2) || num.charAt(1) == num.charAt(2))
			return (2);
		else
			return (0);
		
	}
	
	public static void main(String[] args) {
		int money, input, random;
		money = input = 0;
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		random = rand.nextInt(900)+100;//creates a int from 100-999
		System.out.println("Welcome to my casino! The rules are: ");
		System.out.println("If the casino results have no identicle numbers then you loose the ammount of money you entered");
		System.out.println("If the casino results have two of the same number then you get two times the money you entered");
		System.out.println("If the casino results have three of the same number then you get three times the money you entered");
		do {
			System.out.println("Enter Bet(type -1 to quit): ");
			input = scan.nextInt();
			if (input>0) {//this helps exit the program
				System.out.println("Casino: " + random);
				System.out.println("You got " + Test(random) + " of the same number.");
				if (Test(random) == 0) {
					money -= input;
					System.out.println("You lost " + input + "$");
				}
				else {
					money += input*Test(random);//we call on Test to see how much to multiply their input
					System.out.println("You won " + (input*Test(random)) + "$");
				}
				System.out.println("Balance: " + money + "$");
				random = rand.nextInt(900)+100;
			}
			else if(input == 0)
				System.out.println("You can't just enter 0$");
			else if (input == -1)
				break;//break out of while loop
			else
				System.out.println("You can't enter negative money!");
			
		}while(input != -1);
		System.out.println("You left the casino. Hope to see you again!");
	}

}
