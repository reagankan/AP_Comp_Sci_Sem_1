import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import static java.lang.Math.pow;

public class Lab_05_02_EX_06_Username_Password
{
	//Instantiate Scanner class object
	static Scanner cin = new Scanner(System.in);
	static Boolean incorrect;
	static String name, email, username, password, verify;
	static Vector<String> info = new Vector<String>();


	public static void main(String[]args)
	{
		System.out.println("Lab 5.2 Exercise 6: Username and Password\n");
		readinName();
		
	}	
	
	public static void readinName()
	{
		System.out.println("Enter your first and last name:");
		System.out.print(">>");
		name = cin.nextLine();
	}
	public static void readinEmail()
	{
		Boolean cond = true;
		while(cond)
		{
			System.out.println("Enter your email:");
			System.out.print(">>");
			email = cin.nextLine();
			
			if(email.get(email.length()-4).equals('.'))
			{
				cond = false;
			}
			else
			{
				System.out.println("Error: invalid email");
				System.out.println("Please make sure you enter a valid email");
			}
		}
	}
	public static void readinUsername()
	{
		System.out.println("Enter your username:");
		System.out.print(">>");
		username = cin.nextLine();
	}
	public static void readinPassword()
	{
		Boolean cond = true;
		while(cond)
		{
			System.out.println("Enter your password:");
			System.out.print(">>");
			password = cin.nextLine();
			
			System.out.println("Enter your email once more to verify it:");
			System.out.print(">>");
			verify = cin.nextLine();
			
			if(password.equals(verify))
			{
				cond = false;
			}
			else
			{
				System.out.println("Error: your entries do no match");
				System.out.println("Please try again");
			}
		}
	}
	
	public static void anythingIncorrect()
	{
		Boolean cond = true;
		while(cond)
		{
			System.out.println("Is this right?(y or n)");
			System.out.print(">>");
			newline = cin.nextLine();
			confirm = cin.nextLine();
			if(confirm.equals("y"))
			{
				cond = false;
				incorrect = false;
			}
			else if(confirm.equals("n"))
			{
				cond = false;
				incorrect = true;
			}
			else
			{
				System.out.println("Error: incorrect input");
				System.out.println("Please enter y or n");
				System.out.print("Your input was: " + confirm + "\n");
				System.out.println("Try Again!");
			}
		}
	}	
	public static void endl()
	{
		System.out.println();
	}
}