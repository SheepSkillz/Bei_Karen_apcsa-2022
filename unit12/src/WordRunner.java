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
		Scanner file = new Scanner(new File("words.dat"));
		// pass to it new file from home directory

		int size = file.nextInt();
		file.nextLine();
		
		Word[] words = new Word[size];
		for (int i = 0; i < words.length; i++) {
			words[i] = new Word(file.nextLine());
			// next line moves to next line to read the next parameter
		}
		
		Arrays.sort(words);
		
		for (Word word: words) {
			out.println(word);
		}
		











	}
}