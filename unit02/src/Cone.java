//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class Cone
{
	public static double volume( double radius, int height)
	{		
		return (double) Math.PI * radius * radius * height / 3;
		// unable to write fractions as 1/3
		// prob has to be 1.0/3.0 so as not to be integers and then convert to 0
		// so how do you write a fraction in java??
	}
}