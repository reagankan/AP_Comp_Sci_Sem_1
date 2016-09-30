import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import static java.lang.Math.pow;

public class Rectangle
{
	//Instantiate Scanner class object
	static Scanner cin = new Scanner(System.in);
	static double length = 0;
	static double width = 0;
	static double perimeter = 0;
	
	public static void main(String[]args)
	{
		//Instantiate Class object
		Rectangle class_object = new Rectangle();
		
		
		System.out.println("Lab 4.2 Exercise 1: Rectangle\n\n");
		
		String name;
		Boolean cond_1 = true, 
				//cond_2 = true, 
				redo_1 = false;
				//redo_2 = false;
		
		//keeps running until everything is correct
		while(cond_1)
		{
			//cin Length 
			System.out.println("Length:");
			System.out.print(">>");	
			length = cin.nextDouble();
			endl();
			
			//cin Width
			System.out.println("Width:");
			System.out.print(">>");	
			width = cin.nextDouble();
			endl();

			
			//cout everything to check
			System.out.println("Length:\t\t\t   " + length);	

			System.out.println("Width:\t\t\t   " + width);

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
		
		class_object.calcPerimeter(length, width);
		
		System.out.printf("Your rectangle is %10.5fft around.", perimeter);
		endl();
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
	
	public void calcPerimeter(double l, double w)
	{
		perimeter = (2*l) + (2*w);
	}

	
}