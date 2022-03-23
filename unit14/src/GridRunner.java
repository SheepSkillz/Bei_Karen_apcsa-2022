//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		// how to pass in a string array as parameter
		Grid g = new Grid(7, 7, new String[]{"a", "b", "c", "7", "9", "x", "2"});
		System.out.println(g.toString());
		System.out.println("a count is " + g.countVals("a"));
		System.out.println("b count is " + g.countVals("b"));
		System.out.println("c count is " + g.countVals("c"));
		System.out.println("7 count is " + g.countVals("7"));
		System.out.println("x count is " + g.countVals("x"));
		System.out.println("9 count is " + g.countVals("9"));
		System.out.println("2 count is " + g.countVals("2"));
		System.out.println();
		System.out.println(g.findMax(new String[]{"a", "b", "c", "7", "9", "x", "2"}) + " occurs the most");
	}
}