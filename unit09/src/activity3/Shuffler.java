package activity3;

/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 4;

	/**
	 * The number of values to shuffle.
	 */
	private static final int VALUE_COUNT = 7;

	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	
	//rather use integers to simulate the card
	
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = new int[VALUE_COUNT];
		for (int i = 0; i < values1.length; i++) {
			values1[i] = i;
			}
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = new int[VALUE_COUNT];
		for (int i = 0; i < values2.length; i++) {
			values2[i] = i;
			}
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
	}

	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		
		// example: 
		//    initial "deck": 0 1 2 3 4 5 6 7
		//    result "deck": 4 0 5 1 6 2 7 3
		
		// create two sub-decks, one containing the top half, and one containing the bottom half
		// take one "card" from bottom half and put it into the shuffled deck, then
		// take another "card" from the top half and put it into the shuffled deck, then
		// repeat the above two steps for all the "cards"
		
		//Initialize shuffled to contain 52 �empty� elements.
		int[] shuffled = new int[values.length];
		//Set k to 0.
		int k = 0;

//		For j = 0 to 25,
//		- Copy cards[j] to shuffled[k] 
//		- Set k to k+2.
		for (int j = 0; j < (values.length + 1) / 2; j++) {
			shuffled[k] = values[j];
			k = k + 2;
		}

//		Set k to 1.
		k = 1;
//		For j = 26 to 51,
//		- Copy cards[j] to shuffled[k]
//		- Set k to k+2.
		for (int j = (values.length + 1) / 2; j < values.length; j++) {
			shuffled[k] = values[j];
			k = k + 2;
		}
		
		for (int i = 0; i < values.length; i++) {
			values[i] = shuffled[i];
		}
	}
	
	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		int[] shuffled = new int[values.length];
//		for (int i = 0; i < shuffled.length; i++) {
//			shuffled[i] = -1;
//			System.out.println(shuffled[i]);
//		}
		int temp;
		boolean flag = false;
		for (int i = 0; i < values.length; i++) {
			int num = (int) (Math.random() * values.length);
			flag = false; 
			while (flag == false) {
				if (values[num] != -1) {
				// numbers might be 0 - set to evaluate if not equal to a different number
					shuffled[i] = values[num];
//					System.out.println(num);
					values[num] = -1;
					flag = true;
				}
				else {
					num = (int) (Math.random() * values.length);
					// returns back to while loop
				}
			}	
		}
		
		for (int i = 0; i < values.length; i++) {
			values[i] = shuffled[i];
		}
	}
}
