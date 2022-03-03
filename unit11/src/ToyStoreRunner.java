//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		String toys = "sorry bat sorry sorry sorry train train teddy teddy ball ball";
		ToyStore ts = new ToyStore();
		ts.loadToys(toys);
		System.out.println("toyList: " + ts.toString());
		out.println("max==" + ts.getMostFrequentToy());	
		ts.sortToysByCount();
		System.out.println("sorted " + ts.toString());
	}
}