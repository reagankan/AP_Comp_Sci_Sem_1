import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Random;
import static java.lang.Math.pow;
import static java.lang.Math.abs;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;

public class Lab_11
{
	//Instantiate Scanner class object
	static Scanner cin = new Scanner(System.in);
	//Instantiate Random class object
	static Random random = new Random();
	static Vector<String> exercise_name = new Vector<String>();
	public static void main(String[]args)
	{
		System.out.println("Lab_11");
		create_exercise_name();

		Ex_1 one = new Ex_1();
		one.main();
		pause(5);
		
		Ex_2 two = new Ex_2();
		two.main();	
		pause(5);
		
		Ex_3 three = new Ex_3();
		three.main();
		pause(5);
		
		Ex_4 four = new Ex_4();
		four.main();	
	}	
	public static class Ex_1
	{
		//Instantiate Random class object
		static Random random = new Random();
		public static void main()
		{
			printHeading(1);
			//System.out.println(greatestCommonFactor(15, 6));
			int[][] nums = new int[4][4];
			for(int i = 0; i < 4; i++)
			{
				for(int j = 0; j < 4; j++)
				{
					nums[i][j] = random.nextInt(101);
				}
			}
			for(int i = 0; i < 4; i++)
			{
				for(int j = 0; j < 4; j++)
				{
					System.out.println("nums[" + i + "][" + j + "]: " + nums[i][j]);
				}
			}
			endl();
		}
		public static int greatestCommonFactor(int k, int n)
		{
		  if(k == n)

			  return k;
		   else

			  if(k < n)


			  else

		}
	}
	
	public static class Ex_2
	{
		public static void main()
		{
			printHeading(2);
			final int ARRAY_SIZE = 4;
			String[][] words = new String[ARRAY_SIZE][ARRAY_SIZE];
			for(int i = 0; i < ARRAY_SIZE; i++)
			{
				for(int j = 0; j < ARRAY_SIZE; j++)
				{
					System.out.println("Please enter a word: ");
					System.out.print(">>");
					words[i][j] = cin.nextLine();
				}
			}
			for(int i = 0; i < ARRAY_SIZE; i++)
			{
				for(int j = 0; j < ARRAY_SIZE; j++)
				{
					System.out.println("words[" + i + "][" + j + "]: " + words[i][j]);
				}
			}
			endl();
		}
		
	}
	public static class Ex_3
	{
		//Instantiate Random class object
		static Random random = new Random();
		public static void main()
		{
			printHeading(3);
			final int ARRAY_SIZE = 4;
			String[][] xAndO = new String[ARRAY_SIZE][ARRAY_SIZE];
			for(int i = 0; i < ARRAY_SIZE; i++)
			{
				for(int j = 0; j < ARRAY_SIZE; j++)
				{
					int cond = random.nextInt(2) + 1;
					if(cond == 1)
					{
						xAndO[i][j] = "X";
					}
					else
					{
						xAndO[i][j] = "O";
					}
				}
			}
			for(int i = 0; i < ARRAY_SIZE; i++)
			{
				for(int j = 0; j < ARRAY_SIZE; j++)
				{
					System.out.println("xAndO[" + i + "][" + j + "]: " + xAndO[i][j]);
				}
			}
			endl();
		}
	}
	public static class Ex_4
	{
		static Random random = new Random();
		public static void main()
		{
			printHeading(4);
			final int ARRAY_SIZE = 4;
			int[][] nums = new int[ARRAY_SIZE][ARRAY_SIZE];
			
			for(int i = 0; i < ARRAY_SIZE; i++)
			{
				for(int j = 0; j < ARRAY_SIZE; j++)
				{
					nums[i][j] = random.nextInt(101);
					System.out.println("nums[" + i + "][" + j + "]: " + nums[i][j]);
				}
			}
			
			System.out.println("Enter a integer divisor.");
			System.out.print(">>");
			int divisor = cin.nextInt();
			int count = 0;
			for(int i = 0; i < ARRAY_SIZE; i++)
			{
				for(int j = 0; j < ARRAY_SIZE; j++)
				{
					if(nums[i][j] % divisor == 0)
					{
						count++;
					}
				}
			}
			System.out.println("There are " + count + " numbers divisible by " + divisor + " in the array.");
			endl();
		}
	}
	
	public static void create_exercise_name()
	{
		exercise_name.add("Random Numbers");
		exercise_name.add("Strings");
		exercise_name.add("Xs and Os");
		exercise_name.add("Divisor");
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
			msleep(250);
			cout1("...");
			
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