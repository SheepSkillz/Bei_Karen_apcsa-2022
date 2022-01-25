//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   int end = a.length() - 1;
	   if ((a.charAt(0) == 'a') || (a.charAt(0) == 'e') || (a.charAt(0) == 'i') || (a.charAt(0) == 'o') || (a.charAt(0) == 'u')) {
		   return "yes";
	   }
	   else if ((a.charAt(0) == 'A') || (a.charAt(0) == 'E') || (a.charAt(0) == 'I') || (a.charAt(0) == 'O') || (a.charAt(0) == 'U')) {
		   return "yes";
	   }   
	   else if ((a.charAt(end) == 'a') || (a.charAt(end) == 'e') || (a.charAt(end) == 'i') || (a.charAt(end) == 'o') || (a.charAt(end) == 'u')) {
		   return "yes";
	   }
	   else if ((a.charAt(end) == 'A') || (a.charAt(end) == 'E') || (a.charAt(end) == 'I') || (a.charAt(end) == 'O') || (a.charAt(end) == 'U')) {	   
		   return "yes";
	   }
	   else {
		   return "no";
	   }
	}
}