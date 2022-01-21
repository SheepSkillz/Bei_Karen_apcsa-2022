//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		int x1;
		int y1;
		int x2; 
		int y2;
		
		Scanner myScanner = new Scanner(System.in);
	
		System.out.println("Enter x1: ");
		x1 = myScanner.nextInt();
		System.out.println("Enter y1: ");
		y1 = myScanner.nextInt();
		System.out.println("Enter x2: ");
		x2 = myScanner.nextInt();
		System.out.println("Enter y2: ");
		y2 = myScanner.nextInt();
		
		//add test cases	
		Distance test1 = new Distance(x1, y1, x2, y2); // watch for the numbers after
		test1.calcDistance();
		test1.print();
		// order of code matters!!
		// print() cannot appear before calcDistance() because will output 0
		
		System.out.println("Enter x1: ");
		x1 = myScanner.nextInt();
		System.out.println("Enter y1: ");
		y1 = myScanner.nextInt();
		System.out.println("Enter x2: ");
		x2 = myScanner.nextInt();
		System.out.println("Enter y2: ");
		y2 = myScanner.nextInt();
		
		//can call toString by instantiating new object
		Distance test2 = new Distance(x1, y1, x2, y2); 
		test2.calcDistance();
		System.out.println(test2.toString());
		
		System.out.println("Enter x1: ");
		x1 = myScanner.nextInt();
		System.out.println("Enter y1: ");
		y1 = myScanner.nextInt();
		System.out.println("Enter x2: ");
		x2 = myScanner.nextInt();
		System.out.println("Enter y2: ");
		y2 = myScanner.nextInt();
		
		//can call toString by instantiating new object
		Distance test3 = new Distance(x1, y1, x2, y2); 
		test3.calcDistance();
		System.out.println(test3.toString());
	}
}