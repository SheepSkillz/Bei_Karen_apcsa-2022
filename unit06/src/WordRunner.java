//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Word test = new Word();
		
		//add test cases	
		
		test.setString("Hello");
		System.out.println(test.toString());
		System.out.println();
		
		test.setString("World");
		System.out.println(test.toString());
		System.out.println();
		
		test.setString("JukeBox");
		System.out.println(test.toString());
		System.out.println();
		
		test.setString("TCEA");
		System.out.println(test.toString());
		System.out.println();
		
		test.setString("UIL");
		System.out.println(test.toString());
		System.out.println();
	}
}