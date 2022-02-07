//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		
		// run at least once
		System.out.println("Rock-Paper-Scissors - pick your weapon [R,P,S] :: ");

		String player = "";
		
		//read in the player value
		player = keyboard.next();
	
		RockPaperScissors game = new RockPaperScissors();
		game.setPlayers(player);
		System.out.println(game.toString());
		System.out.println();
		
		System.out.println("Do you want to play again?");
		response = keyboard.next().charAt(0);
		
		//add in a do while loop after you get the basics up and running
		do {
			player = "";
		
			out.print("pick your weapon [R,P,S] :: ");
			
			//read in the player value
			player = keyboard.next();
		
			game.setPlayers(player);
			System.out.println(game.toString());
			System.out.println();
			
			System.out.println();
			System.out.println("Do you want to play again?");
			response = keyboard.next().charAt(0);
		}
		while (response == 'y' || response == 'Y');
	}
}



