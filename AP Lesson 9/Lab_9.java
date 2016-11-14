import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Random;
import static java.lang.Math.pow;
import static java.lang.Math.abs;

public class Lab_9
{
	//Instantiate Scanner class object
	static Scanner cin = new Scanner(System.in);
	//Instantiate Random class object
	static Random random = new Random();
	static Vector<String> exercise_name = new Vector<String>();
	public static void main(String[]args)
	{
		System.out.println("Lab 9");
		
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
		public static final int NUM_WORDS = 5;
		static String[] words = new String[NUM_WORDS];
		public static void main()
		{
			printHeading(1);
			readinArray();
			print();
			reversePrint();
		}
		public static void readinArray()
		{
			for(int i = 0; i < NUM_WORDS; i++)
			{
				System.out.println("Enter any word or phrase:");
				System.out.print(">>");
				words[i] = cin.nextLine();
			}
		}
		public static void print()
		{
			System.out.println("In order:");
			int count = 0;
			for(String phrase : words)
			{
				count++;
				System.out.print(phrase);
				if(count < NUM_WORDS)
				{
					System.out.print(", ");
				}
				else
				{
					endl();
				}
			}
		}
		public static void reversePrint()
		{
			System.out.println("In reverse:");
			for(int i = NUM_WORDS - 1; i >= 0; i--)
			{
				System.out.print(words[i]);
				if(i == 0)
				{
					endl();
				}
				else
				{
					System.out.print(", ");
				}
			}
		}
	}
	
	public static class Ex_2
	{
		public static final int NUM_WORDS = 5;
		static String[] words = new String[NUM_WORDS];
		public static void main()
		{
			printHeading(2);
			readinArray();
			printFirst();
		}
		public static void readinArray()
		{
			for(int i = 0; i < NUM_WORDS; i++)
			{
				System.out.println("Enter any word or phrase:");
				System.out.print(">>");
				words[i] = cin.nextLine();
			}
		}
		public static void printFirst()
		{
			for(String phrase : words)
			{
				System.out.println("1st letter in " + phrase + " is " + phrase.charAt(0) + ".");
			}
		}
	}
	public static class Ex_3
	{
		public static final int ARRAY_SIZE = 10;
		static int[] numbers = new int[ARRAY_SIZE];
		public static void main()
		{
			printHeading(3);
			createArray();
			printArray();
			printAverage();
		}
		public static void createArray()
		{
			for(int i = 0; i < ARRAY_SIZE; i++)
			{
				numbers[i] = random.nextInt(101); //random int from 1-100
			}
		}
		public static void printArray()
		{
			int count = 0;
			for(int num : numbers)
			{
				System.out.println("numbers[" + count + "]: " + num + ".");
				count++;
			}
		}
		public static void printAverage()
		{
			double numerator = 0, denominator = ARRAY_SIZE;
			for(int num : numbers)
			{
				numerator += (double)(num);
			}
			System.out.println("The average of the randomly generated numbers shown above is " + numerator/denominator);
		}
	}
	public static class Ex_4
	{
		public static void main()
		{
			printHeading(4);
			final int ARRAY_SIZE = readinSize();
			int[] array = new int[ARRAY_SIZE];
			
			for(int i = 0; i < ARRAY_SIZE; i++)
			{
				if(i == 0)
				{
					array[i] = readinInitValue();
					i++;
					array[i] = array[i-1];
				}
				else
				{
					array[i] = Sum(array[i-1], array[i-2]);
				}
			}
			
			printArray(array, ARRAY_SIZE);
		}
		public static int readinSize()
		{
			int readin = 0;
			System.out.println("Enter sequence size:");
			System.out.print(">>");
			readin = abs(cin.nextInt());
			return readin;
		}
		public static int readinInitValue()
		{
			int readin = 0;
			System.out.println("Enter starting number:");
			System.out.print(">>");
			readin = abs(cin.nextInt());
			return readin;
		}
		public static int Sum(int a, int b)
		{
			return a+b;
		}
		public static void printArray(int[] sequence, int size)
		{
			int count = 0;
			for(int num : sequence)
			{
				count++;
				System.out.print(num);
				if(count < size)
				{
					System.out.print(", ");
				}
				else
				{
					endl();
				}
			}
		}
	}
	public static void create_exercise_name()
	{
		exercise_name.add("Reverse Word");
		exercise_name.add("First Letter");
		exercise_name.add("Average Numbers");
		exercise_name.add("Fibonacci Sequence");
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