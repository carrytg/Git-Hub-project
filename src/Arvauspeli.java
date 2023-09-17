import java.util.Scanner;

public class Arvauspeli {

	public static void main(String[] args) {
		// This is a game, where user tries to guess a name.
		// You can guess as many times as you wish or leave the game.
		
		Scanner in = new Scanner (System.in);
		
		String rightAnswer = "Anton";
		String guess;
		String exit = "exit";
		int guesses = 0;
		
		do
		{
		
		System.out.println("Guess the name. If you wish to leave, write exit.");
		guess = in.nextLine();
		
		// right answer
		if (guess.equals("Anton"))
		{
			guesses++;
			System.out.println("Great! You guessed right!");
			break;
		}	
		// exit
		else if (guess.equals("exit"))
		{
			break;
		}
		
		// wrong answer and wrong answer also gives the first letter
		else
		{
			guesses++;
			System.out.print("First letter of the name is: ");
			System.out.println(rightAnswer.charAt(0));
		}
	
		}while(!guess.equals("exit"));
		
		System.out.println("You guessed " + guesses + " times.");
		
	}

}
