import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import static java.lang.Math.pow;

public class Circle
{
	//Instantiate Scanner class object
	static Scanner cin = new Scanner(System.in);
	
	//global variables
	static double radius = 0, area = 0, pi = Math.PI;
	
	
	public static void main(String[]args)
	{
		//Instantiate Class object
		Circle class_object = new Circle();
		
		
		System.out.println("Lab 4.2 Exercise 4: Circle\n");
		
		String name;
		Boolean cond_1 = true, 
				//cond_2 = true, 
				redo_1 = false;
				//redo_2 = false;
		
		//keeps running until everything is correct
		while(cond_1)
		{
			//cin num_nums 
			readinRadius();
		
			//cout num_nums to check
			printRadius();
			
			//Check Everything
			redo_1 = class_object.anythingIncorrect();
			if(redo_1)
			{
				//let while loop reiterate
			}
			else
			{
				cond_1 = false;
			}
		}
		endl();
		
		calcArea();
		printArea();
		endl();
	}	
	
	public static void endl()
	{
		System.out.println();
	}
	
	
	public static void readinRadius()
	{
		System.out.println("Radius:");
		System.out.print(">>");	
		radius = cin.nextDouble();
		endl();
	}
	public static void printRadius()
	{
		System.out.println("Radius:   " + radius);
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
	
	public static void calcArea()
	{
		area = pi * pow(radius,2);
	}
	
	public static void printArea()
	{
		String str = "The area of a circle with a radius of ";
		
		str += Double.toString(radius);
		str += " is %10.5f";
		System.out.printf(str, area);
		endl();
	}
}