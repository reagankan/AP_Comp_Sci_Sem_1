import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import static java.lang.Math.pow;

public class Lab_7
{
	//Instantiate Scanner class object
	static Scanner cin = new Scanner(System.in);
	static Boolean incorrect;
	static String name, email, username, password, verify, newline;
	static Vector<String> exercise_name = new Vector<String>();

	public static void main(String[]args)
	{
		System.out.println("Lab 7");
		
		create_exercise_name();
		
		Ex_1_v1 one_v1 = new Ex_1_v1();
		one_v1.main();
		
		Ex_1_v2 one_v2 = new Ex_1_v2();
		one_v2.main();
		
		Ex_2 two = new Ex_2();
		two.main();
		
		/*
		Ex_3 three = new Ex_3();
		three.main();
		Ex_4 four = new Ex_4();
		four.main();*/
	}	
	public static class Ex_1_v1
	{
		static String str_num;
		static int num = 0, sum = 0, temp = 0;
		public static void main()
		{
			printHeading(1);
			System.out.println("Version 1");
			readinNum();
			printSum();
		}
		public static void readinNum()
		{
			boolean cond = true;
			int limit = 0;
			char dot = '.', negative = '-';
			while(cond)
			{
				limit = 0;
				System.out.println("Enter any positive integer:");
				System.out.print(">>");
				str_num = cin.nextLine();
				for(int i = 0; i < str_num.length(); i++)
				{
					if(dot == str_num.charAt(i) || negative == str_num.charAt(i))
					{
						limit++;
						if(limit < 2)
						{
							System.out.println("Input Error!");
						}
					}
				}
				if(limit == 0)
				{
					cond = false;
				}
			}
		}
		public static void printSum()
		{
			num = Integer.parseInt(str_num);
			temp = num;
			while(num > 0)
			{
				//System.out.println("Inside while");
				sum += num % 10;
				num /= 10;
			}
			System.out.println("The sum of the digits of " + temp + " is " +  sum);
		}
	}
	
	public static class Ex_1_v2 
	{
		static String str_num;
		static double num = 0, orig = 0;
		static int temp = 0, sum = 0;
		public static void main()
		{
			System.out.println("\nVersion 2");
			readinNum();
			printSum();
		}
		public static void readinNum()
		{
			System.out.println("Enter any real number including negative decimals:");
			System.out.print(">>");
			num = cin.nextDouble();
		}
		public static void printSum()
		{
			orig = num;
			num  = Math.abs(num);
			
			//save temp as digits left of decimal
			temp = (int) num;
			//save num as digits right of decimal
			num -= temp;
			
			//change num so that it is a whole number
			str_num = Double.toString(num);
			int index = str_num.indexOf(".");
			int count = 0;
			for(int i = index + 1; i < str_num.length(); i++)
			{
				count++;
			}
			while(count > 0)
			{
				num *= 10;
				count--;
			}
			
			//find sum
			while(temp > 0 || num > 0)
			{
				sum += num % 10;
				sum += temp % 10;
				
				num /= 10;
				temp /= 10;
			}
			System.out.println("The sum of the digits of " + orig + " is " +  sum);
		}
	}
	
	public static class Ex_2
	{
		static String str_num;
		static double num = 0, orig = 0;
		static int temp = 0, avg = 0, numerator = 0, denominator = 0;
		public static void main()
		{
			printHeading(2);
			readinNum();
			printAverage();
		}
		public static void readinNum()
		{
			System.out.println("Enter any real number including negative decimals:");
			System.out.print(">>");
			num = cin.nextDouble();
		}
		public static void printAverage()
		{
			orig = num;
			num  = Math.abs(num);
			
			//save temp as digits left of decimal
			temp = (int) num;
			//save num as digits right of decimal
			num -= temp;
			
			//change num so that it is a whole number
			str_num = Double.toString(num);
			int index = str_num.indexOf(".");
			int count = 0;
			for(int i = index + 1; i < str_num.length(); i++)
			{
				count++;
			}
			while(count > 0)
			{
				num *= 10;
				count--;
			}
			
			//find numerator
			while(temp > 0 || num > 0)
			{
				numerator += num % 10;
				denominator++;
				numerator += temp % 10;
				denominator++;
				
				num /= 10;
				temp /= 10;
			}
			
			//find average
			avg = numerator/denominator;
			System.out.println("The average of the digits of " + orig + " is " +  avg);
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
		exercise_name.add("DigitAdder");
		exercise_name.add("AverageDigits");
		exercise_name.add("Reverse Number");
		exercise_name.add("ReplaceAts");
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