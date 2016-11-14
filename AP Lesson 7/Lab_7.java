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
		static String number;
		static int num = 0, sum = 0;
		public static void main()
		{
			printHeading(1);
			readinNum();
			sumDigits();
			printSum();
		}
		public static void readinNum()
		{
			boolean cond = true;
			while(cond)
			{
				System.out.println("Enter a positive integer");
				System.out.print(">>");
				number = cin.next();
				num = Integer.parseInt(number);
				if(num < 0)
				{
					System.out.println("Input must be a positive integer");
				}
				else
				{
					cond = false;
				}
			}
		}
		public static void sumDigits()
		{
			while(num > 0)
			{
				sum += num % 10;
				num /= 10;
			}
		}
		public static void printSum()
		{
			System.out.println("The sum of the digits in " + number + " is " + sum);
		}
	}
	
	public static class Ex_2
	{
		static String number;
		static int num1 = 0;
		static double num2 = 0, numerator = 0, denominator = 0, avg = 0;
		public static void main()
		{
			printHeading(2);
			readinNum();
			avgDigits();
			printAvg();
		}
		public static void readinNum()
		{
			boolean cond = true;
			while(cond)
			{
				System.out.println("Enter a positive integer");
				System.out.print(">>");
				number = cin.next();
				
				num1 = Integer.parseInt(number);
				//System.out.println("num: " + num);
				if(num1 < 0)
				{
					System.out.println("Input must be a positive integer");
				}
				else
				{
					cond = false;
				}
			}
		}
		public static void avgDigits()
		{
			while(num1 > 0)
			{
				num2 = (double) (num1 % 10);
				numerator += num2;
				num1 /= 10;
			}
			denominator = number.length();
			/*System.out.println("numer: " + numerator);
			System.out.println("deno: " + denominator);*/
			avg = numerator/denominator;
		}
		public static void printAvg()
		{
			System.out.println("The average of the digits in " + number + " is " + avg);
		}
	}
	public static class Ex_3
	{
		static String number;
		static int num = 0, rev = 0;
		public static void main()
		{
			printHeading(3);
			readinNum();
			getReverse();
			printRev();
		}
		public static void readinNum()
		{
			boolean cond = true;
			while(cond)
			{
				System.out.println("Enter a positive integer");
				System.out.print(">>");
				number = cin.next();
				num = Integer.parseInt(number);
				if(num < 0)
				{
					System.out.println("Input must be a positive integer");
				}
				else
				{
					cond = false;
				}
			}
		}
		public static void getReverse()
		{
			while(num > 0)
			{
				rev *= 10;
				rev += num % 10;
				num /= 10;
			}
		}
		public static void printRev()
		{
			System.out.println("The reverse of " + number + " is " + rev);
		}
	}
	public static class Ex_4
	{
		static String sentence, newline;
		//static Vector<int> index_vector = new Vector();
		static int begin = 0, new_index = 0;
		public static void main()
		{
			printHeading(4);
			readinSentence();
			printSentence();
		}
		public static void readinSentence()
		{
			System.out.println("Enter any phrase/sentence:");
			System.out.print(">>");
			newline = cin.nextLine();
			sentence = cin.nextLine();
		}
		public static void printSentence()
		{
			new_index = sentence.indexOf('a');
			while(new_index >= 0)
			{
				begin = sentence.indexOf('a') + 1;
				sentence = sentence.substring(0, sentence.indexOf('a')) + "@" + sentence.substring(begin, sentence.length());
				new_index = sentence.indexOf('a');
			}
			System.out.println(sentence);
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