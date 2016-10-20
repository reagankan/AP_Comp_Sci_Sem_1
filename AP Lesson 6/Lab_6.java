import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import static java.lang.Math.pow;

public class Lab_6
{
	//Instantiate Scanner class object
	static Scanner cin = new Scanner(System.in);
	static Boolean incorrect;
	static String name, email, username, password, verify, newline;
	static Vector<String> exercise_name = new Vector<String>();

	public static void main(String[]args)
	{
		System.out.println("Lab 6");
		
		create_exercise_name();
		
		Ex_1 one = new Ex_1();
		one.main();
		Ex_2 two = new Ex_2();
		two.main();
		Ex_3 three = new Ex_3();
		three.main();
		Ex_4 four = new Ex_4();
		four.main();
	}	
	public static class Ex_1
	{
		static String str;
		public static void main()
		{
			printHeading(1);
			readinString();
			printBox();
		}
		public static void readinString()
		{
			System.out.println("Enter any phrase:");
			System.out.print(">>");
			str = cin.nextLine();
		}
		public static void printBox()
		{
			for(int i = 0; i < str.length(); i++)
			{
				System.out.println(str);
			}
		}
	}
	public static class Ex_2
	{
		static int num = 0, temp = 0;
		public static void main()
		{
			printHeading(2);
			enterInt();
			calcFactorial();
			printFactorial();
		}
		public static void enterInt()
		{
			Boolean incorrect = true;
			while(incorrect)
			{
				System.out.println("Enter any positive integer:");
				System.out.print(">>");
				num = cin.nextInt();
				if(num > 0)
				{
					incorrect = false;
				}
				else if(num < 1)
				{
					System.out.println(num + " is not a positive integer.");
				}
			}
			temp = num;
		}
		public static void calcFactorial()
		{
			for(int i = num-1; i > 1; i--)
			{
				num *= i;
			}
		}
		public static void printFactorial()
		{
			System.out.println("The factorial of " + temp + " is " + num);
		}
	}
	public static class Ex_3
	{
		static String str, newline;
		public static void main()
		{
			printHeading(3);
			readinString();
			printTriangle();
		}
		public static void readinString()
		{
			System.out.println("Enter any phrase:");
			System.out.print(">>");
			newline = cin.nextLine();
			str = cin.nextLine();
		}
		public static void printTriangle()
		{
			for(int i = str.length(); i > 0 ; i--)
			{
				System.out.println(str.substring(0,i));
			}
		}
	}
	public static class Ex_4
	{
		static double slope = 0, y_intercept = 0;
		static int table_size = 0;
		public static void main()
		{
			printHeading(4);
			readinSlope();
			readinYintercept();
			readinSize();
			printTable();
		}
		public static void readinSlope()
		{
			System.out.println("Enter the slope:");
			System.out.print(">>");
			slope = cin.nextDouble();
		}
		public static void readinYintercept()
		{
			System.out.println("Enter the y-intercept:");
			System.out.print(">>");
			y_intercept = cin.nextDouble();
		}
		public static void readinSize()
		{
			Boolean incorrect = true;
			while(incorrect)
			{
				System.out.println("Enter size of table:");
				System.out.print(">>");
				table_size = cin.nextInt();
				if(table_size > 0)
				{
					incorrect = false;
				}
				else if(table_size < 1)
				{
					System.out.println(table_size + " is not a positive integer.");
				}
			}
		}
		public static void printTable()
		{
			System.out.println("x  |  y");
			for(int i = 0; i < table_size; i++)
			{
				if(i == 0)
				{
					System.out.println(i + "  |  " + y_intercept);
				}
				else
				{
					System.out.println(i + "  |  " + ((i*slope)+y_intercept));
				}
			}
		}
	
	}
	public static void create_exercise_name()
	{
		exercise_name.add("Box");
		exercise_name.add("Factorial");
		exercise_name.add("Reverse Triangle");
		exercise_name.add("Graph Table");
	}
	public static void printHeading(int num)
	{
		endl();
		System.out.println("Exercise " + num + ": " + exercise_name.get(num-1));
		endl();
	}
	public static void endl()
	{
		System.out.println();
	}
}