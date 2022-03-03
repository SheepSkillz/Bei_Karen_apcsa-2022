//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	int num;
	int den;

	//write two constructors
	public Rational() {
		setNumerator(1);
		setDenominator(1);
	}
	
	public Rational(int n1, int d1) {
		setNumerator(n1);
		setDenominator(d1);
	}

	//write a setRational method
	public void setRational(int n1, int d1) {
		setNumerator(n1);
		setDenominator(d1);
	}

	//write  a set method for numerator and denominator
	public void setNumerator(int n1) {
		num = n1;
	}
	
	public void setDenominator(int d1) { 
		den = d1;
	}

	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
		int num1 = num * other.getDenominator() + other.getNumerator() * den;
		int den1 = den * other.getDenominator();
		setRational(num1, den1);

		reduce();
	}

	private void reduce()
	{
		int gcd = gcd(num, den);
		
		if (gcd != 0 ) {
			int num1 = num / gcd;
			int den1 = den / gcd;
		
			setRational(num1, den1);
		}
	}

	private int gcd(int numOne, int numTwo)
	{
		int gcd = 0; 
		for (int i = 1; i <= numOne; i++) {
			if (numOne % i == 0 && numTwo % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}

	public Object clone ()
	{
		// create a clone of the current object
		// manually clone they return it
		
		Rational r = new Rational();
		r.setNumerator(num);
		r.setDenominator(den);

		return r;
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNumerator() {
		return num;
	}
	
	public int getDenominator( ) {
		return den;
	}
	
	
	public boolean equals(Object obj)
	{
		Rational other = (Rational)obj;
		other.reduce();
		if (num == other.getNumerator() && den == other.getDenominator()) {
			return true;
		}
		return false;
	}

	public int compareTo(Rational other)
	{
		other.reduce();
		if (num > other.getNumerator() && den > other.getDenominator()) {
			return 1;
		}
		if (num == other.getNumerator() && den == other.getDenominator()) {
			return 0;
		}
		return -1;
	}


	//write  toString() method
	public String toString() {
		return "" + num + "/" + den;
	}
	
	
}