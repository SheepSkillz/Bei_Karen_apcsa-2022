//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;

	public GuessingGame(int stop)
	{
		upperBound = stop;
	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Guessing Game - how many numbers? ");
		
		int response = keyboard.nextInt();
		int number = (int) Math.ceil(Math.random() * upperBound);
		
		int guesses = 0;
		
		do {
			System.out.println("Enter a number between 1 and " + upperBound);
			if (response > upperBound || response < 1) {
				System.out.println("Number out of range!");
			}
			guesses += 1;
		}
		while (response != number);
		
		System.out.println("It took " + guesses + " guesses to guess" + number);
		

	}

	public String toString()
	{
		String output="";
		output += 
		output += "You guessed wrong " + " percent of the time";
	
			
		return output;
	}
}