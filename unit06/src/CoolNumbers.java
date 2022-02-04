//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class CoolNumbers 
{
	/*
	 *method isCoolNumber will return true if
	 *	num % 3-6 all have a remainder of 1
	 *it will return false otherwize
	 */
	public static boolean isCoolNumber( int num )
	{
		if ((num % 3 == 1) && (num % 4 == 1) && (num % 5 == 1) && (num % 6 == 1)) {
			return true;
		}
		return false;
	}
	
		/*
	 *method countCoolNumbers will return the count
	 *of the coolNumbers between 6 and stop
	 */
	public static int countCoolNumbers( int stop )
	{
		int count = 0;
		for (int i = 6; i < stop; i++) {
			if (isCoolNumber(i)) {
				count += 1;
			}
		}
		return count;
	}
}