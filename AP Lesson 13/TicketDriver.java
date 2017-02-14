import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;
public class TicketDriver
{
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Lab_13.2::Ex_03::Ticket Sales");
		
		cout("Creating Walkup Ticket\n");
		Ticket walkObj = new Walkup();
		cout("Creating Advance Ticket\n");
		cout("Enter number of days left: ");
		int days = cin.nextInt();
		Ticket advanceObj = new Advance(days);
		cout("Creating Student Advance Ticket\n");
		cout("Enter number of days left: ");
		days = cin.nextInt();
		Ticket advStudentObj = new StudentAdvance(days);
		
		cout("Printing Receipt\n");
		System.out.println(walkObj);
		System.out.println(advanceObj);
		System.out.println(advStudentObj);
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
			msleep(200);
		}
	}
}