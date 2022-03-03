//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Words
{
	private ArrayList<Word> words;

	public Words()
	{
		words = new ArrayList<Word>();
	}

	public Words(String wordList) 	
	{
		setWords(wordList);

	}

	public void setWords(String wordList)
	{
		String[] word = wordList.split(" ", 0);
		int count = 0;
		for (String w: word) {
			System.out.println("w" + w);
			words.set(count, new Word(w));
			count++;
		}
	}
	
	public int countWordsWithXChars(int size)
	{
		int count=0;

		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).getLength() == size) {
				count += 1;
			}
		}
		
		return count;
	}
	
	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
		int count = 0;
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).getLength() == size) {
				count += words.get(i).getNumVowels();
				words.remove(i);
			}
		}
		return count;
	}

	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;

		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).getNumVowels() == numVowels) {
				count += 1;
			}
		}

		return count;
	}
	
	public String toString()
	{
	   return "";
	}
}