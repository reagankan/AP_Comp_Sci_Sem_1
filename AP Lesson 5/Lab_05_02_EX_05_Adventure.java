import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import static java.lang.Math.pow;

public class Lab_05_02_EX_05_Adventure
{
	//Instantiate Scanner class object
	static Scanner cin = new Scanner(System.in);
	static Boolean incorrect;
	static String newline, confirm, name, condition, choice, action;
	static Vector<String> choice_list = new Vector<String>();
	static Vector<String> action_list = new Vector<String>();
	static Vector<String> conclusion = new Vector<String>();

	public static void main(String[]args)
	{
		System.out.println("Lab 5.2 Exercise 5: ADVENTURE\n");
		
		createActions();
		ifElseLoops();
		printStory();
	}	
	public static void createActions()
	{
		/*
			Action List Index
			0 Wake Up
			1 Breakfast
			2 Work
			3 Dream or No
			4 Nightmare
			5 Sleep for a long time?
		*/
		action_list.add("Wake Up?");
		action_list.add("Eat Breakfast?");
		action_list.add("Go to work?");
		action_list.add("Do you have a dream");
		action_list.add("Is it a nightmare?");
		action_list.add("Do you sleep for a long time?");
		
	}
	public static void readinChoice(int iter)
	{
		Boolean cond = true;
		while(cond)
		{
			System.out.println(action_list.get(iter) + "(y or n)");
			System.out.print(">>");
			choice = cin.nextLine();
			
			if(choice.equals("y") || choice.equals("n"))
			{
				cond = false;
			}
			else
			{
				System.out.println("Error: incorrect input");
				System.out.println("Please enter y or n");
			}
		}
		choice_list.add(choice);
	}
	public static String returnChoice(int iter)
	{
		return choice_list.get(iter);
	}
	public static void ifElseLoops()
	{
		/*
			Action List Index
			0 Wake Up
			1 Breakfast
			2 Work
			3 Dream or No
			4 Nightmare
			5 Sleep for a long time?
		*/
		readinChoice(0);
		if(returnChoice(0).equals("y")){
			conclusion.add("You wake up.");
			readinChoice(1);
			if(returnChoice(1).equals("y")){
				conclusion.add("You eat breakfast");
				readinChoice(2);
				if(returnChoice(2).equals("y")){
					conclusion.add("You start working.");
					conclusion.add("You end up working too hard and you fall asleep exhausted...");
				}
				else{
					conclusion.add("You dont work working.");
					conclusion.add("You start messing around on the computer.");
					conclusion.add("Your boss finds out and you are fired...");
				}
			}
			else{
				conclusion.add("You don't eat breakfast.");
				readinChoice(2);
				if(returnChoice(2).equals("y")){
					conclusion.add("You are too hungry to work efficiently and your boss fires you...");
				}
				else{
					conclusion.add("You dont work working.");
					conclusion.add("You start messing around on the computer.");
					conclusion.add("Your boss finds out and you are fired...");
				}
			}
		}
		else{
			conclusion.add("You don't wake up.");
			readinChoice(3);
			if(returnChoice(3).equals("y")){
				conclusion.add("You have a dream.");
				readinChoice(4);
				if(returnChoice(4).equals("y")){
					conclusion.add("It is a nightmare");
					conclusion.add("You wake up, immediately sitting up and smashing your head into the ceiling...you were sleeping in the top bunk...");
				}
				else{
					conclusion.add("It is not a nightmare...just a normal dream.");
					conclusion.add("You dream of waking up in a world made of candy...");
				}
			}
			else{
				conclusion.add("You wake up.");
				readinChoice(5);
				if(returnChoice(5).equals("y")){
					conclusion.add("You develop bed sore after sleeping for 2 years...");
				}
				else{
					conclusion.add("You suddenly roll off your bed, only getting in a couple minutes of sleep...");
				}
			}
		}
	}
	public static void printStory()
	{
		for(int i = 0; i < conclusion.size(); i++)
		{
			System.out.println(conclusion.get(i));
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