/*
 * Project4_10.java -- Printing stars graphs
 * Jason Melnik
 * CSC 120
 * 10/02/2018
 * 
 */
public class Project4_10 {
	public static void main(String [] args) {
		String star = "**********";//made a string to take stars from
		for(int index1 = 10; index1 > 0; index1--) 
			System.out.println(star.substring(0, index1));
		
		star = "**********";//made a string to take stars from
		String space = "          ";//made a space string to take spaces from
		for(int index1 = 0; index1 <= 10; index1++) 
			System.out.println(space.substring(0, 10-index1) + star.substring(10-index1, 10));	
		
		System.out.println("");//printed a line to seperate the two graphs of stars
		
		for(int index1 = 0; index1 <= 10; index1++)//does the same on top but backwards
			System.out.println(space.substring(10-index1, 10) + star.substring(0, 10-index1));	
		
		star = "*********";
		space = "     ";
		for(int index1 = 1, index2 = 5; index1 < 10; index1+=2, index2 --) //top half of shape
			System.out.println(space.substring(0, index2) + star.substring(0, index1));
		for(int index1 = 9, index2 = 1; index1 > 0; index1-=2, index2 ++) //bottom half of shape
			System.out.println(space.substring(0, index2) + star.substring(0, index1));
	}
}
