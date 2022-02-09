//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

class TriangleWord
{
   private String word;

	public TriangleWord()
	{
		setWord("");
	}

	public TriangleWord(String w)
	{
		setWord(w);
	}

	public void setWord(String w)
	{
		word = w;
	}

	public String toString()
	{
		String output="";
		int length = word.length();
		
		for (int i = 0; i < length - 1; i++) {
			System.out.println(" ");
		}
		System.out.println(word.charAt(0));
		System.out.println();
		
		for (int i = 1; i < length - 2; i++) {
			for (int j = 0; j < length - 1 - i; j++) {
				System.out.println(" ");
			}
		}
		
		return output+"\n";
	}
}