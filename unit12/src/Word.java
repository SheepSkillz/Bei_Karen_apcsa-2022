//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
// goes to compareTo method to implement interface
{
	private String word; // collection of Words

	public Word( String s )
	{
		word = new String(s);
	}

	public int compareTo( Word rhs )
	{		
		// sort by length first
		// if lengths the same, then alphabetical
		if (word.length() == rhs.word.length()) {
			return word.compareTo(rhs.word);
		}
		else if (word.length() > rhs.word.length()) {
			return 1;
		}
		return -1;
	}

	public String toString()
	{
		return "";
	}
}