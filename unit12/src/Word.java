//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}

	public int compareTo( Word rhs )
	{		
		// only if lengths are the same is it necessary to compare the alpha letters
		if (word.length() == rhs.word.length()) {
			return word.compareTo(rhs.word);
		}
		if (word.length() > rhs.word.length()) {
			return 1;
		}
		return -1;
	}

	public String toString()
	{
		return word;
	}
}