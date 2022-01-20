//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; // need to import libraries -> hierarchy of classes
import static java.lang.System.*; // usually don't need it
import static java.lang.Math.*; // * gives all functions inside 

public class Distance
{
	private int xOne,yOne,xTwo,yTwo; // are instance variables (have access and data type)
	// instance variables usually always private
	// -> look for where there are variables declared somewhere outside of the method
	// if wanted to know the values -> use Getters/accessor method from outside
		// might say get xOne, will give xOne
		// want authentication when method executes to exercise object oriented nature 
	// know what things are in a class (instance variables, default constructor, alternate constructors, modifier/accessor methods)
	private double distance;

	public Distance() // default constructors - same name as the class
	{
		setCoordinates(0, 0, 0, 0);
	}

	public Distance(int x1, int y1, int x2, int y2) // alternate constructor - same name but put some parameters
	{
		setCoordinates(x1, y1, x2, y2);
	}

	public void setCoordinates(int x1, int y1, int x2, int y2) // modifier or setter method of return type void
	// modify instance variables based off of the input
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calcDistance() // public String determineClosest() -> finds closest point
	{
		double xDistance = x2 - x1;
		xDistance = Math.pow(xDistance, 2);
		
		double yDistance = y2 - y1;
		yDistance = Math.pow(yDistance, 2);
		
		double sumOfXY = xDistance + yDistance;
		distance = Math.sqrt(sumOfXY);
	}
	
	public double getDistance() // getter or accessor method
	{
		return distance;
	}
	
	public void print()
	{
		System.out.printf("%.3f\n", distance);
		// System.out.println(String.format("%.3f", distance));
	}
	
	//complete print or the toString

	public String toString() // accessor 
	{
		return "";
	}
}
