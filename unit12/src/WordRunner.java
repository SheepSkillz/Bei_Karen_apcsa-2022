//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\kbei5\\Desktop\\apcsa\\Bei_Karen_apcsa-2022\\unit12\\src\\words.dat"));

		int size = file.nextInt();
		System.out.println(size);
		
		Word[] words = new Word[size];
		
		for (int i = 0; i < size; i++) {
			words[i] = new Word(file.nextLine());
		}
		
		//part of arrays java class (methods for manipulating arrays - such as sort and search)
		Arrays.sort(words);
		
		for (int i = 0; i < size; i++) {
			System.out.println(words[i]);
		}
	}
}