/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card firstHighBlack10 = new Card("High","Black",10);
		Card secondHighBlack10 = new Card("High","Black",10);
		Card firstLowWhite10 = new Card("Low","White",100);
		
		if(firstHighBlack10.matches(secondHighBlack10))
		{
			System.out.println("These are equal\n" + firstHighBlack10 + secondHighBlack10);
		}
		if(!firstHighBlack10.matches(firstLowWhite10))
		{
			System.out.println("\nThese are NOT equal\n" + firstHighBlack10 + firstLowWhite10);
		}
		
	}
}
