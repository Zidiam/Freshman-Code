/**
 * ProgProj33.java -- Creates a phone number!
 * Jason Melnik
 * CSC 120 
 * Lab 3 Experiments
 * 9/25/18
 */
import java.util.Random;
public class ProgProj33 {
	public static void main(String []args) {
		Random rand = new Random();
		//find a random num between 0-7
		int num1 = rand.nextInt(8);
		int num2 = rand.nextInt(8);
		int num3 = rand.nextInt(8);
		//find a random num from 100 - 743
		int num4 = rand.nextInt(643) + 100;
		//find a random num from 1000 - 9999
		int num5 = rand.nextInt(9000) + 1000;
		//print all of the nums combined
		System.out.println(num1 + "" + num2 + "" + num3 + "-" + num4 + "-" + num5);
		
	}
	
}
