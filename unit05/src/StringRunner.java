//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner myScanner = new Scanner(System.in);
		String word;
		StringOddOrEven oddOrEven = new StringOddOrEven();
		
		for (int x = 0; x < 8; x++) {
			System.out.println("Enter a word :: ");
			word = myScanner.nextLine();
			oddOrEven.setString(word);
			System.out.println(oddOrEven.toString());
		}
	}
}