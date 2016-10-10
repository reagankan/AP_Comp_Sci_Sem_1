import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import static java.lang.Math.pow;
import static java.lang.Math.random;
import java.util.Random;

public class Lab_05_EX_01_DiceRoll
{
	//Instantiate Scanner class object
	static Scanner cin = new Scanner(System.in);
	
	//Instantiate Random class object
	static Random random = new Random();
	
	static double player_num = 0,
			      computer_num = 0;
				  
	static String player_name, 
				  computer = "the Computer",
				  winner,
				  confirm;
				  
	static Boolean incorrect = false;
				 
	public static void main(String[]args)
	{
		System.out.println("Lab 5 Exercise 1: DiceRoll\n");
		
		Boolean cond_1 = true, 
				redo_1 = false;
		
		//keeps running until everything is correct
		while(cond_1)
		{
			//cin Player Name 
			readinName();
			
			//cout everything to check
			printName();
	
			//Check Everything
			redo_1 = anythingIncorrect();
			
			if(redo_1)//something is wrong
			{
				//let while loop reiterate
			}
			else
			{
				cond_1 = false;
			}
		}
		endl();
		
		rollDice();
		printResults();
	}	
	
	public static void endl()
	{
		System.out.println();
	}
	
	public static void readinName()
	{
		System.out.println("Name:");
		System.out.print(">>");	
		player_name = cin.nextLine();
		endl();
	}
	
	public static void printName()
	{
		System.out.println("You are " + player_name);
	}
	
	public static Boolean anythingIncorrect()
	{
		Boolean cond = true;
		while(cond)
		{
			System.out.println("Is this right?(y or n)");
			System.out.print(">>");
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
		return incorrect;
	}
	
	public static void rollDice()
	{
		Boolean same_num = true;
		while(same_num)
		{
			computer_num = random.nextInt(101);//random int from 1-100
			player_num = random.nextInt(101);//random int from 1-100
			if(computer_num != player_num)
			{
				same_num = false;
			}
		}	
		
		if(computer_num > player_num)
		{
			winner = computer;
		}
		else
		{
			winner = player_name;
		}
	}
	
	public static void printResults()
	{
		System.out.println("You rolled a " + Double.toString(player_num));
		System.out.println("The Computer rolled a " + Double.toString(computer_num));
		System.out.println("The winner is " + winner);
	}
	
}