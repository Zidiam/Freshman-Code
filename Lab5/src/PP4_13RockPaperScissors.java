/*
 * PP4_13RockPaperScissors -- A normal game of rock paper scissors against a computer
 * Jason Melnik
 * CSC 120
 * 10/09/18
 */
import java.util.*;
class PP4_13RockPaperScissors {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    int computer = rand.nextInt(3);
    int wins, loss, ties, input;//create some counters and an input variable
    wins = loss = ties = 0;//set the counters to 0
    do{
      System.out.println("Classic game of rock, paper, and scissors: ");
      System.out.println("0: Rock");
      System.out.println("1: Paper");
      System.out.println("2: Scissors");
      System.out.println("3: Exit");
      input = scan.nextInt();
      if(input == 0 && computer == 0){//this if statement and the ones below test whether the user won, tied or lost
        ties ++;
        System.out.println("Computer chose Rock, you tied");
      }
      else if(input == 0 && computer == 1){
        loss ++;
        System.out.println("Computer chose Paper, you lost");
      }
      else if(input == 0 && computer == 2){
        wins ++;
        System.out.println("Computer chose Scissors, you won");
      }
      else if(input == 1 && computer == 0){
        wins ++;
        System.out.println("Computer chose Rock, you won");
      }
      else if(input == 1 && computer == 1){
        ties ++;
        System.out.println("Computer chose Paper, you tied");
      }
      else if(input == 1 && computer == 2){
        loss ++;
        System.out.println("Computer chose Scissors, you lost");
      }
      else if(input == 2 && computer == 0){
        loss ++;
        System.out.println("Computer chose Rock, you lost");
      }
      else if(input == 2 && computer == 1){
        wins ++;
        System.out.println("Computer chose Paper, you won");
      }
      else if(input == 2 && computer == 2){
        ties ++;
        System.out.println("Computer chose Scissors, you tied");
      }
      else if(input == 3)
    	  break;
      else
        System.out.println("Invalid input");
      System.out.println("Losses: " + loss + "\tTie's: " + ties + "\tWin's " + wins);
      computer = rand.nextInt(3);
    }while(input != 3);
    System.out.println("You exited the program. Come back soon!");
  }
}