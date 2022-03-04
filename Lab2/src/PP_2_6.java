/**
 * PP_2_6.java -- converts hours, minutes and seconds to only seconds /java foundation by Lewis pg71
 * Jason Melnik
 * CSC 120
 * 09/18/2018
 */

import java.util.Scanner;
public class PP_2_6 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int hours, minutes, seconds;
		
		String test = "TEST " 
		+ "TEST2"; 
		
		System.out.println("This will convert your values to seconds " + test);
		System.out.println("Hours: ");
		hours = scan.nextInt();
		System.out.println("Minutes: ");
		minutes = scan.nextInt();
		System.out.println("Seconds: ");
		seconds = scan.nextInt();
		
		System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds is "
				+ "equivalent to " + (hours*60*60 + minutes*60 + seconds) + " seconds!");
	}

}
