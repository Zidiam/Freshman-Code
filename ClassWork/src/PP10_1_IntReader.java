import java.util.Scanner;

/*
 * 
 */
class NumberTooBigException extends Exception{
	public NumberTooBigException(String s) {
		super(s);
	}
}

public class PP10_1_IntReader {
	
	
	public static void main(String[] args) {
		
		try {
			intScanner();
		}
		catch (NumberTooBigException e){
			System.out.println(e);
		}
	
	}
	
	public static void intScanner() throws NumberTooBigException{
		Scanner scan = new Scanner(System.in);
		int numGoodVals = 0;
		double total = 0.0;
		
		while(numGoodVals < 10) {
			
			System.out.println("Enter integer: ");
			String input = scan.nextLine();
			int val;
			try {
				val = Integer.parseInt(input);
				if(val > 100)
					throw new NumberTooBigException("Yoiks!");
				numGoodVals += 1;
				total += val;
			}
			catch (NumberFormatException e){
				System.err.println("Error: " + e);
				System.err.println("Try again!");
			}
		}
		System.out.println("The average is: " + total/10);
		
	}
}
