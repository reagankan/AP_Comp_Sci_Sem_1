import java.util.Scanner;

public class Lab_02
{
	public static void main(String[]args)
	{
		//set up user intput
		Scanner cin = new Scanner(System.in);
		
		
		
		System.out.println("Lab 2");
		
		System.out.println("\n\nMultiplication\n");
		double num_1 = 0, num_2 = 0, product = 0;
		
		System.out.printf("Enter a number:\t");
		num_1 = cin.nextDouble();
		
		System.out.printf("Enter another number:\t");
		num_2 = cin.nextDouble();
		
		product = num_1 * num_2;
		
		System.out.printf("The product of ");
		System.out.print(num_1);
		System.out.printf(" and ");
		System.out.print(num_2);
		System.out.printf(" is ");
		System.out.print(product);
		System.out.printf(".");
		
	
		/**/
		System.out.println("\n\nConcatenation\n");
		String name, address, city, zipcode, output;
		
		System.out.printf("Enter your name NO SPACES:  ");
		name = cin.next();
		
		System.out.printf("Enter the just the street name NO SPACES:  ");
		address = cin.next();
		
		System.out.printf("Enter the city name as one word NO SPACES:  ");
		city = cin.next();
		
		System.out.printf("Enter the zipcode NO SPACES:  ");
		zipcode = cin.next();
		
		output = "Hi, my name is " + name + "!\nHere is my address:  " + address + " " + city + " " + zipcode;
		
		System.out.println(output);
		
		
		/**/
		System.out.println("\n\nComplex Calculation\n");
		int length = 0, width = 0, height = 0, surface_area = 0;
		
		System.out.printf("Enter length:  ");
		length = cin.nextInt();
		
		System.out.printf("Enter width:  ");
		width = cin.nextInt();
		
		System.out.printf("Enter height:  ");
		height = cin.nextInt();
		
		surface_area = 4*length*height + 2*width*height;
		
		System.out.printf("The surface area of the rectangular prism is:  ");
		System.out.println(surface_area);
	}	
}