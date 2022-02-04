//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class MultTable
{
	private int number;
	private int stop;

	public MultTable()
	{
		number=stop=0;
	}

	public MultTable(int num, int end)
	{
		setTable(num, end);
	}

	public void setTable(int num, int end)
	{
		number = num;
		stop = end;
	}

	public void printTable( )
	{
		System.out.println("Multiplication table for " + number);
		for (int i = 1; i <= stop; i++) {
			System.out.print(i + "	" + i * number + "\n");
		}
	}
}