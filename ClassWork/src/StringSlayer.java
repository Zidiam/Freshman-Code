import java.util.Random;
import java.util.Scanner;

public class StringSlayer {

	public static void main(String[] args) {
		String myStr = "Only the worthless can be reformed!";
		System.out.println("The string is: " + myStr);
		myStr = myStr.replace("r", "t");
		System.out.println("The string is now: " + myStr);
		
		myStr.charAt(0);
		
		Scanner wordGetter = new Scanner(System.in);
		String []wordsFromUser = new String[5];
		
		for(int i = 0; i < 5; i++) {
			wordsFromUser[i] = wordGetter.nextLine();
		}
		
		for(String wd: wordsFromUser) {
			System.out.println(wd);
		}
	
		char [][]wordArrays = new char[5][];
		
		for(int i = 0; i < 5; i++)
			wordArrays[i] = wordsFromUser[i].toCharArray();
		
		Random rand = new Random();
		for(int wdex = 0; wdex < 5; wdex++) {
			for(int i = wordArrays[wdex].length - 1; i > 0; i--) {
				int swapdex = rand.nextInt(i + 1);
				char temp = wordArrays[wdex][i];
				wordArrays[wdex][i] = wordArrays[wdex][swapdex];
				wordArrays[wdex][swapdex] = temp;
			}
		}
		
		for(int i = 0; i < 5; i++) {
			wordsFromUser[i] = new String(wordArrays[i]);
			System.out.println(wordsFromUser[i]);
		}
	}

}
