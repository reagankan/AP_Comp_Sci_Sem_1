import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Random;
import static java.lang.Math.pow;
import static java.lang.Math.abs;
import java.util.concurrent.TimeUnit;

public class Lab_9
{
	//Instantiate Scanner class object
	static Scanner cin = new Scanner(System.in);
	//Instantiate Random class object
	static Random random = new Random();
	static Vector<String> exercise_name = new Vector<String>();
	public static void main(String[]args)
	{
		cout("Lab_9");
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
		pause(5);
		
		cout("Lab_9.1");
		
		Ex_5 five = new Ex_5();
		five.main();
		pause(5);
		
		Ex_6 six = new Ex_6();
		six.main();
		pause(5);
		
		Ex_7 seven = new Ex_7();
		seven.main();
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
	public static class Ex_5
	{
		public static final int ARRAY_SIZE = 10;
		static int[] numbers = new int[ARRAY_SIZE];
		static boolean[] isOdd = new boolean[ARRAY_SIZE];
		public static void main()
		{
			String[] output = new String[ARRAY_SIZE];
			printHeading(5);
			createArray();
			printNumbers();
			output = getOdds();
			printOdds(output);
		}
		public static void createArray()
		{
			for(int i = 0; i < ARRAY_SIZE; i++)
			{
				numbers[i] = random.nextInt(101); //random int from 1-100
			}
		}
		public static void printNumbers()
		{
			System.out.print("The following is a list of 10 randomly generated integers: ");
			int count = 0;
			for(int num : numbers)
			{
				count++;
				System.out.print(num);
				if(count < ARRAY_SIZE)
				{
					System.out.print(", ");
				}
				else
				{
					System.out.print(".");
					endl();
				}
			}
		}
		public static boolean isOdd(int num)
		{
			return num % 2 == 1;
		}
		public static String[] getOdds()
		{
			int counter = 0;
			for(int num : numbers)
			{
				if(isOdd(num))
				{
					isOdd[counter] = true;
				}
				else
				{
					isOdd[counter] = false;
				}
				counter++;
			}
			
			int num_odd = 0;
			for(boolean cond : isOdd)
			{
				if(cond)
				{
					num_odd++;
				}
			}
			String[] odd_num = new String[num_odd];
			int iter = 0;
			for(int i = 0; i < isOdd.length; i++)
			{
				if(isOdd[i])
				{
					//System.out.println("odd num iter: " + iter + "\tisOdd iter: " + i);
					odd_num[iter] = Integer.toString(numbers[i]);
					iter++;
				}
			}
		return odd_num;
		}
		public static void printOdds(String[] odd_num)
		{
			System.out.print("The following is a list of all the odd numbers from the previous list: ");
			int count = 0;
			for(String num : odd_num)
			{
				count++;
				System.out.print(num);
				if(count < odd_num.length)
				{
					System.out.print(", ");
				}
				else
				{
					System.out.print(".");
					endl();
				}
			}
		}
	}
	public static class Ex_6
	{
		public static final int ARRAY_SIZE = 10;
		static int[] numbers = new int[ARRAY_SIZE];
		public static void main()
		{
			printHeading(6);
			createNumbers();
			printNumbers();
			printLargest();
		}
		public static void createNumbers()
		{
			for(int i = 0; i < ARRAY_SIZE; i++)
			{
				numbers[i] = random.nextInt(101); //random int from 1-100
			}
		}
		public static void printNumbers()
		{
			System.out.print("The following is a list of 10 randomly generated integers: ");
			int count = 0;
			for(int num : numbers)
			{
				count++;
				System.out.print(num);
				if(count < ARRAY_SIZE)
				{
					System.out.print(", ");
				}
				else
				{
					System.out.print(".");
					endl();
				}
			}
		}
		public static void printLargest()
		{
			int max = 0;
			for(int num : numbers)
			{
				if(max < num)
				{
					max = num;
				}
			}
			System.out.println("The largest number in the list above is: " + max);
		}
		
	}
	public static class Ex_7
	{
		public static final int NUM_WORDS = 5;
		static String[] words = new String[NUM_WORDS];
		public static void main()
		{
			printHeading(7);
			generateWords();
			printZWords();
		}
		public static void generateWords()
		{
			String newline;
			/*for(String wrd : words)
			{
				System.out.println("Enter a word/phrase:");
				System.out.print(">>");
				wrd = cin.nextLine();
			}*/
			for(int i = 0; i < words.length; i++)
			{
				System.out.println("Enter a word/phrase:");
				System.out.print(">>");
				if(i == 0)
				{
					newline = cin.nextLine();
				}
				words[i] = cin.nextLine();
			}
		}
		public static boolean hasZs(String wrd)
		{
			boolean z = false;
			if(wrd.indexOf("z") != -1 || wrd.indexOf("Z") != -1)
			{
				z = true;
			}
			return z;
		}
		public static void printZWords()
		{
			System.out.println("The following word(s) contain(s) the letter 'z':");
			for(String wrd : words)
			{
				if(hasZs(wrd))
				{
					System.out.printf("*%10s", wrd);
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
		exercise_name.add("Get Odds");
		exercise_name.add("Biggest Number");
		exercise_name.add("Find The Zs");

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