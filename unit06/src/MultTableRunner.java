//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class MultTableRunner
{
	public static void main ( String[] args )
	{
		MultTable test = new MultTable();
		
		//add test cases
		test.setTable(5, 5);
		test.printTable();
		System.out.println();
		
		test.setTable(3, 7);
		test.printTable();
		System.out.println();
		
		test.setTable(1, 6);
		test.printTable();
		System.out.println();
		
		test.setTable(9, 9);
		test.printTable();
		System.out.println();
		
		test.setTable(7, 8);
		test.printTable();
		System.out.println();
		
	}
}