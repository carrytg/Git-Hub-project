import java.util.Scanner;

public class Arvauspeli {

	public static void main(String[] args) {
		// This is a game, where user tries to guess a name.
		// You can guess as many times as you wish or leave the game.
		
		Scanner in = new Scanner (System.in);
		
		String rightAnswer = "Anton";
		String quess;
		String exit = "exit";
		
		do
		{
		
		System.out.println("Guess the name. If you wish to leave, write exit.");
		quess = in.nextLine();
		
		
		}while(!quess.equals("exit"));

	}

}
