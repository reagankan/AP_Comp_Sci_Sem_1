import java.util.Scanner;
import java.util.Random;
import static java.lang.Math.pow;
import static java.lang.Math.abs;
import java.util.concurrent.TimeUnit;
public abstract class Ticket
{
	private int serialNo;
	Random rand = new Random();
	 
	//default constructor
	public Ticket()
	{
		this.serialNo = rand.nextInt(9999999);
	}

	/*Accessors*/
	public int getSerial()
	{
		return rand.nextInt(9999999);
	}
	/*Abstract*/
	public abstract double getPrice();
	public abstract String getType();
	
	public String toString()
	{
		return "Type: " + getType() + "\n" +
			   "Serial #: " + getSerial() + "\n" +
			   "Price: " + getPrice() + "\n";
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
			msleep(250);
		}
	}
}