import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import static java.lang.Math.pow;

public class drawing
{
	//Instantiate Scanner class object
	static Scanner cin = new Scanner(System.in);
	
	public static void main(String[]args)
	{	
		System.out.println("Lab 4 Notes: Drawing\n");
			
		double radius = 0, 
			   area = 0, 
			   pi = Math.PI;
		
		
		radius = readinRadius();
		
		area = calcArea(radius, pi);
		
		printArea(radius, area);
		
		System.out.println();
	}	
	
	public static double readinRadius()
	{
		double r;
		System.out.println("Radius:");
		System.out.print(">>");	
		r = cin.nextDouble();
		return r;
	}
	
	public static double calcArea(double r, double pi)
	{
		double area;
		area = pi * pow(r,2);
		return area;
	}
	
	public static void printArea(double r, double a)
	{
		String str = "The area of a circle with a radius of ";
		
		str += Double.toString(r);
		str += " is %10.5f";
		System.out.printf(str, a);
		System.out.println();
	}
}