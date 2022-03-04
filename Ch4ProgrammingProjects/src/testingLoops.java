/**
 * testingLoops.java--testing different ways to loop
 * JasonMelnik
 * 10/5/2018
 *
 */
import java.util.Scanner;
public class testingLoops {
	public static void main(String [] args) {
		//while loop
		int i = 0;
		while(i<5) {
			System.out.println(i);
			i ++;
		}
		
		//for loop
		System.out.println("For loop..");
		for(int x = 0; x<5; x++)
			System.out.println(x);
		
		//do loop
		System.out.println("The do loop");
		int t = 6;
		do {
			System.out.println(t);
			t++;
		}while(t<5);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter some integers separated by spaces: ");
		String numbers = input.nextLine();
		System.out.println("Your numbers are " + numbers);
		
		double total = 0;
		Scanner doubleScan = new Scanner(numbers);
		while(doubleScan.hasNextDouble())
			total += doubleScan.nextDouble();
			
		System.out.println("Your total is: " + total);
		
		boolean timeToQuit = true;
		do {
			System.out.println("Enter a command: ");
			System.out.println("0: Bark");
			System.out.println("1: Meow");
			System.out.println("2: Gnaw");
			System.out.println("3: Quit");
			int choice = input.nextInt();
			if (choice == 0)
				System.out.println("bark bark!");
			else if (choice == 1)
				System.out.println("Meow Meow");
			else if (choice == 2)
				System.out.println("crunch crunch");
			else if (choice == 3)
				timeToQuit = false;
			else
				System.out.println("That's not a legal command");

		}while(timeToQuit);
		
	}
}
