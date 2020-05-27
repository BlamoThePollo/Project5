package act3;
/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 1;

	/**
	 * The number of values to shuffle.
	 */
	private static final int VALUE_COUNT = 4;

	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
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
		int[] half1 = new int[ VALUE_COUNT / 2 ]; //initiliazes 1d int array = to half of value count
	    int[] half2 = new int[ VALUE_COUNT - VALUE_COUNT / 2 ]; //initiliazes 1d int array = 
	    //to value count - half of value count
	    for( int i = 0; i < VALUE_COUNT / 2; i++ ) // for loop length of half of value count
	    {
	      half1[i] = values[i]; //sets half1 at index to values at index
	    }
	    for( int i = 0; i < VALUE_COUNT - VALUE_COUNT / 2; i++ ) //for loop length of value count - half of value count
	    {
	      half2[i] = values[ i + VALUE_COUNT / 2 ];//sets half2 at index to values at index
	    }
	    for( int i = 0; i < VALUE_COUNT / 2; i++ ) //for loop length of half of value count
	    {
	      values[ 2 * i ] = half2[i];//values at 2x index = half2 index
	      values[ 2 * i + 1 ] = half1[i];//values at 2x index plus one = half1 index
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
		for( int k = VALUE_COUNT - 1; k >= 0; k-- ) { //for loop at value count - 1, going downwards
		      int r = (int)(Math.random() * k);//initiliazes int r as a random int depending on index
		      int tmp = values[r];//initiliazes int tmp as a randomized value depending on r
		      values[r] = values[k];//randomized value of r is = value at index
		      values[k] = tmp;//values at index is = tmp which is = randomized values
		}
	}
}
