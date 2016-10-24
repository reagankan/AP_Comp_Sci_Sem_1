import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import static java.lang.Math.pow;

public class Lab_6_1
{
	//Instantiate Scanner class object
	static Scanner cin = new Scanner(System.in);
	static Boolean incorrect;
	static String name, email, username, password, verify, newline;
	static Vector<String> exercise_name = new Vector<String>();

	public static void main(String[]args)
	{
		System.out.print("Lab 6.1");
		
		create_exercise_name();
		
		Ex_5 five = new Ex_5();
		five.main();
		Ex_6 six = new Ex_6();
		six.main();
		Ex_7 seven = new Ex_7();
		seven.main();
		Ex_8 eight = new Ex_8();
		eight.main();
	}	
	public static class Ex_5
	{
		static int low = 0, high = 0;
		static Vector<Integer> sequence = new Vector<Integer>();
		public static void main()
		{
			printHeading(5);
			readinLimits();
			createSequence();
			printSequence();
		}
		public static void readinLimits()
		{
			System.out.println("Enter lower limit as an integer number:");
			System.out.print(">>");
			low = cin.nextInt();
			
			System.out.println("Enter upper limit as an integer number:");
			System.out.print(">>");
			high = cin.nextInt();
		}
		public static void createSequence()
		{
			for(int i = low; i <= high; i += low)
			{
				sequence.add(i);
			}
		}
		public static void printSequence()
		{
			for(int i = 0; i < sequence.size(); i++)
			{
				System.out.print(sequence.get(i));
				if(i != sequence.size()-1)
				{
					System.out.print("\t");
				}
			}
		}
	}
	public static class Ex_6
	{
		static String newline, str;
		public static void main()
		{
			printHeading(6);
			readinString();
			printRightTriangle();
		}
		public static void readinString()
		{
			System.out.println("Enter any phrase:");
			System.out.print(">>");
			newline = cin.nextLine();
			str = cin.nextLine();
		}
		public static void printRightTriangle()
		{
			for(int i = 0; i < str.length(); i++)
			{
				System.out.println(str.substring(i,str.length()));
			}
		}
	}
	public static class Ex_7
	{
		static String newline, str;
		public static void main()
		{
			printHeading(7);
			readinString();
			printLeftTriangle();
		}
		public static void readinString()
		{
			System.out.println("Enter any phrase:");
			System.out.print(">>");
			//newline = cin.nextLine();
			str = cin.nextLine();
		}
		public static void printLeftTriangle()
		{
			for(int i = str.length(); i > 0 ; i--)
			{
				System.out.println(str.substring(i-1,str.length()));
			}
		}
	}
	public static class Ex_8
	{
		static Vector<String> lyrics = new Vector<String>();
		public static void main()
		{
			printHeading(8);
			
			System.out.println("Using my own coding style");
			createLyrics();
			printSong();
			endl();
			endl();
			
			System.out.println("Using Robinette's coding style");
			Sing("Na", 4);
			Sing("Na", 4);
			Sing("Hey", 3);
			Sing("Goodbye!", 1);
		}
		public static void createLyrics()
		{
			lyrics.add("Na");
			lyrics.add("Hey");
			lyrics.add("Goodbye!");
		}
		public static void printSong()
		{
			for(int i = 0; i < 8; i++)
			{
				System.out.print(lyrics.get(0) + " ");
				if(i == 3)
				{
					endl();
				}
			}
			endl();
			for(int i = 0; i < 3; i++)
			{
				System.out.print(lyrics.get(1) + " ");
			}
			endl();
			System.out.print(lyrics.get(2));
		}
		public static void Sing(String str, int iter)
		{
			for(int i = 0; i < iter; i++)
			{
				System.out.print(str + " ");
			}
			endl();
		}
	}
	public static void create_exercise_name()
	{
		exercise_name.add("Count by x");
		exercise_name.add("Right Triangle");
		exercise_name.add("Left Triangle");
		exercise_name.add("Song");
	}
	public static void printHeading(int num)
	{
		endl();
		System.out.println("\nExercise " + num + ": " + exercise_name.get(num-5));
		endl();
	}
	public static void endl()
	{
		System.out.println();
	}
}