/*
 * PP4_11Ascii.java -- Prints the ascii characters from 32 to 126
 * Jason Melnik
 * CSC 120
 * 10/09/2018
 */
public class PP4_11Ascii {
	public static void main(String [] args) {
		for(int i = 32; i < 126; i+=5) {//loops from 32 to 126 ascii characters
			for(int x = 0; x<5; x++)
				System.out.print((i + x) + ": " + (char)(x+i) + "\t");
			System.out.println();
		}
	}
}
