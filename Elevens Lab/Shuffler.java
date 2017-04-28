/**
 * This class provides a convenient way to test shuffling methods.
 */
 import java.util.*;
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 3;


	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.print("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
		}
		System.out.println("\n");

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
		
		
		testActivity3Question1();
		testActivity3Question2();
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		int[] shuffled = new int[values.length];
		//System.out.print((values.length+1)/2);
		int k = 0;
		for(int i = 0; i < (values.length+1)/2; i++)
		{
			shuffled[k] = values[i];
			k+=2;
		}
		System.out.println();
		k = 1;
		for(int i = (values.length+1)/2; i < values.length; i++)
		{
			shuffled[k] = values[i];
			k+=2;
		}
		System.arraycopy( shuffled, 0, values, 0, shuffled.length );
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
		Random rand = new Random();
		int k = -1, temp = -1;
		for(int i = values.length-1; i >= 0; i--)
		{
			k = rand.nextInt(i+1);
			temp = values[k];
			values[k] = values[i];
			values[i] = temp;
		}
	}
	public static String flip() {
		/* *** QUESTION 1 IN ACTIVITY 3 *** */
		Random rand = new Random();
		if(rand.nextInt(6) == 0 || rand.nextInt(6) == 1)
		{
			return "tails";
		}
		return "heads";
	}
	public static void testActivity3Question1()
	{
		System.out.println("Activity 3 Question 1");
		for(int i = 0; i < 12; i++)
		{
			System.out.println(flip());
		}
		System.out.println();
	}
	
	
	
	public static boolean arePermutations(int[] array1, int[] array2) {
		/* *** QUESTION 2 IN ACTIVITY 3 *** */
		Arrays.sort(array1); Arrays.sort(array2);
		boolean ret = true;
		for(int i = 0; i < array1.length && i < array1.length; i++)
		{
			if(array1[i] != array2[i])
			{
				ret = false;
			}
		}
		return ret;
	}
	public static void testActivity3Question2()
	{
		System.out.println("Activity 3 Question 2");
		int[] one = {1,2,3,4}, two = {4,2,3,1};
		printArray(one, "one"); printArray(two,"two");
		System.out.println("arePermutations? "+ arePermutations(one,two));
		
		int[] a = {1,2,3,4,5}, b = {4,5,3,3,1};
		printArray(a, "a"); printArray(b,"b");
		System.out.println("arePermutations? "+ arePermutations(a,b));
	}
	public static void printArray(int[] arr, String name)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(name + "[" + i + "]: " + arr[i]);
		}
	}
}
