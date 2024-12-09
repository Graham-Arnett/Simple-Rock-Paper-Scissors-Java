package rps;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String choice;
		int playerWins = 0;
		int enemyWins = 0;
		System.out.print("Rock Paper Scissors App\n\n");
		do 
		{
		int enemyChoice = random.nextInt(1,4);
		//1 is rock, 2 is paper, 3 is scissors
		System.out.print("ROCK, PAPER, SCISSORS: ");
		String action = scanner.next();
		switch(action) 
		{
		case "ROCK":
			if(enemyChoice == 1) {
				System.out.println("TIE!");
			}
			else if(enemyChoice == 2) {
				System.out.println("YOU LOST!");
					enemyWins++;
			}
			else 
			{
			System.out.println("YOU WON!");
			playerWins++;
			}
			break;
			
		case "PAPER":
			if(enemyChoice == 1) {
				System.out.println("YOU WON!");
				playerWins++;
			}
			else if(enemyChoice == 2) {
				System.out.println("TIE!");
			}
			else 
			{
			System.out.println("YOU LOST!");
			enemyWins++;
			}
			break;
		
		case "SCISSORS":
			if(enemyChoice == 1) {
				System.out.println("YOU LOST!");
				enemyWins++;
			}
			else if(enemyChoice == 2) {
				System.out.println("YOU WON!");
					playerWins++;
			}
			else 
			{
			System.out.println("TIE!");
			}
			break;
		}
		
		System.out.println("The score is " + playerWins + " player wins, and " + enemyWins + " enemy wins!");
			
			
		System.out.print("\n\nWould you like to go again? (y/n): ");
		choice = scanner.next();
		}while(choice.equalsIgnoreCase("y"));
	}

}
