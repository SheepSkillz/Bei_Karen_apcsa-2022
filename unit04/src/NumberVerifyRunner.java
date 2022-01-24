//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		Scanner myScanner = new Scanner(System.in);
		
		//add in input
		System.out.println("Enter a whole number :: ");
		int num = myScanner.nextInt();
		System.out.println(num + " is odd :: " + NumberVerify.isOdd(num));
		System.out.println(num + " is even :: " + NumberVerify.isEven(num));
		System.out.println();
		
		//add in more test cases
		System.out.println("Enter a whole number :: ");
		num = myScanner.nextInt();
		System.out.println(num + " is odd :: " + NumberVerify.isOdd(num));
		System.out.println(num + " is even :: " + NumberVerify.isEven(num));
		System.out.println();
		
		System.out.println("Enter a whole number :: ");
		num = myScanner.nextInt();
		System.out.println(num + " is odd :: " + NumberVerify.isOdd(num));
		System.out.println(num + " is even :: " + NumberVerify.isEven(num));
		System.out.println();
		
		System.out.println("Enter a whole number :: ");
		num = myScanner.nextInt();
		System.out.println(num + " is odd :: " + NumberVerify.isOdd(num));
		System.out.println(num + " is even :: " + NumberVerify.isEven(num));
		System.out.println();
		
		System.out.println("Enter a whole number :: ");
		num = myScanner.nextInt();
		System.out.println(num + " is odd :: " + NumberVerify.isOdd(num));
		System.out.println(num + " is even :: " + NumberVerify.isEven(num));
		System.out.println();
		
	}
}