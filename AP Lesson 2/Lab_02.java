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
		String name, newline, address, city, state, zipcode, nation, output;
		
		System.out.println("Enter your name:");
		System.out.print(">>");
		newline = cin.nextLine();
		name = cin.nextLine();
		
		System.out.println("Enter the street name:");
		System.out.print(">>");
		address = cin.nextLine();
		
		System.out.println("Enter the city name:");
		System.out.print(">>");
		city = cin.nextLine();
		
		System.out.println("Enter the name of your state/province:");
		System.out.print(">>");
		state = cin.nextLine();
		
		System.out.println("Enter the zipcode:");
		System.out.print(">>");
		zipcode = cin.nextLine();
		
		System.out.println("Enter the country:");
		System.out.print(">>");
		nation = cin.nextLine();
		
		output = name + "\n" + address + "\n" + city + ", " + state + " " + zipcode + "\n" + nation;
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