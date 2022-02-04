//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class MultTens
{
	public static String go(  int x )
	{
		if (x <= 0) {
			return "aplus";
		}
		else {
			String tens = "";
			for (int i = 1; i <= x; i++) {
				tens += i * 10;
			}
			return tens;
		}
	}
}