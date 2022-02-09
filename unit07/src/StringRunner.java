//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class StringRunner
{
	public static void main(String args[])
	{
		BiggestString test = new BiggestString();
		
		//add test cases
		test.setStrings("abc", "cba", "bca");
		System.out.println(test.toString());
		
		test.setStrings("one", "fourteen", "twenty");
		System.out.println(test.toString());
		
		test.setStrings("124323", "20009", "3434");
		System.out.println(test.toString());
		
		test.setStrings("abcde", "ABCDE", "12342343234");
		System.out.println(test.toString());

	}
}