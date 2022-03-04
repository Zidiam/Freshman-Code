/*
 * Project5_11.java -- Playing against a computer with a pair of dice
 * Jason Melnik
 * 10/28/2018
 * CSC - 120
 */
import java.util.Scanner;
public class Project5_11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = 0;
		System.out.println("Welcome to the game PIG");//printing the rules
		System.out.println("The rules are you choose to roll a dice");
		System.out.println("If your dice lands on anythnig but a 1, you get that ammount added to your points");
		System.out.println("If you roll a 1 on one of the die, you loose your turn and the poins for that round");
		System.out.println("If you roll a 1 on both dice, you loose a turn and all your points");
		boolean keepPlaying = true;
		int currentRound = 0, playerPoints = 0, compPoints = 0;
		PairOfDice playerDice = new PairOfDice();
		PairOfDice compDice = new PairOfDice();
		while(input != 3){//while they dont type 3 the following code will keep running
			System.out.println("Current Round: " + currentRound + " Your Score: " + playerPoints + " Computer's Score: " + compPoints);
			System.out.println("Enter the command: ");
			System.out.println("1: Roll the Dice");
			System.out.println("2: Pass Dice");
			System.out.println("3: Exit program");
			input = scan.nextInt();
			if(input == 1) {
				playerDice.toss();//dice is rolled
				if (playerDice.hasSnakeEyes()) {//checks if its snake-eyes
					currentRound = 0;
					playerPoints = 0;
					input = 2;
					System.out.println("You Rolled Snake Eyes! Computers Turn!");
				}
				else if(playerDice.hasOne()) {//checks if the one of the dice rolled a 1
					input = 2;
					currentRound = 0;
					System.out.println("You rolled a one! Computers Turn!");
				}
				else //If the dice didnt roll any one's then add points to the current round
				{
					System.out.println("You rolled a " + playerDice.getTotal());
					currentRound += playerDice.getTotal();
				}
			}
		  if (input == 2) {//computers turn
			  playerPoints += currentRound;//add the players pastround into their points
			  currentRound = 0;//set the current round to 0
			  boolean lost = false;
			  while(currentRound <= 20 && lost == false) {//This loops 20 times unless lost = false
				    compDice.toss();//tosses the dice
					if (compDice.hasSnakeEyes()) {//checks if the dice rolled snake - eyes
						currentRound = 0;
						compPoints = 0;
						lost = true;//sets lost to true which breaks it from loop
						System.out.println("Computer Rolled Snake Eyes! Your Turn!");
					}
					else if(compDice.hasOne()) {//checks if one of the dice rolled has a one
						currentRound = 0;
						lost = true;
						System.out.println("Computer Rolled a 1! Your Turn!");
					}
					else //if none of the dice rolled a one then add points to the current round
					{
						currentRound += compDice.getTotal();
					}
			  }
			  compPoints += currentRound;//after looping 20 times or loosing add points to computer
			  System.out.println("Computer earned " + currentRound + " points for the whole round!");
			  currentRound = 0;//set round points back to 0
		  }
		  if (playerPoints >= 100) {//if player wins do this
			  System.out.println("Your Score: " + playerPoints + " Computer's Score: " + compPoints);
			  System.out.println("You WON!");
			  break;
		  }
		  if (compPoints >= 100) {//if computer wins do this
			  System.out.println("Your Score: " + playerPoints + " Computer's Score: " + compPoints);
			  System.out.println("Computer WON! Better luck next time!!");
			  break;
		  }
		}
	System.out.println("You exited the program. I hope you come back soon!");
	}	
}
