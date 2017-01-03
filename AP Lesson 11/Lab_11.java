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
		
		System.out.println("Lab_11.1");
		Ex_5 five = new Ex_5();
		five.main();
		pause(5);
		
		Ex_6 six = new Ex_6();
		six.main();	

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

				  return greatestCommonFactor(k, n - k);

			  else

				  return greatestCommonFactor(k-n, n);
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
	public static class Ex_5
	{
		private final static int  CLIP_SIZE = 16, NUM_CLIPS = 6;
		public static int shotsRemaining = 0, 
						  bulletCount = 96;
		public static String readin, action, newline;
		public static String[] clip = new String[CLIP_SIZE];
		public static void main()
		{
			printHeading(5);
			emptyClip();
			printClip();
			readinAction(true);
			printClip();
			while(bulletCount != 0)
			{
				readinAction(false);
				printClip();
			}
			System.out.println("============================");
			System.out.println("Bullets: " + bulletCount);
			//System.out.println("Shots left: " + shotsRemaining);
			System.out.println("Out of Bullets!");
		}
		public static void readinAction(boolean skipFirst)
		{
			System.out.println("Action(R or S):");
			System.out.print(">>");
			if(skipFirst)
			{
				newline = cin.nextLine();
			}
			action = cin.nextLine();
			if(action.equals("S") || action.equals("s"))
			{
				shoot();
			}
			else if(action.equals("R") || action.equals("r"))
			{
				reload();
			}
			else
			{
				readinAction(false);
			}
		}
		/*
		Update
		shotsRemaining
		bulletCount 
		*/
		public static void shoot()
		{
			if(shotsRemaining > 0)
			{
				System.out.println("BOOM!");
				msleep(750);
				clip[shotsRemaining-1] = "[]";
				shotsRemaining--;
				bulletCount--;
			}
			else{
				System.out.println("RELOAD!");
				msleep(750);
			}
			
		}
		public static int count = 0;
		public static void reload()
		{
			//System.out.println("bulletCount before fillClip: " + bulletCount);
			emptyClip();
			if(bulletCount != 16)
			{
				fillClip();
			}
			if(count != 0)
			{
				bulletCount -= shotsRemaining;
			}
			shotsRemaining = 16;
			count++;
		}
		public static void emptyClip()
		{
			for(int i = 0; i < clip.length; i++)
			{
				clip[i] = "[]";
			}
		}
		public static void fillClip()
		{
			for(int i = 0; i < clip.length; i++)
			{
				clip[i] = "*";
			}
		}
		public static void printClip()
		{
			System.out.println("Bullets: " + bulletCount);
			System.out.print("Clip: ");
			for(String slot : clip)
			{
				System.out.print(slot+" ");
			}
			endl();
		}
	}
	public static class Ex_6
	{
		private final static int HEALTH_LOAD = 6;
		public static String turn = "";
		public static int healthCount = HEALTH_LOAD, damage = 0, amount = 0;
		public static String[] health = new String[HEALTH_LOAD];
		public static boolean quit = false;
		public static void main()
		{
			printHeading(6);
			while(healthCount > 0 && !quit)
			{
				System.out.println("Your turn! Hit Enter when ready:");
				System.out.print(">>");
				turn = cin.nextLine();
				if(turn.equals("Q") || turn.equals("q"))
				{
					quit = true;
				}
				else{
					damage = random.nextInt(2)+1;//random int from 1-2
					amount = random.nextInt(6)+1;//random int from 1-6
					takeDamage();
					printClip();
				}
			}
			if(quit)
			{
				System.out.println("You quit!");
			}
			else{
				System.out.println("You died!");
			}
			
		}
		public static void takeDamage()
		{
			if(damage == 1)
			{
				healthCount -= amount;
				System.out.println("Taking " + amount + " damage!");
			}
			else
			{
				if(healthCount + amount < HEALTH_LOAD)
				{
					healthCount += amount;
				}
				else
				{
					healthCount = HEALTH_LOAD;
				}
				System.out.println("Power Up " + amount + "!");
			}
		}
		public static void printClip()
		{
			String output = "Health:\t";
			for(int i = 0; i < health.length; i++)
			{
				if(i < healthCount)
				{
					health[i] = " @ ";
				}
				else
				{
					health[i] = " [] ";
				}
				output += health[i];
			}
			System.out.println(output);
		}
	}
	public static void create_exercise_name()
	{
		exercise_name.add("Random Numbers");
		exercise_name.add("Strings");
		exercise_name.add("Xs and Os");
		exercise_name.add("Divisor");
		exercise_name.add("GameGun");
		exercise_name.add("GameHealth");
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