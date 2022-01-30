//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringFirstLetterRunner
{
	public static void main( String args[] )
	{
		//add test cases
		StringFirstLetterCheck test = new StringFirstLetterCheck();
		
		test.setWords("hello", "howdy");
		System.out.println(test.toString());
		
		test.setWords("one", "two");
		System.out.println(test.toString());
		
		test.setWords("three", "two");
		System.out.println(test.toString());
		
		test.setWords("TCEA", "UIL");
		System.out.println(test.toString());
		
		test.setWords("State", "Champions");
		System.out.println(test.toString());
		
		test.setWords("ABC", "DEF");
		System.out.println(test.toString());
	}
}