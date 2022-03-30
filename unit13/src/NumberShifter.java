//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] i = new int[size];
		for (int j = 0; j < i.length; j++) {
			i[j] = (int)(Math.random() * 10) + 1;
		}
		return i;
	}
	
	public static void shiftEm(int[] array)
	{
		int index7 = 0;
		for (int j = 0; j < array.length; j++) {
			if (array[j] == 7) {
				int temp = array[index7];
				array[index7] = array[j];
				array[j] = temp;
				index7++;
			}
		}
	}
}