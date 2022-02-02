//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
		setRemover("", 'x');
	}

	//add in second constructor
	public LetterRemover(String s, char rem) {
		setRemover(s, rem);
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned = ""; // start with null string
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) != (lookFor)) {
				cleaned = cleaned + sentence.charAt(i); 
				// add on each letter that isn't the one to remove
			}
		}
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters();
	}
}