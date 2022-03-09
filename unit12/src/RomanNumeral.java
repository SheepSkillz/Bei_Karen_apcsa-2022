//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class RomanNumeral implements Comparable<RomanNumeral>
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		setRoman(str);
		setNumber(getNumber());
	}

	public RomanNumeral(Integer orig)
	{
		setNumber(orig);
		setRoman(getRoman());
	}

	//write a set number method
	public void setNumber(Integer num) {
		number = num;
	}
	
	//write a set roman method
	public void setRoman(String str) {
		roman = str;
	}
	
	//write get methods for number and roman
	public int getNumber() {
		// Locate the first individual roman number in the roman number string. 
		//Sum up the numeric value of the individual number. 
		//Chop of the individual roman numeral from the string 
		// continue the process if the string has more numbers left.
		int sum = 0;
		for (int i = 0; i < roman.length(); i++) {
			//System.out.println("2 " + roman.substring(i, i + 2));
			for (int j = 0; j < LETTERS.length; j++) {
				if (roman.substring(i, i + 1).equals(LETTERS[j])) {
					//System.out.println(sum);
					sum += NUMBERS[j];
					//roman = roman.substring(i);
					//System.out.println(sum);
				}
				if (i != roman.length() - 1) {
					if (roman.substring(i, i + 2).equals(LETTERS[j])) {
						sum += NUMBERS[j];
						//System.out.println(sum);
						i++;
					}
				}
			}
		}
		return sum;
	}
	
	public String getRoman() {
		return roman;
	}
	
	public int compareTo(RomanNumeral r)
	{
		int num = r.getNumber();
		return getNumber() - num;
	}

	//write  toString() method
	public String toString() {
		String str = "";
		for (int i = 0; i < NUMBERS.length; i++) {
			while (number >= NUMBERS[i]) {
				// add the value to the sum
				number = number - NUMBERS[i];
				// add the roman letter to the string if the numerical value matches
				str += LETTERS[i];
			}
		}
		return str;
	}
}//end class