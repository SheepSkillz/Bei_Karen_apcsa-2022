//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		//add test cases
	   	WordsCompare test = new WordsCompare();
		
		test.setWords("abe", "ape");
		test.compare(); // need to tell computer every time to take a new comparison
		System.out.println(test.toString());
		
		test.setWords("giraffe", "gorilla");
		test.compare(); // when each new test doesn't have compare(), uses old values (like the one above) or 0 (if default)
		System.out.println(test.toString());
		
		test.setWords("one", "two");
		test.compare();
		System.out.println(test.toString());
		
		test.setWords("fun", "funny");
		test.compare();
		System.out.println(test.toString());
		
		test.setWords("123", "19");
		test.compare();
		System.out.println(test.toString());
		
		test.setWords("193", "1910");
		test.compare();
		System.out.println(test.toString());
		
		test.setWords("goofy", "godfather");
		test.compare();
		System.out.println(test.toString());
		
		test.setWords("funnel", "fun");
		test.compare();
		System.out.println(test.toString());
	}
}