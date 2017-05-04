/**
 * This is a class that tests the Deck class.
 */
 
import java.util.concurrent.TimeUnit;
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		activity_1();
		activity_2();
		activity_4();
	}
	public static void activity_1()
	{
		System.out.println("Activity 1");
		String[] ranks = {"A", "B", "B", "C"}, suits = {"Giraffes"};
		int[] values = {2,1,1,6};
		Card card_1;
		Card card_2;
		for(int i = 0; i+1 < ranks.length; i++)
		{
			card_1 = new Card(ranks[i], suits[0], values[i]);
			card_2  = new Card(ranks[i+1], suits[0], values[i+1]);
			
			if(card_1.matches(card_2))
			{
				System.out.println(
				card_1 +
				" DOES match " +
				card_2);	
			}
			else
			{
				System.out.println(
				card_1 +
				" does NOT match " +
				card_2);
			}
		}
	}
	public static void activity_2()
	{
		System.out.println("\nActivity 2");
		String[] ranks1 = {"A", "B", "C"}, suits1 = {"Giraffes", "Lions"};
		int[] values1 = {2,1,6};
		Deck newDeck1 = new Deck(ranks1, suits1, values1);
		cout("======Deck 1=======\n");
		while(!newDeck1.isEmpty())
		{
			System.out.println(newDeck1.deal());
		}
		cout("======Deck 2=======\n");
		String[] ranks2 = {"D", "E", "F"}, suits2 = {"Goats", "Llamas"};
		int[] values2 = {4,2,12};
		Deck newDeck2 = new Deck(ranks2, suits2, values2);
		while(!newDeck2.isEmpty())
		{
			System.out.println(newDeck2.deal());
		}
		cout("=======Deck 3======\n");
		String[] ranks3 = {"G", "H", "I"}, suits3 = {"Ghosts", "Leopards"};
		int[] values3 = {8,4,24};
		Deck newDeck3 = new Deck(ranks3, suits3, values3);
		while(!newDeck3.isEmpty())
		{
			System.out.println(newDeck3.deal());
		}
	}
	public static void activity_4()
	{
		System.out.println("\nActivity 4");
		String[] ranks1 = {"A", "B", "C"}, suits1 = {"Giraffes", "Lions"};
		int[] values1 = {2,1,6};
		Deck newDeck1 = new Deck(ranks1, suits1, values1);
		cout("======Deck 1=======\n");
		newDeck1.deal();
		newDeck1.deal();
		newDeck1.deal();
		System.out.println(newDeck1);
		
		String[] ranks2 = {"D", "E", "F"}, suits2 = {"Goats", "Llamas"};
		int[] values2 = {4,2,12};
		Deck newDeck2 = new Deck(ranks2, suits2, values2);
		cout("======Deck 2=======\n");
		newDeck2.deal();
		newDeck2.deal();
		System.out.println(newDeck2);
		
		String[] ranks3 = {"G", "H", "I"}, suits3 = {"Ghosts", "Leopards"};
		int[] values3 = {8,4,24};
		Deck newDeck3 = new Deck(ranks3, suits3, values3);
		cout("======Deck 3=======\n");
		newDeck3.deal();
		System.out.println(newDeck3);
	}
	public static void endl()
	{
		System.out.println();
	}
	public static void msleep(int milli)
	{
		try{
			TimeUnit.MILLISECONDS.sleep(milli);
		} catch(InterruptedException ex){
			//do nothing...just need to catch exception
		}
	}
	public static void pauseFor(int sec)
	{
		System.out.print("Moving on in: ");
		for(int i = sec; i >= 1; i--)
		{
			System.out.print(i);
			msleep(250);
			cout("...");
			
		}
	}
	public static void cout(String str)
	{
		for(int i = 0; i < str.length(); i++)
		{
			System.out.print(str.charAt(i));
			msleep(190);
		}
	}
}
