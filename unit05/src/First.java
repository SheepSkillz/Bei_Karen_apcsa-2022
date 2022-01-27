//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class First
{
   public static String go( String a )
	{
	   for (int i = 1; i < a.length(); i++) {
		   if (a.substring(i, i + 1).equals(a.substring(0, 1))) {
			   return "yes";
		   }
	   }
	   return "no";
	}
}



/*

EXPECTED RUNNER OUTPUT
 
no
yes
no
no
yes
no
yes
yes
no
no


*/