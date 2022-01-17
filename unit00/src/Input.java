//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Input
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int intOne, intTwo;
		double doubleOne, doubleTwo;
		float floatOne, floatTwo;
		short shortOne, shortTwo;
		byte byteOne, byteTwo;
		long longOne, longTwo;
		char charOne, charTwo;
		boolean booleanOne, booleanTwo;
		String stringOne, stringTwo;


		System.out.print("Enter an integer :: ");
		intOne = keyboard.nextInt();


		System.out.print("Enter an integer :: ");
		intTwo = keyboard.nextInt();
		
		
		System.out.print("Enter a double :: ");
		doubleOne = keyboard.nextDouble();

		
		System.out.print("Enter a double :: ");
		doubleTwo = keyboard.nextDouble();
		
		
		System.out.print("Enter a float :: ");
		floatOne = keyboard.nextFloat();

		
		System.out.print("Enter a float :: ");
		floatTwo = keyboard.nextFloat();
		
		
		System.out.print("Enter a short :: ");
		shortOne = keyboard.nextShort();

		
		System.out.print("Enter a short :: ");
		shortTwo = keyboard.nextShort();

		
		System.out.print("Enter a byte :: ");
		byteOne = keyboard.nextByte();

		
		System.out.print("Enter a byte :: ");
		byteTwo = keyboard.nextByte();


		System.out.print("Enter a long :: ");
		longOne = keyboard.nextLong();

		
		System.out.print("Enter a long :: ");
		longTwo = keyboard.nextLong();


		System.out.print("Enter a char :: ");
		charOne = keyboard.next().charAt(0);

		
		System.out.print("Enter a char :: ");
		charTwo = keyboard.next().charAt(0);
		
		
		System.out.print("Enter a boolean :: ");
		booleanOne = keyboard.nextBoolean();

		
		System.out.print("Enter a boolean :: ");
		booleanTwo = keyboard.nextBoolean();


		System.out.print("Enter a string :: ");
		stringOne = keyboard.next();

		
		System.out.print("Enter a string :: ");
		stringTwo = keyboard.next();


		//add in input for all variables


		System.out.println();
		System.out.println("integer one = " + intOne );
		System.out.println("integer two = " + intTwo );
		
		System.out.println();
		System.out.println("double one = " + doubleOne );
		System.out.println("double two = " + doubleTwo );

		System.out.println();
		System.out.println("float one = " + floatOne );
		System.out.println("float two = " + floatTwo );

		System.out.println();
		System.out.println("short one = " + shortOne );
		System.out.println("short two = " + shortTwo );
		
		System.out.println();
		System.out.println("byte one = " + byteOne );
		System.out.println("byte two = " + byteTwo );

		System.out.println();
		System.out.println("long one = " + longOne );
		System.out.println("long two = " + longTwo );
		
		System.out.println();
		System.out.println("char one = " + charOne );
		System.out.println("char two = " + charTwo );
		
		System.out.println();
		System.out.println("boolean one = " + booleanOne );
		System.out.println("boolean two = " + booleanTwo );

		System.out.println();
		System.out.println("string one = " + stringOne );
		System.out.println("string two = " + stringTwo );


		//add in output for all variables


	}
}