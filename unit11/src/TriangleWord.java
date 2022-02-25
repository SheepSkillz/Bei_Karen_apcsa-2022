//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j <= i; j++) {
			// only need two loops bc three columns but only one row
				//System.out.println("k = " + k + " and i = " + i + " and j = " + j + " ");
				System.out.print(word.substring(0, i + 1));
			}
			System.out.println();
		}
	}
}