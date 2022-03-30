//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		int i = number;
		while (number > 10) {
			count += 1;
			number = number / 10;
		}
		return count + 1;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];

		for (int i = 0; i < sorted.length; i++) {
			sorted[i] = number % 10;
			number = number / 10;
		}
		
		/*for (int i = 0; i < sorted.length; i++) {
			System.out.println(sorted[i]);
		}*/
		
		// need to have two loops
		// outer loops makes sure it traverses all the elements
		// inner loop does the sorting 
		for (int i = 0; i < sorted.length - 1; i++) {
			for (int j = 0; j < sorted.length - 1 - i; j++) {
				if (sorted[j] > sorted[j + 1]) {
					int temp = sorted[j];
					sorted[j] = sorted[j + 1];
					sorted[j + 1] = temp;
				}
			}
			
		}
	
		return sorted;
	}
}