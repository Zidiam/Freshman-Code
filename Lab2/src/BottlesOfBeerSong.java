/**
 *BottlesOfBeerSong.java -- Use a Scanner to get input and do some work with
 *assignment operators and data conversion between types
 * 
 *
 */
import java.util.Scanner;
public class BottlesOfBeerSong {
	public static void main (String []args) {//void means it doesn't return anything and it just runs the code below it
		Scanner scan = new Scanner(System.in);
		
		int numBottles;
		System.out.print("How mmany bottles do you want? ");
		numBottles = (int) scan.nextDouble();
		
		while(numBottles > 0) {
			System.out.println(numBottles + " bottles of beer on the wall. Take one down!");
			//numBottles = numBottles - 1
			//numBottles -= 1;
			//numBottles --;
			--numBottles;
			//int a = --numBottles; - this means a is equal to numBottles - 1
			//int b = numBottles--; - This means b is equal to numBotles, then numBottles -= 1
			System.out.println("Now there is " + numBottles + " bottles");
		}		
		char ch = 'q';
		System.out.println("character = " + ch);
		short chInt = (short) ch;
		System.out.println("character's int value = " + chInt);
		
		chInt = 55;
		while (chInt < 1000){
			System.out.println(chInt + " has character value: " + (char) chInt);
			chInt ++;
		}
		System.out.println("The program exited normally.");
	}

}
