import java.util.Scanner;
import static java.lang.Math.pow;

public class Lab_03_02
{
	public static void main(String[]args)
	{
		//set up user intput
		Scanner cin = new Scanner(System.in);
		
		System.out.println("Lab 3 Part 2: BMI\n\n");
		
		String name;
		double height, weight, BMI;
		
		
		
		System.out.println("What is your name?");
		System.out.print(">> ");
		
		name = cin.nextLine();
		
		
		
		System.out.println("What is your height in inches?");
		System.out.print(">> ");
		
		height = cin.nextDouble();
		
		
		
		
		System.out.println("What is your weight in pounds?");
		System.out.print(">> ");
		
		weight = cin.nextDouble();
		
		
		BMI = 703 * ((weight)/(pow(height,2)));
		
		System.out.print("Your BMI is: ");
		System.out.println(BMI);

		

	
	
		
		
	
		
		
		
		
	

	}	
}