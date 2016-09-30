import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import static java.lang.Math.pow;

public class Cube
{
	//Instantiate Scanner class object
	static Scanner cin = new Scanner(System.in);
	
	//global variables
	static double side_length = 0, surface_area = 0;
	
	
	public static void main(String[]args)
	{
		System.out.println("Lab 4.3 Exercise 3: Cube\n");
		
		String name;
		Boolean cond_1 = true, 
				//cond_2 = true, 
				redo_1 = false;
				//redo_2 = false;
		
		//keeps running until everything is correct
		while(cond_1)
		{
			//cin num_nums 
			System.out.println("Side Length:");
			System.out.print(">>");	
			side_length = cin.nextDouble();
			endl();
			
			
			//cout num_nums to check
			System.out.println("Side Length:   " + side_length);	
			


			//Check Everything
			redo_1 = anythingIncorrect();
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
		
		calcSurfaceArea();
		printSurfaceArea();
		endl();
	}	
	
	public static void endl()
	{
		System.out.println();
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
	
	public static void calcSurfaceArea()
	{
		surface_area = 6 * pow(side_length,2);
	}
	
	public static void printSurfaceArea()
	{
		String str = "The surface area of a cube with side length ";
		
		str += Double.toString(side_length);
		str += " is %10.5f";
		System.out.printf(str, surface_area);
		endl();
	}
}