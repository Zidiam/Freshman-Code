/*
 * Project4_9.java -- Tests an input if its a Palindrome or not
 * Jason Melnik
 * CSC 120
 * 10/02/2018
 * 
 */
import java.util.Scanner;
public class Project4_9 {
	public static void main(String [] args) {
		
		String str, another = "y";
		
		Scanner scan = new Scanner(System.in);
		
		//loop until user says to quit
		while(another.equalsIgnoreCase("y")) {
			System.out.println("Enter a possible palindrome: ");
			str = scan.nextLine();
			
			// Create a new string that's lower case version of str
			String newStr = str.toLowerCase();
			
			// Create a new string that strips out all but lower case letters
			String alphaStr = "";
			for (int dex = 0; dex < newStr.length(); dex++) {
				char ch = newStr.charAt(dex);
				if (Character.isLetter(ch))
					alphaStr += ch;
			}
//			int dex = 0;
//			while(dex < newStr.length()) {
//				char ch = newStr.charAt(dex);
//				//if ("abcdefghijklmnopqrstuvwxyz".contains("" + ch))
//				//if (Character.isLetter(ch))
//				if (ch >= 'a' && ch <= 'z')
//					alphaStr += ch;
//				dex++;
//			}
			
			int left = 0;
			int right = alphaStr.length() - 1;
			while(left < right && alphaStr.charAt(left) == alphaStr.charAt(right)) {
				left++;
				right--;
			}
			if (left < right)
				System.out.println("\"" + str + "\" is not a palendrome!");
			else
				System.out.println("\"" + str + "\" is a palendrome!");
			
			System.out.println("Do you have more to test? (y or n)");
			another = scan.nextLine();
		}
		
		
		
		
		System.out.println("This program termnated normally.");
	}
}
