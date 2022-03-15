package activity2;

import activity9.Deck;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		System.out.println("test0");
		String [] ranks = {"jack", "queen", "king"};
		String[] suits = {"blue", "red"};
		int[] pointValues = {11, 12, 13};
		Deck d = new Deck(ranks, suits, pointValues);
		System.out.println("is empty " + d.isEmpty());
		System.out.println("to string " + d.toString());
		System.out.println("size " + d.size());
		System.out.println("deal " + d.deal());
		System.out.println("deal " + d.deal());
		System.out.println("deal " + d.deal());
		System.out.println("to string " + d.toString());
		System.out.println("deal " + d.deal());
		System.out.println("deal " + d.deal());
		System.out.println("deal " + d.deal());
		System.out.println("to string " + d.toString());
		System.out.println("deal " + d.deal());
		System.out.println("to string " + d.toString());
		
//		System.out.println("test1");
//		String[] ranks1 = {"4", "2", "3"};
//		String[] suits1 = {"purple", "pink", "green"};
//		int[] pointValues1 = {4, 2, 3};
//		Deck d1 = new Deck(ranks1, suits1, pointValues1);
//		System.out.println("is empty " + d1.isEmpty());
//		System.out.println("to string " + d1.toString());
//		System.out.println("size " + d1.size());
//		System.out.println("deal " + d1.deal());
//		System.out.println("deal " + d1.deal());
//		System.out.println("deal " + d1.deal());
//		System.out.println("to string " + d1.toString());
//		System.out.println("deal " + d1.deal());
//		System.out.println("deal " + d1.deal());
//		System.out.println("deal " + d1.deal());
//		System.out.println("to string " + d1.toString());
//		System.out.println("deal " + d1.deal());
//		System.out.println("to string " + d1.toString());

//		System.out.println("test2");
//		String[] ranks2 = {"ace", "7", "10", "11"};
//		String[] suits2 = {"spades", "diamonds", "hearts", "clubs"};
//		int[] pointValues2 = {1, 7, 10, 11};
//		Deck d2 = new Deck(ranks2, suits2, pointValues2);
//		System.out.println("is empty " + d2.isEmpty());
//		System.out.println("to string " + d2.toString());
//		System.out.println("size " + d2.size());
//		System.out.println("deal " + d2.deal());
//		System.out.println("deal " + d2.deal());
//		System.out.println("deal " + d2.deal());
//		System.out.println("to string " + d2.toString());
//		System.out.println("deal " + d2.deal());
//		System.out.println("deal " + d2.deal());
//		System.out.println("deal " + d2.deal());
//		System.out.println("to string " + d2.toString());
//		System.out.println("deal " + d2.deal());
//		System.out.println("to string " + d2.toString());
		
		System.out.println("test3: deck of cards");
		String[] ranks3 = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
		String[] suits3 = {"spades", "diamonds", "hearts", "clubs"};
		int[] pointValues3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		Deck d3 = new Deck(ranks3, suits3, pointValues3);
		System.out.println(d3.toString());
		d3.shuffle();
		System.out.println("shuffle 1");
		System.out.println(d3.toString());
		d3.shuffle();
		System.out.println("shuffle 2");
		System.out.println(d3.toString());
		System.out.println(d3.deal());
		System.out.println(d3.toString());
		
	}
}
