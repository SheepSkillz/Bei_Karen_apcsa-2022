//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String game = keyboard.nextLine();	
		Toy toys = new Toy();

		toys.setName(game);
		toys.setCount(1);
		
		System.out.println(toys.toString());	
		
		game = keyboard.nextLine();	
		toys.setName(game);
		toys.setCount(5);
		
	 	System.out.println(toys.toString());		
	}
}