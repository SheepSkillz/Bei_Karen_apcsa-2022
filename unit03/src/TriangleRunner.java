//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import java.lang.Math.*;

public class TriangleRunner  //this class is used to test Triangle
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int a, b, c;
		
		//ask for user input
		// test 1
		System.out.print("Enter side A ::  ");
		a = keyboard.nextInt();

		System.out.print("Enter side B ::  ");
		b = keyboard.nextInt();

		System.out.print("Enter side C ::  ");
		c = keyboard.nextInt();


		Triangle test1 = new Triangle(a, b, c);
		test1.calcPerimeter();
		test1.calcArea();
		test1.print();


		//ask for user input
		// test 2
		System.out.print("Enter side A ::  ");
		a = keyboard.nextInt();

		System.out.print("Enter side B ::  ");
		b = keyboard.nextInt();

		System.out.print("Enter side C ::  ");
		c = keyboard.nextInt();

		Triangle test2 = new Triangle(a, b, c);
		test2.setSides(a,b,c);
		test2.calcPerimeter();
		test2.calcArea();
		test2.print();


		//add one more input section
		// test 3
		System.out.print("Enter side A ::  ");
		a = keyboard.nextInt();

		System.out.print("Enter side B ::  ");
		b = keyboard.nextInt();

		System.out.print("Enter side C ::  ");
		c = keyboard.nextInt();

		Triangle test3 = new Triangle(a, b, c);
		test3.setSides(a,b,c);
		test3.calcPerimeter();
		test3.calcArea();
		test3.print();



	}
}