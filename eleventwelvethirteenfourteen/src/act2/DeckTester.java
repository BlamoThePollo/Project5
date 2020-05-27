package act2;

import act1.Card;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	static String[] onea = {"1", "2", "3"};
	static String[] twoa = {"2", "3", "4"};
	static String[] threea = {"4", "2", "6"};
	
	static String[] ones = {"Heart", "Ace", "Spade"};
	static String[] twos = {"Queen", "King", "Spade"};
	static String[] threes = {"King", "King", "Heart"};
	
	static int[] onei = {4, 2, 3};
	static int[] twoi = {8, 7, 1};
	static int[] threei = {2, 6, 7};
	
	public static void main(String[] args) {
		/**
		 * The main method in this class checks the Card operations for consistency.
		 *	@param args is not used.
		 */
		
		Deck one = new Deck(onea, ones, onei); //object 1
		Deck two = new Deck(twoa, twos,twoi); //object 2
		Deck three = new Deck(threea, threes, threei); //object 3
			
		System.out.println("Is one empty?" + one.isEmpty()); //displays if 1 = 2
		System.out.println("Whats the size of one?" + one.size());//displays if 1 = 3
		System.out.println("Deal in card one" + one.deal());//Picture of card 1
		System.out.println("Card one: " + one.toString());//Value of card 1
			
	}
}
