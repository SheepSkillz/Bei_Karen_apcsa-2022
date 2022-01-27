//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class Social
{
   public static String go( String a )
	{
	   if ((a.substring(3, 4).equals("-")) && (a.substring(6, 7).equals("-"))) {
		   // have to use .equals() when wanting to compare two strings
		   // == will only check for the location, not content
		   return a.substring(7, a.length());
	   }
	   else {
		   return "bad";
	   }
	}
}

/*

EXPECTED RUNNER OUTPUT
 
good
bad
good
bad
good
good
bad
bad

*/