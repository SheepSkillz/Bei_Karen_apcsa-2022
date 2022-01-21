//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);

		int dist, hrs, mins;
		
		// test 1
		out.print("Enter the distance :: ");
		dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		mins = keyboard.nextInt();

		MilesPerHour test1 = new MilesPerHour(dist, hrs, mins);
		test1.calcMPH();
		test1.print();
		
		//add more test cases
		// test 2
		out.print("Enter the distance :: ");
		dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		mins = keyboard.nextInt();
		
		MilesPerHour test2 = new MilesPerHour(dist, hrs, mins);
		test2.calcMPH();
		test2.print();
		
		// test 3
		out.print("Enter the distance :: ");
		dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		mins = keyboard.nextInt();
		
		MilesPerHour test3 = new MilesPerHour(dist, hrs, mins);
		test3.calcMPH();
		test3.print();
		
		// test 4
		out.print("Enter the distance :: ");
		dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		mins = keyboard.nextInt();
		
		MilesPerHour test4 = new MilesPerHour(dist, hrs, mins);
		test4.calcMPH();
		test4.print();
		
	}
}