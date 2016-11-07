import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import static java.lang.Math.pow;

public class Lab_8
{
	//Instantiate Scanner class object
	static Scanner cin = new Scanner(System.in);
	static Boolean incorrect;
	static String name, email, username, password, verify, newline;
	static Vector<String> exercise_name = new Vector<String>();

	public static void main(String[]args)
	{
		System.out.println("Lab 8");
		
		create_exercise_name();
		/*
		Ex_1 one = new Ex_1();
		one.main();
		
		Ex_2 two = new Ex_2();
		two.main();
	*/
		Ex_3 three = new Ex_3();
		three.main();
		
		System.exit(0);
		
		Ex_4 four = new Ex_4();
		four.main();
	}	
	public static class Ex_1
	{
		static String sentence, before, after;
		static int index = 0, start_idx = 0;
		public static void main()
		{
			printHeading(1);
			readinSentence();
			from7();
			print7();
			//replacePrint();
			parseTest();
		}
		public static void readinSentence()
		{
			System.out.println("Enter any phrase/sentence:");
			System.out.print(">>");
			//newline = cin.nextLine();
			sentence = cin.nextLine();
		}
		public static void from7()
		{
			int begin = 0;
			index = sentence.indexOf(' ');
			if(index >= 0)
			{
				begin = index + 1;
				sentence = sentence.substring(0, index) + "_" + sentence.substring(begin, sentence.length());
				from7();
			}
		}
		public static void print7()
		{
			System.out.println("\n1. Recursion...");
			System.out.println("<<"+sentence);
		}
		
		/*public static void replacePrint()
		{
			before = "";
			after = "";
			index = sentence.indexOf(" ");
			if(index != 0)
			{
				before = sentence.substring(start_idx,index);
				//System.out.println(before);
				//after = sentence.substring(index+1, sentence.length()-2);
				sentence = before + "_" + after;
				start_idx = index + 1;
				replacePrint();
			}
			System.out.println("new sentence: " + sentence);
		}*/
		public static void parseTest()
		{
			System.out.println("\n2. String Parse...");
			String delims = "[ ]";
			String[] tokens = sentence.split(delims);
			for(int i = 0; i < tokens.length; i++)
			{
				System.out.print(tokens[i]);
				if(i < tokens.length - 1)
				{
					System.out.print("_");
				}
				else
				{
					endl();
				}
			}
		}
	}
	
	public static class Ex_2
	{
		public static void main()
		{
			printHeading(2);
			
			String one, two, three;
			String result1, result2, result3;
			
			System.out.println("Enter a word:");
			System.out.print(">>");
			one = cin.nextLine();
			
			System.out.println("Enter a word:");
			System.out.print(">>");
			two = cin.nextLine();
			
			System.out.println("Enter a word:");
			System.out.print(">>");
			three = cin.nextLine();
			
			System.out.println(makeCenter(one));
			System.out.println(makeCenter(two));
			System.out.println(makeCenter(three));
		}
		public static String makeCenter(String word)
		{
			String input;
			if(word.length() < 19)
			{
				input = " " + word + " ";
				word = makeCenter(input);
			}
			return word;
		}
	}
	public static class Ex_3
	{
		public static void main()
		{
			printHeading(3);
			
			int number = 0;
			
			System.out.println("Enter a positive integer number:");
			System.out.print(">>");
			number = cin.nextInt();
			
			System.out.println(luck(number));
		}
		public static int luck(int num)
		{
			if(num > 0)
			{
				if(num%10 == 7)
				{
					return 1 + luck(num/10);
				}
				else
				{
					return luck(num/10);
				}
			}
			else
			{
				return 0;
			}
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
		exercise_name.add("Underscores");
		exercise_name.add("Center");
		exercise_name.add("Lucky7s");
		exercise_name.add("TreeDeg60");
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