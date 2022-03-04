/*
 * Project5_10.java -- Calculates the ammount and percent chance of rolling snake-eyes, boxcars and hard7
 * Jason Melnik
 * CSC 120
 * 10/23/18
*/
import java.text.NumberFormat;
public class Project5_10 {
	public static void main(String[] args) {
		NumberFormat fmt = NumberFormat.getPercentInstance();
		fmt.setMinimumFractionDigits(2);
		
		final int ROLLS = 50000;//How many times it will get rolled

		PairOfDice myDice = new PairOfDice();//crates new Pair Of Dice Object
		
		int countSE = 0;//These are our counters
		int countBC = 0;
		int count7hardway = 0;
		for(int i = 0; i < ROLLS; i++) {//This will look ROLLS amount of times and count up the ammount of times
			myDice.toss();
			if(myDice.hasSnakeEyes())//it roles one of these statements
				countSE ++;
			if(myDice.hasBoxCars())
				countBC ++;
			if(myDice.has7HardWay())
				count7hardway ++;
		}
		System.out.println("Number of throws: " + ROLLS);
		System.out.println("Number that came up snake-eyes: " + countSE);
		System.out.println("Percentage snake-eyes: " + fmt.format(countSE*1.0/ROLLS));
		System.out.println("Number that came up box-cars: " + countBC);
		System.out.println("Percentage box-cars: " + fmt.format(countBC*1.0/ROLLS));
		System.out.println("Number that came up 7 Hard Way: " + count7hardway);
		System.out.println("Percentage of 7 Hard Way: " + fmt.format(count7hardway*1.0/ROLLS));
		
	}
}
