import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import static java.lang.Math.pow;

public class Lab_05_01_EX_04_BMI
{
	//Instantiate Scanner class object
	static Scanner cin = new Scanner(System.in);
	static Boolean incorrect;
	static double height, weight, BMI;
	static String newline, confirm, name, condition;
	static ArrayList<String> items = new ArrayList<String>();

	public static void main(String[]args)
	{
		System.out.println("Lab 5.1 Exercise 4: BMI\n");
		
		Boolean cond_1 = true;
		
		//keeps running until everything is correct
		while(cond_1)
		{
			readinData();

			//Checking
			printData();
			anythingIncorrect();
			if(incorrect)//something is wrong
			{
				//let while loop reiterate
			}
			else
			{
				cond_1 = false;
			}
		}
		endl();
	
		calcBMI();
		calcCondition();
		printResults();
	}	
	public static void endl()
	{
		System.out.println();
	}
	public static void readinData()
	{
		System.out.println("What is your name?");
		System.out.print(">> ");
		name = cin.nextLine();
	
		System.out.println("What is your height in inches?");
		System.out.print(">> ");
		height = cin.nextDouble();
		
		System.out.println("What is your weight in pounds?");
		System.out.print(">> ");
		weight = cin.nextDouble();
	}	
	public static void printData()
	{
		System.out.println("Name: " + name);	
		System.out.println("Height in inches: " + height);
		System.out.println("Weight in pounds: " + weight);
	}	
	public static void calcBMI()
	{
		BMI = 703 * ((weight)/(pow(height,2)));
	}
	public static void calcCondition()
	{
		if(BMI < 18.5)
		{
			condition = "Underweight";
		}
		else if(18.5 <= BMI && BMI <= 24.9)
		{
			condition = "Normal";
		}
		else if(25 <= BMI && BMI <= 29.9)
		{
			condition = "Overweight";
		}
		else if(30 <= BMI && BMI <= 34.9)
		{
			condition = "Obese";
		}
		else if(35 <= BMI && BMI <= 39.9)
		{
			condition = "Very Obese";
		}
		else//BMI > 39.9
		{
			condition = "Morbidly Obese";
		}
	}
	public static void printResults()
	{
		System.out.println("BMI: " + BMI);
		System.out.println("Condition: " + condition);
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
}