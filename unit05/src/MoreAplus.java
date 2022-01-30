//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class MoreAplus
{
   public static String go( String a )
	{
		int counter = 0;
		if (a.length() < 5) {
			return "no";
		}
		
		for (int i = 0; i < a.length() - 5; i++) {
			if (a.substring(i, i + 5).equals("aplus")){
				counter += 1;
			}
		}
		
		if (counter <= 1) {
			return "no";
		}
		
		else {
			return "yes";
		}
	}
}
