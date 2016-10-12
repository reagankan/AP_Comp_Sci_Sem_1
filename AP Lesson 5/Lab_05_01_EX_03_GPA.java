import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import static java.lang.Math.pow;

public class Lab_05_01_EX_03_GPA
{
	//Instantiate Scanner class object
	static Scanner cin = new Scanner(System.in);
	static String readin, confirm, newline;
	static int inum_classes = 0;
	static Boolean incorrect;
	static double sum = 0, dnum_classes = 0, GPA = 0;
	static Vector<String> str_grades = new Vector<String>();
	static Vector<String> classes = new Vector<String>();
	
	public static void main(String[]args)
	{
		System.out.println("Lab 5.1 Exercise 3: GPA\n");
		
		Boolean cond_1 = true;
		
		//keeps running until everything is correct
		while(cond_1)
		{
			readinNumClasses();
			readinClasses();
			readinGrades();
	
			//Print to Check
			printNumClasses();
			printGradesAndClasses();
			anythingIncorrect();
			if(incorrect)//something is wrong
			{
				//let while loop reiterate
				classes.clear();
				str_grades.clear();
			}
			else
			{
				cond_1 = false;
			}
		}
		endl();
		
		calcSum();
		calcGPA();
		printGPA();
	}	
	
	public static void endl()
	{
		System.out.println();
	}
	
	public static void readinNumClasses()
	{
		System.out.println("Enter number of classes:");
		System.out.print(">>");	
		dnum_classes = cin.nextDouble();
		Double d = new Double(dnum_classes);
		inum_classes = d.intValue();
		endl();
	}
	public static void readinClasses()
	{
		for(int i = 0; i < inum_classes; i++)
		{
			if(i == 0)
			{
				System.out.println("Enter Class[" + (i+1) + "]:");
				System.out.print(">>");	
				newline = cin.nextLine();
				readin = cin.nextLine();
				classes.add(readin);
				endl();
			}
			else
			{
				System.out.println("Enter Class[" + (i+1) + "]:");
				System.out.print(">>");	
				//newline = cin.nextLine();
				readin = cin.nextLine();
				classes.add(readin);
				endl();
			}	
		}
	}
	
	public static void readinGrades()
	{
		Boolean cond = true;
		for(int i = 0; i < inum_classes; i++)
		{
			while(cond)
			{
				System.out.println("Enter the grade you received in " + classes.get(i) + ":");
				System.out.print(">>");	
				readin = cin.next();
				if(readin.length() > 1)
				{
					System.out.println("Round off the +/- signs Ex: A+ --> enter A");
				}
				else{
					cond = false;
				}
			}
			str_grades.add(readin);
			cond = true;
			endl();
		}
	}
	
	public static void printNumClasses()
	{
		System.out.println("You are taking " + Integer.toString(inum_classes) + " classes.");
	}
	public static void printGradesAndClasses()
	{
		for(int i = 0; i < classes.size(); i++)
		{
			if(str_grades.get(i).equals("A"))
			{
				System.out.println("You received an " + str_grades.get(i) + " in " + classes.get(i));
			}
			else
			{
				System.out.println("You received a " + str_grades.get(i) + " in " + classes.get(i));
			}	
		}
		/* MY Formating
		String output1 = "%50s\t",
			   output2,
			   clear2 = "Grade: ";
		for(int i = 0; i < classes.size(); i++)
		{
			output2 = clear2;
			output2 += str_grades.get(i);
			//System.out.println("Class[" + (i+1) + "]" + classes.get(i) + "", );
			System.out.printf("Class[" + (i+1) + "] " + classes.get(i) + output1, output2);
			endl();
		}*/
		
		
		//Robinette's formatting
		/*
		String output1,
			   output2;
		System.out.println("_____________________________________________________________");
		for(int i = 0; i < classes.size(); i++)
		{
			output1 = "Class[" + Integer.toString(i+1) + "]: " + classes.get(i);
			output2 = str_grades.get(i);
			System.out.printf("+|| %20s\t%15s ||+\n", output1, output2);
			endl();
		}
		System.out.println("_____________________________________________________________");*/
		
	}
	public static void calcSum()
	{
		for(int gr_iter = 0; gr_iter < str_grades.size(); gr_iter++)
		{
			/*
			if(str_grades.get(gr_iter).length() > 1)
			{
				while(str_grades.get(gr_iter).length() > 1)
				{
					
				}
			}
			*/
			
			if(str_grades.get(gr_iter).equals("A"))
			{
				sum += 4;
			}
			else if(str_grades.get(gr_iter).equals("B"))
			{
				sum += 3;
			}
			else if(str_grades.get(gr_iter).equals("C"))
			{
				sum += 2;
			}
			else if(str_grades.get(gr_iter).equals("D"))
			{
				sum += 1;
			}
			else//str_grades.get(gr_iter).equals("F")
			{
				//allow iteration
			}
		}
	}
	public static void calcGPA()
	{
		GPA = sum/dnum_classes;
	}
	
	public static void printGPA()
	{
		System.out.println("Your GPA is " + Double.toString(GPA) + ".");
	}
	
	public static void anythingIncorrect()
	{
		Boolean cond = true;
		while(cond)
		{
			System.out.println("Is this right?(y or n)");
			System.out.print(">>");
			newline = cin.nextLine();
			confirm = cin.nextLine();
			if(confirm.equals("y"))
			{
				cond = false;
				incorrect = false;
			}
			else if(confirm.equals("n"))
			{
				cond = false;
				incorrect = true;
			}
			else
			{
				System.out.println("Error: incorrect input");
				System.out.println("Please enter y or n");
				System.out.print("Your input was: " + confirm + "\n");
				System.out.println("Try Again!");
			}
		}
	}
}