//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		setNums(dist, hrs, mins);
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		double totalTime = hours + minutes / 60.0;
		mph = Math.round(distance / totalTime);
		// if casting to int here, still stored as a double bc mph is defined as double
	}

	public void print()
	{
		System.out.println(distance + " miles in " + hours + " hour and " + minutes + " minutes = " + (int) mph + " MPH.");
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return distance + " miles in " + hours + " hour and " + minutes + " minutes = " + (int) mph + " MPH.";
	}
}