//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class StringRemoverRunner
{
	public static void main( String args[] )
	{
		StringRemover test = new StringRemover();
				
		//add test cases	
		test.setRemover("xR-MxR-MHelloxR-M", "R-M");
		System.out.println(test.toString());
		System.out.println();

		test.setRemover("sxsssxssxsxssexssxsesss", "xs");
		System.out.println(test.toString());
		System.out.println();
		
		test.setRemover("fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn", "qwerty");
		System.out.println(test.toString());
		System.out.println();											
	}
}