//(c) A+ Computer Science
// www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int x1,y1,x2,y2;

	public Distance()
	{
		setCoordinates(0, 0, 0, 0);
	}

	public Distance(int xOne, int yOne, int xTwo, int yTwo)
	{
		setCoordinates(xOne, yOne, xTwo, yTwo);
	}

	public void setCoordinates(int xOne, int yOne, int xTwo, int yTwo)
	{
		x1 = xOne;
		y1 = yOne;
		x2 = xTwo;
		y2 = yTwo;
	}

	public String determineClosest( )
	{
		// x1 and y1 are truck A, x2 and y2 are truck B
		double distanceA = 0.0, distanceB = 0.0;
		String result="";
		
		distanceA = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
		
		distanceB = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));

		if (distanceA > distanceB) {
			result = "B is closer to (0, 0)" + "\n";
		}
		else {
			result = "A is closer to (0, 0)" + "\n";
		}
		return result;
	}
	
	public String toString()
	{
		return "";
	}
}