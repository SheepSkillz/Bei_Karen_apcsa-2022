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
//		if (max == a) {
//			if (a % b != 0 && a % c != 0) {
//				return 1;
//			}
//		}
//		if (max == b) {
//			if (b % a != 0 && b % c != 0) {
//				return 1;
//			}
//		}
//		if (max == c) {
//			if (c % b != 0 && c % a != 0) {
//				return 1;
//			}
//		}	
		
		int check = 0; 
		for (int i = 1; i < max; i++) {
			if (a % i == 0 && b % i == 0 && c % i == 0) {
				check += 1;
			}
		}
		
		if (check == 1) {
			return 1;
		}
		
		// if the other two numbers are factors, then gcf != 0 -> return 0
		return 0;
	}

	public String toString()
	{
		String output="";
		
		for (int i = 1; i < number; i++) {
			for (int j = i; j < number; j++) {
				for (int k = j; k < number; k++) {
									
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
									}
								}
							}
						}
					} // end inner most for loop
				} // end second for loop
			} // end outer for loop
		return output+"\n";
	} // end toString()
} // end class