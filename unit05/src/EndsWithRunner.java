//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Lab  -

import static java.lang.System.*; 
import java.util.Scanner;

public class EndsWithRunner
{
	public static void main ( String[] args )
	{
		StringUtilities test = new StringUtilities(); // have to define new object
		
		System.out.println( test.endsWith("chicken", "en"));
		System.out.println( test.endsWith("chicken", "dog"));
		System.out.println( test.endsWith("alligator", "gator"));
		System.out.println( test.endsWith("alligator", "all"));
		System.out.println( test.endsWith("apluscompsci", "sci"));
		System.out.println( test.endsWith("apluscompsci", "comp"));
				
		//test cases				
		/*chicken en
			chicken dog
			alligator gator
			alligator all
			apluscompsci sci */
			
		//output
		/*true
			false
			true
			false
			true
			false*/

	}
}