/**
 * IfStatementTests.java
 * Jason Melnik
 * CSC 120
 * 10/1/18
 */
public class IfStatementTests {

	public static void main(String[] args) {
		int x = 5;
		if (true)
			System.out.println("That's very true!");
		else
			System.out.println("That's not true at all!");
		
		if (!(x < 5))
			System.out.println("Your number was less than 5!");
		else
			System.out.println("Your number was greater than or equal to 5!");
		
		System.out.println("We're done now!");
	}

}
