/**
 * PP_2_7.java -- seconds to hours, minutes, seconds /java foundation by Lewis pg71
 * Jason Melnik
 * CSC 120
 * 09/18/2018
 */

import java.util.Scanner;
public class PP_2_7 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int hours, minutes, seconds, value;
		
		System.out.println("This will convert your seconds to hours, minutes, and seconds");
		System.out.println("Seconds you want converted: ");
		value = scan.nextInt();
		int perm = value;
		hours = value/3600;
		value -= (hours * 60 * 60);
		minutes = value/60;
		value -= minutes * 60;
		seconds = value;
		
		System.out.println(perm + " seconds is equivalent to " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds.");
	}

}
