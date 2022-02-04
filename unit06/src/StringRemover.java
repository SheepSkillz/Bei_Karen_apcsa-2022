//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

class StringRemover
{
   private String sentence;
   private String remove;

	//add in constructors
	public StringRemover() {
		setRemover("", "");
	}
	
	public StringRemover(String s, String rem) {
		setRemover(s, rem);
	}

	public void setRemover(String s, String rem)
	{
		sentence = s;
		remove = rem;
	}

	public String removeStrings()
	{
		int length = remove.length();
		String cleaned = sentence;
		int index = cleaned.indexOf(remove);
		while (index != -1) {
//			for (int i = 0; i < cleaned.length() - length; i++) {
//				if (cleaned.substring(i, i + length).equals(remove)) {
					cleaned = cleaned.substring(0, index - 1) + cleaned.substring(index + length, cleaned.length());
					index = cleaned.indexOf(remove); // moves to next one, if one
//					sentence.substring(i + 1, i + 2 + length).equals(remove)) {
//					cleaned += sentence.charAt(i);
//					i += length;
				//} 
			//}
		}
		return cleaned;
	}

	public String toString()
	{
		return "" + sentence + " - string to remove " + remove + "\n" + removeStrings();
	}
}