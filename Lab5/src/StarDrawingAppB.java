/*
 * StarDrawingAppb.java -- More practice drawing text-based art
 * 
*/
public class StarDrawingAppB {
	
	/*
	 * drawSpaces() -- output spaces to System.out
	 * @param numSpaces -- number of spaces to draw
	 */
	public static void drawSpaces(int numSpaces) {
		for(int i = 0; numSpaces > i; i++)
			System.out.print(" ");
	}
	/*
	 * drawStars() -- outputs stars to System.out
	 * @param numStars -- number of times to loop
	 */
	public static void drawStars(int numStars) {
		for(int i = 0; numStars > i; i++)
			System.out.print("*");
	}
	
	/*
	 * drawChars() -- output multiples of a character to System.out
	 * @param ch - character to output
	 * @param n - number of times
	 */
	public static void drawChars(char character, int number) {
		for(int i = 0; number > i; i++)
			System.out.print(character);
	}
	
	
	public static void main(String [] args) {
		//draw upper inverted pyramid
		for(int line = 1; line <=5; line++) {
//			for(int space = 1; space < line; space++)
//				System.out.print(" ");
//			for(int star = 1; star <= 10 - 2*(line - 1); star++)
//				System.out.print("*");
			
			drawSpaces(line-1);
			drawStars(10 - 2*(line - 1));
			
			System.out.println();
		}
		
		//draw lower pyramid
		for(int line = 5; line >= 1; line--) {
			drawChars(' ', line-1);
			drawChars('x', 10-2*(line-1));
			System.out.println();
		}
	}
	
}
