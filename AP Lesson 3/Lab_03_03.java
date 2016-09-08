import java.util.Scanner;
import static java.lang.Math.pow;

public class Lab_03_03
{
	public static void main(String[]args)
	{
		//set up user intput
		Scanner cin = new Scanner(System.in);
		
		System.out.println("Lab 3 Part 3: Area of Triangle\n\n");
		
		String name;
		double height, length, area;
		
		
		
		System.out.println("What is your name?");
		System.out.print(">> ");
		
		name = cin.nextLine();
		
		System.out.print(name);
		System.out.println(", we are going to find the area of a triangle.");
		
		System.out.println("Enter the height of the triangle in cm");
		System.out.print(">> ");
		
		height = cin.nextDouble();
		
		
		System.out.println("Enter the length of the triangle in cm");
		System.out.print(">> ");
		
		length = cin.nextDouble();
		
		
		area = 0.5 * height * length;
		
		System.out.print("Your area of the triangle is: ");
		System.out.print(area);
		System.out.println("cm squared");

		

	
	
		
		
	
		
		
		
		
	

	}	
}