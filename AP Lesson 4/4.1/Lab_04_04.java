import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import static java.lang.Math.pow;

public class Lab_04_04
{
	//Instantiate Scanner class object
	static Scanner cin = new Scanner(System.in);

	public static void main(String[]args)
	{
		//Instantiate Class object
		Lab_04_04 class_object = new Lab_04_04();
		
		
		System.out.println("Lab 4 Exercise 4: Subwoofer Boxes\n\n");
		
		String name;
		Boolean cond_1 = true, 
				//cond_2 = true, 
				redo_1 = false;
				//redo_2 = false;
		
		double length = 0,
			   width = 0,
			   height = 0,
			   in_volume = 0,
			   ft_volume = 0;
		
		//keeps running until everything is correct
		while(cond_1)
		{
			//cin Length 
			System.out.println("Length in inches:");
			System.out.print(">>");	
			length = cin.nextDouble();
			endl();
			
			//cin Width
			System.out.println("Width in inches:");
			System.out.print(">>");	
			width = cin.nextDouble();
			endl();
			
			//cin Height
			System.out.println("Height in inches:");
			System.out.print(">>");	
			height = cin.nextDouble();
			endl();

			
			
			//cout everything to check
			System.out.println("Length:\t\t\t   " + length + " inches.");	

			System.out.println("Width:\t\t\t   " + width + " inches.");

			System.out.println("Height:\t\t\t   " + height + " inches.");

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
		
		in_volume = class_object.calcInches(length, width, height);
		ft_volume = class_object.calcFeet(in_volume);
		System.out.println("The volume in cubic ft is " + ft_volume);
	}	
	
	public static void endl()
	{
		System.out.println();
	}
	
	
	
	public Boolean anythingIncorrect()
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
	
	public double calcInches(double l, double w, double h)
	{
		return l*w*h;
	}
	public double calcFeet(double in_volume)
	{
		return in_volume/1728;
	}
	
}