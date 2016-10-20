import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import static java.lang.Math.pow;

public class Lab_05_02_EX_06_Username_Password
{
	//Instantiate Scanner class object
	static Scanner cin = new Scanner(System.in);
	static Boolean incorrect;
	static String name, email, username, password, verify, newline;
	static Vector<String> info = new Vector<String>();


	public static void main(String[]args)
	{
		System.out.println("Lab 5.2 Exercise 6: Username and Password\n");
		createAccount();		
		startOver();
		login();
	}	
	
	public static void createAccount()
	{
		readinName();
		readinEmail();
		readinUsername();
		readinPassword();
	}
	
	public static void readinName()
	{
		System.out.println("Enter your first and last name:");
		System.out.print(">>");
		name = cin.nextLine();
	}
	public static void readinEmail()
	{
		int length, position;
		Boolean cond = true;
		while(cond)
		{
			System.out.println("Enter your email:");
			System.out.print(">>");
			email = cin.nextLine();
			
			length = email.length();
			position = length-4;
			Character period_letter = email.charAt(position);
			
			if(period_letter.equals('.'))
			{
				cond = false;
			}
			else
			{
				System.out.println("Error: invalid email.");
				System.out.println("Please make sure you enter a valid email.");
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
			
			System.out.println("Enter your password once more to verify it:");
			System.out.print(">>");
			verify = cin.nextLine();
			
			if(password.equals(verify))
			{
				cond = false;
			}
			else
			{
				System.out.println("Error: your entries do no match.");
				System.out.println("Please try again.");
			}
		}
	}
	
	public static void startOver()
	{
		/*incorrect = true;
		while(incorrect)
		{
			anythingIncorrect();
			createAccount();
		}*/
		
		System.out.println(name + ", for security reasons, you must login once for your account to be saved.");
		System.out.println("Logged Out.");
		System.out.println("\nPlease Login");
	}
	
	public static void login()
	{
		String password_check, username_check;
		Boolean condition = true;
		
		while(condition)
		{
			System.out.println("Username:");
			System.out.print(">>");
			username_check = cin.nextLine();
			
			System.out.println("Password:");
			System.out.print(">>");
			password_check = cin.nextLine();
			
			if(username.equals(username_check) && password.equals(password_check))
			{
				System.out.println("Successful Login!");
				System.out.println("Your Account has been saved!");
				condition = false;
			}
			else if(username.equals(username_check) && !password.equals(password_check))
			{
				System.out.println("Your password was incorrect.");
				System.out.println("Please Try Again.");
			}
			else if(!username.equals(username_check) && password.equals(password_check))
			{
				System.out.println("Your username was incorrect.");
				System.out.println("Please Try Again.");
			}
			else
			{
				System.out.println("Both your username and password were incorrect.");
				System.out.println("Please Try Again.");
			}
		}
	}
	
	public static void printAll()
	{
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
	}
	
	public static void anythingIncorrect()
	{
		printAll();
		
		String confirm;
		Boolean cond = true;
		while(cond)
		{
			System.out.println("Is this right?(y or n)");
			System.out.print(">>");
			//newline = cin.nextLine();
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