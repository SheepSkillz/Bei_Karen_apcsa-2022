//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class VowelCounter
{
	public static String getNumberString( String s)
	{
		int num = 0;
		String output = "";
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) == 'A') || (s.charAt(i) == 'E') || (s.charAt(i) == 'I') || (s.charAt(i) == 'O')
					|| (s.charAt(i) == 'U') || (s.charAt(i) == 'a') || (s.charAt(i) == 'e') 
					|| (s.charAt(i) == 'i') || (s.charAt(i) == 'o') || (s.charAt(i) == 'u')) {
				output += num;
				num++;
				if (num > 9) {
					num = 0;
				}
			}
			else {
				output += s.charAt(i);
			}
		}
		return output;
	}
}


