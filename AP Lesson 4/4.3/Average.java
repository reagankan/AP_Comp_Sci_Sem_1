import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import static java.lang.Math.pow;

public class Average
{
	//Instantiate Scanner class object
	static Scanner cin = new Scanner(System.in);
	
	//global variables
	static double num_nums = 0, num = 0, average = 0;
	static Vector<Double> values = new Vector<Double>();
	
	public static void main(String[]args)
	{	
		System.out.println("Lab 4.3 Exercise 2: Average\n");
		
		String name;
		Boolean cond_1 = true, 
				//cond_2 = true, 
				redo_1 = false;
				//redo_2 = false;
		
		//keeps running until everything is correct
		while(cond_1)
		{
			//cin num_nums 
			System.out.println("Number of Operands:");
			System.out.print(">>");	
			num_nums = cin.nextDouble();
			endl();
			
			//cin vector
			readinVector();

			
			//cout num_nums to check
			System.out.println("Number of Operands:\t" + num_nums);	
			//cout vector to check
			printVector();


			//Check Everything
			redo_1 = anythingIncorrect();
			if(redo_1)
			{
				//let while loop reiterate
				values.clear();
			}
			else
			{
				cond_1 = false;
			}
		}
		endl();
		
		calcAverage();
		printAverage();
		endl();
	}	
	
	public static void endl()
	{
		System.out.println();
	}
	
	
	public static void readinVector()
	{
		for(int i = 0; i < num_nums; i++)
		{
			System.out.println("Enter value[" + (i+1) + "]");
			System.out.print(">>");	
			num = cin.nextDouble();
			values.add(num);
			endl();
		}
	}
	
	public static void printVector()
	{
		for(int i = 0; i < num_nums; i++)
		{
			System.out.println("Value[" + (i+1) + "]\t\t\t" + values.get(i));	
		}
	}
	
	
	public static Boolean anythingIncorrect()
	{
		Boolean incorrect = false;
		String response, newline;
		System.out.println("Is any of the information above incorrect?(y or n)");
		newline = cin.nextLine();
		response = cin.next();
		if(response.equals("y"))
		{
			incorrect = true;
		}
		return incorrect;
	}
	
	public static void calcAverage()
	{
		double sum = 0;
		for(int i = 0; i < num_nums; i++)
		{
			sum += values.get(i);	
		}
		average = sum/num_nums;
	}
	
	public static void printAverage()
	{
		String str = "The average of ";
		for(int i = 0; i < num_nums; i++)
		{
			str += Double.toString(values.get(i));
			if(i == num_nums - 2)
			{
				str += ", and ";
			}
			else if(i < num_nums - 2)
			{
					str += ", ";
			}
		}
		str += " is %10.5f";
		System.out.printf(str, average);
		endl();
	}

	
}