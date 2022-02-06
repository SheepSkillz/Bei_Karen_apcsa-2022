//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter('x');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		char l = letter;
		String output="";
		for (int i = 0; i < amount; i++) {
		// outer loop works the amount of rows
		/* so in the below case, there would be 3 rows
		 * xxxxx
		 * xxx
		 * x
		 */
			for (int j = 0; j < amount - i; j++) {
			// inner loop works the columns of each row
			/* ex. would want j to equal five, then subtract two each time
			 * xxxxx
			 * xxx
			 * x
			 */
				if (letter + j > 90) {
					l = (char) ('A' + letter + j - 91) ;
				}
				else {
					l = (char) (letter + j);
				}
				for (int k = amount - j; k > 0; k--) {
					output += l;
				}
				if (j == amount - 1 - i) {
					output += "\n";
				}
				else {
					output += " ";
				}
			}
		}
		return output;
	}
}