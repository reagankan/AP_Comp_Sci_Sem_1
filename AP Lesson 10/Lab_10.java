import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Random;
import static java.lang.Math.pow;
import static java.lang.Math.abs;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;

public class Lab_10
{
	//Instantiate Scanner class object
	static Scanner cin = new Scanner(System.in);
	//Instantiate Random class object
	static Random random = new Random();
	static Vector<String> exercise_name = new Vector<String>();
	public static void main(String[]args)
	{
		cout("Lab_10");
		create_exercise_name();

		Ex_1 one = new Ex_1();
		one.main();
		System.exit(0);
		pause(5);
		
		Ex_2 two = new Ex_2();
		two.main();	
	
		pause(5);
	}	
	public static class Ex_1
	{
		public static void main()
		{
			printHeading(1);
			Integer[] numbers = {2,6,8,9,10,12,13,15,17,24,55,66,78,77,79};
			ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(numbers));
			nums = removePrimes(nums);
			
			
			System.out.println("All Numbers");
			for(int elem : numbers)
			{
				System.out.print(elem + " ");
			}
			endl();
			
			System.out.println("Composite Numbers");
			for(int element : nums)
			{
				System.out.print(element + " ");
			}
			endl();
			
		}
		public static int gFactor(int n)
		{
			for(int j = 2; j < n; j++)
			{
				if(n%j == 0)
				{
					return 1;
				}
			}	
			return 0;
		}
		public static ArrayList<Integer> removePrimes(ArrayList<Integer> nums)
		{
			ArrayList<Integer> output = new ArrayList<Integer>();
			for(int i = 0; i < nums.size(); i++)
			{
				if(gFactor(i) == 0)
				{
					System.out.println("Removing: " + nums.get(i));
					nums.remove(i);
				}
			}
			output = nums;
			return output;
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
	
	public static void create_exercise_name()
	{
		exercise_name.add("Keep Composites");
		exercise_name.add("Expression Solver");
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
	public static void msleep(int milli)
	{
		try{
			TimeUnit.MILLISECONDS.sleep(milli);
		} catch(InterruptedException ex){
			//do nothing
		}
	}
	public static void pause(int sec)
	{
		System.out.print("Moving on in: ");
		for(int i = sec; i >= 1; i--)
		{
			System.out.print(i);
			cout1("...");
			msleep(1000);
		}
	}
	public static void cout1(String str)
	{
		for(int i = 0; i < str.length(); i++)
		{
			System.out.print(str.charAt(i));
			msleep(250);
		}
	}
	public static void cout(String str)
	{
		for(int i = 0; i < str.length(); i++)
		{
			System.out.print(str.charAt(i));
			msleep(250);
		}
		endl();
	}
}