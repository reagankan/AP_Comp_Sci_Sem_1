import java.io.*;
import java.util.*;

/**
 * A simple class to run the Magpie class.
 * @author Reagan Kan
 * @version March 2017
 */
public class MagpieRunner2
{
	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{	
		Magpie2 maggie = new Magpie2();
		//maggie.test_transformIWantToStatement();
		//maggie.test_transformYouMeStatement();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}
}
