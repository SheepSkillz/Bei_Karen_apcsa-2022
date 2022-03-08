//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	//add instance variables
	String name;
	int size;

	//add a constructor
	public Skeleton(String nm, int sz) {
		name = nm;
		size = sz;
	}

	//add code to implement the Monster interface
	public int getHowBig() {
		return size;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isBigger(Monster other) {
		if (size > other.getHowBig()) {
			return true;
		}
		return false;
	}
	public boolean isSmaller(Monster other) {
		if (size < other.getHowBig()) {
			return true;
		}
		return false;
	}
	
	public boolean namesTheSame(Monster other) {
		if (name.equals(other.getName())) {
			return true;
		}
		return false;
	}

	//add a toString
	public String toString() {
		return "" + name + " " + size;
	}
}
