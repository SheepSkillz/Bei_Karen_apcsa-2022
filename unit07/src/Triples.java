//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		setNum(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		
		// find the max value of the three inputs
		if (a > b && a > c) {
			max = a;
		}
		if (b > a && b > c) {
			max = b;
		}
		if (c > b && c > a) {
			max = c;
		}
		
		// see if the GCF is 1 
		int check = 0; 
		// set a counter to add each time the numbers have no remainders
		
		for (int i = 1; i < max; i++) {
		// loop through from 1 to the max number  to ensure dividing by all possible values
			
			if (a % i == 0 && b % i == 0 && c % i == 0) {
			// want all three to have no remainder bc it means that i is a gcf
				
				check += 1;
			}
		}
		
		if (check == 1) {
		// there should only be one time that all three numbers divide evenly (which is 1)
		// this is like the true condition
			return 1;
		}
		
		// if count is greater than 1, meaning multiple numbers within the loop divide evenly
		// the numbers don't satisfy the given requirements to have 1 as the only gcf
		return 0;
	}

	public String toString()
	{
		String output="";
		
		for (int i = 1; i < number; i++) {
		// gets the first number
			
			for (int j = i; j < number; j++) {
			// the second one should be greater than the first, so start loop at j = i
				
				for (int k = j; k < number; k++) {
				// find the third number which is greater than the other two
									
						if (i * i + j * j == k * k) {
							// first see if the three numbers satisfy pythagorean theorem
							
							if (k % 2 != 0) {
								// c has to be odd for either combo 
								
								if ((i % 2 == 0 && j % 2 != 0) || (i % 2 != 0 && j % 2 == 0)) {
								// see if i and j are odd/even 	
									
									if (greatestCommonFactor(i, j, k) == 1) {
									// gcf of the numbers should be 1
										
										output += i + " " + j + " " + k + "\n";
										// add the three numbers to the output string if they satisfy all above
									} // end calling gcf method
								} // end finding i and j to be even/odd if statement
							} // end finding k to be odd if statement
						} // end pythagorean theorem if statement
					} // end inner most for loop
				} // end second for loop
			} // end outer for loop
		return output+"\n";
	} // end toString()
} // end class