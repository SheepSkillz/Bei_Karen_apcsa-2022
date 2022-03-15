package activity1; // this line is required as the project is under the package titled "activity 1", not "(default package)"

import activity9.Card;

public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card test1 = new Card("K", "spade", 13);
		System.out.println(test1.toString());

		Card test2 = new Card("10", "clubs", 10);
		System.out.println(test2.toString());
		
		Card test3 = new Card("ace", "diamonds", 1);
		System.out.println(test3.toString());
		
		Card test4 = new Card("7", "hearts", 7);
		Card test5 = new Card("7", "hearts", 7);
		
		System.out.println(test1.matches(test2));
		System.out.println(test2.matches(test4));
		System.out.println(test4.matches(test5));
		
	}
}