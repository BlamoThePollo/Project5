package act1;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card one = new Card("2", "Ace", 2); //object 1
		Card two = new Card("2", "Queen",2); //object 2
		Card three = new Card("3", "Spades", 3); //object 3
		
		System.out.println("One matches two?" + one.matches(two)); //displays if 1 = 2
		System.out.println("One matches three?" + one.matches(three));//displays if 1 = 3
		System.out.println("Suit of Card One: " + one.suit());//Picture of card 1
		System.out.println("Card one: " + one.toString());//Value of card 1
		
	}
}
