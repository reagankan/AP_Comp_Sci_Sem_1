import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import static java.lang.Math.pow;

public class Lab_04_03
{
	//Instantiate Scanner class object
	static Scanner cin = new Scanner(System.in);

	public static void main(String[]args)
	{
		//Instantiate Class object
		Lab_04_03 class_object = new Lab_04_03();
		
		
		System.out.println("Lab 4 Exercise 3: Monthly Loan\n\n");
		
		String name;
		Boolean cond_1 = true, 
				//cond_2 = true, 
				redo_1 = false;
				//redo_2 = false;
		
		double interest = 0,
			   principal = 0,
			   years = 0,
			   num_compound = 0,
			   loan = 0;
		
		//keeps running until everything is correct
		while(cond_1)
		{
			//cin Interest 
			System.out.println("Interest:");
			System.out.print(">>");	
			interest = cin.nextDouble();
			endl();
			
			//cin Principal Investment
			System.out.println("Principal:");
			System.out.print(">>");	
			principal = cin.nextDouble();
			endl();
			
			//cin Years
			System.out.println("Years:");
			System.out.print(">>");	
			years = cin.nextDouble();
			endl();
			
			//cin Number of times compounded 
			System.out.println("Times Compounded");
			System.out.print(">>");	
			num_compound = cin.nextDouble();
			endl();
			
			
			
			//cout everything to check
			System.out.println("Interest:\t\t\t   " + interest);	

			System.out.println("Principal:\t\t\t   " + principal);

			System.out.println("Years:\t\t\t   " + years);

			System.out.println("Times Compounded:\t   " + num_compound);

			
	
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
		
		loan = class_object.Calculate(interest, principal, num_compound, years);
		System.out.printf("Your monthly loan is %20.2f dollars", loan);
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
	
	public double Calculate(double r, double p, double n, double t)
	{
		double loan = 0;
		loan = p*(Math.pow((1+(r/n)), (n*t)/(t*12)));
		//System.out.println(loan);
		return loan;
	}
	
}