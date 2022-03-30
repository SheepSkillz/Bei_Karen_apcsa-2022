//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		//add test cases
		int[] n = NumberShifter.makeLucky7Array(10);
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i]);
		}
		System.out.println();
		NumberShifter.shiftEm(n);
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i]);
		}
	}
}



