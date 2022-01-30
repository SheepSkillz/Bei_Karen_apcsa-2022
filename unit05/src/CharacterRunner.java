//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a letter :: ");
		char letter = keyboard.next().charAt(0);
		CharacterAnalyzer test = new CharacterAnalyzer(letter);
		out.println(test);   //A

		//add more test cases
		for (int i = 0; i < 8; i++) {
			out.print("Enter a letter :: ");
			letter = keyboard.next().charAt(0);
			test.setChar(letter); // reference the new object
			out.println(test);   
			// 1, a, 7, D, 2, X, z, 9
		}
			
			
		
		
		
		

	}
}