//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		String[] words = sentence.split(" ");
		wordRay = new String[words.length];
		for (int i = 0; i < words.length; i++) {
			wordRay[i] = words[i];
		}
	}

	public void sort()
	{
		for (int i = 0; i < wordRay.length - 1; i++) {
			for (int j = 0; j < wordRay.length - 1 - i; j++) {
				if (wordRay[j].compareTo(wordRay[j + 1]) > 0) {
					String temp = wordRay[j];
					wordRay[j] = wordRay[j + 1];
					wordRay[j + 1] = temp;
				}
			}
		}
	}

	public String toString()
	{
		String output="";
		sort();
		for (String s: wordRay) {
			output += s + "\n";
		}
		return output+"\n\n";
	}
}