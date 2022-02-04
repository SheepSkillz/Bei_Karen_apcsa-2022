//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TenToAny
{
   private int base10;
   private int newBase;

	//add constructors
   	public TenToAny() {
   		setNums(0, 0);
   	}
   	
   	public TenToAny(int base, int base2) {
   		setNums(base, base2);
   	}

	//add a set method
   	public void setNums(int base, int base2) {
   		base10 = base;
   		newBase = base2;
   	}

	public String getNewNum()
	{
		String newNum="";
		int num = base10;
		while (num > 0) { 
			if (num % 2 > 10 && newBase > 9) {
				newNum = 'A' + (char) (num % 2 - 10) + newNum;
			}
			else {
				newNum = num % newBase + newNum;
			}

			num = num / newBase;			
		}
		return newNum;
	}

	//add a toString method	
	public String toString() {
		return "" + base10 + " base 10 is " + getNewNum() + " in base " + newBase;
	}
	
}