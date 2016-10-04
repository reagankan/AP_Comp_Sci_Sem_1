import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import static java.lang.Math.pow;

public class drawing_void
{
	//Instantiate Scanner class object
	static Scanner cin = new Scanner(System.in);
	static String str = "The area of a circle with a radius of ";
	static double radius = 0, 
				  area = 0, 
			      pi = Math.PI;
	
	public static void main(String[]args)
	{	
		drawing_void class_object = new drawing_void();
		System.out.println("Lab 4 Notes #6: Non-Static Void Methods\n");
			
		class_object.readinRadius();
		
		class_object.calcArea();
		
		class_object.printArea();
		
		System.out.println();
		
	}	
	public void readinRadius()
	{
		System.out.println("Radius:");
		System.out.print(">>");	
		radius = cin.nextDouble();
	}
	public void calcArea()
	{
		area = pi * pow(radius,2);
	}
	public void printArea()
	{
		str += Double.toString(radius);
		str += " is %10.5f";
		System.out.printf(str, area);
		System.out.println();
	}
}