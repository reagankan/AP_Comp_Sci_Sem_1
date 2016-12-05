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
		System.out.println("Lab_10");
		create_exercise_name();

		Ex_1 one = new Ex_1();
		one.main();
		pause(5);
		
		Ex_2 two = new Ex_2();
		two.main();	
	}	
	public static class Ex_1
	{
		public static void main()
		{
			printHeading(1);
			Integer[] numbers = {2,6,8,9,10,12,13,15,17,24,55,66,78,77,79};
			ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(numbers));
			nums = removePrimes(nums);
			
			
			System.out.println("from the set of the following numbers...");
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
				if(n%j == 0)//composite
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
				if(gFactor(nums.get(i)) == 0)
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
		static String readin_expr;
		public static void main()
		{
			printHeading(2);
			readinExpression();
			
			//readin_expr to array called temp
			String[] temp = readin_expr.split(" ");
			//array temp to ArrayList<String>
			ArrayList<String> expression = new ArrayList<String>(Arrays.asList(temp));
			calcExpression(expression);
		}
		public static void readinExpression()
		{
			System.out.println("Enter a mathematical expression(Ex: 1 + 1, notice the spaces):");
			System.out.print(">>");
			readin_expr = cin.nextLine();
		}
		
		//LOGIC
		//BEFORE
		/*	index: 0   1   2  */
		/*  value: 5   /   3  */
		//CALC	
		/*	index:  0      1        2     */
		/*  value: 5/3   erase    erase   */
		//AFTER
		/*	index:   0   */
		/*  value: 1.66  */
		public static void calcExpression(ArrayList<String> expr)
		{	
			while(expr.size() != 1)
			{
				int ii = 0;
				while(ii < expr.size())
				{
					if(expr.get(ii).equals("^"))  
					{
						//System.out.println("Multiplying");
						double op1 = Double.parseDouble(expr.get(ii-1));
						double op2 = Double.parseDouble(expr.get(ii+1));
						//System.out.println("op1: " + op1);
						//System.out.println("op2: " + op2);
						expr.set(ii, Double.toString(Math.pow(op1,op2)));
						expr.remove(ii-1);
						expr.remove(ii);
					}
					ii++;
				}
				int i = 0;
				while(i < expr.size())
				{
					if(expr.get(i).equals("*") || expr.get(i).equals("/"))  
					{
						if(expr.get(i).equals("*"))  
						{
							//System.out.println("Multiplying");
							double op1 = Double.parseDouble(expr.get(i-1));
							double op2 = Double.parseDouble(expr.get(i+1));
							//System.out.println("op1: " + op1);
							//System.out.println("op2: " + op2);
							expr.set(i, Double.toString(op1 * op2));
							expr.remove(i-1);
							expr.remove(i);
						}
						else if(expr.get(i).equals("/"))
						{
							//System.out.println("Dividing");
							double op1 = Double.parseDouble(expr.get(i-1));
							double op2 = Double.parseDouble(expr.get(i+1));
							//System.out.println("op1: " + op1);
							//System.out.println("op2: " + op2);
							expr.set(i, Double.toString(op1 / op2));
							expr.remove(i-1);
							expr.remove(i);
						}
					}
					i++;
				}		
				int j = 0;
				while(j < expr.size())
				{
					if(expr.get(j).equals("+") || expr.get(j).equals("-"))  
					{
						if(expr.get(j).equals("+"))  
						{
							//System.out.println("Adding");
							double op1 = Double.parseDouble(expr.get(j-1));
							double op2 = Double.parseDouble(expr.get(j+1));
							//System.out.println("op1: " + op1);
							//System.out.println("op2: " + op2);
							expr.set(j, Double.toString(op1 + op2));
							expr.remove(j-1);
							expr.remove(j);
						}
						else if(expr.get(j).equals("-"))
						{
							//System.out.println("Subtracting");
							double op1 = Double.parseDouble(expr.get(j-1));
							double op2 = Double.parseDouble(expr.get(j+1));
							//System.out.println("op1: " + op1);
							//System.out.println("op2: " + op2);
							expr.set(j, Double.toString(op1 - op2));
							expr.remove(j-1);
							expr.remove(j);
						}
					}
					j++;
				}
			}
			for(int ans = 0; ans < expr.size(); ans++)
			{
				System.out.println("Solution: " + expr.get(ans));	
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