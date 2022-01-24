//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Lab  -

import static java.lang.System.*; 
import java.util.Scanner;

public class LeapYearRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		int year;
			
		for (int x = 0; x < 7; x++) {
			System.out.println("Enter a year :: ");
			year = keyboard.nextInt();
			if (LeapYear.isLeapYear(year) == true) {
				System.out.println(year + " is a leap year." + "\n");
			}
			else {
				System.out.println(year + " is NOT a leap year." + "\n");
			}
			
		}
	}
}