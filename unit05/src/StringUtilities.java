//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class StringUtilities
{
	private String word, end;
	boolean compare;
	
	public StringUtilities()
	{
		setStrings("", "");
	}
	
	public StringUtilities(String wordOne, String ending) {
		setStrings(wordOne, ending);
	}
	
	public void setStrings(String wordOne, String ending) {
	   word = wordOne;
	   end = ending;
	}
	
	public boolean endsWith(String word, String end) {
		int length = end.length();
		if (word.substring(word.length() - length, word.length()).equals(end)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return "" + compare;
	}
}
