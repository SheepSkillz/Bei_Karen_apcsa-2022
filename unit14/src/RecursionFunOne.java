//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countOddDigits(int num)
	{
		int n = num;
		if (num == 0) {
			return 0;
		}
		// find the least significant digit
		if (n > 10) {
			n = n % 10;
		}

		// divide by 10 to truncate the least significant + repeat
		if (n % 2 != 0) {
			return 1 + countOddDigits(num / 10)                                                                    ;
		}
		else {
			return 0 + countOddDigits(num / 10);
		}
	}
}