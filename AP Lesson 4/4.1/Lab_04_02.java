import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import static java.lang.Math.pow;

public class Lab_04_02
{
	//Instantiate Scanner class object
	Scanner cin = new Scanner(System.in);
	int id = 0, title_decision = 7;
	String f_name, l_name, school, subject, school_year, title, newline;
	public static void main(String[]args)
	{
		//Instantiate Class object
		Lab_04_02 class_object = new Lab_04_02();
		
		
		System.out.println("Lab 4 Exercise 2: School ID\n\n");
		
		
		Boolean cond_1 = true, 
				cond_2 = true, 
				redo_1 = false, 
				redo_2 = false;
		
		//keeps running until the name is correct
		while(cond_1)
		{
			//First name
			class_object.readinFirst();
			class_object.endl();
		
			//Print f_name
			class_object.printFirst();
			class_object.endl();
			
			//Last Name
			class_object.readinLast();
			class_object.endl();
		
			//Print l_name
			class_object.printLast();
			class_object.endl();
			
			//Check the num_items
			redo_1 = class_object.nameIncorrect();
			if(redo_1)
			{
				//let while loop reiterate
			}
			else
			{
				cond_1 = false;
			}
		}
		class_object.endl();
		
		
		
		//keeps running until everything else is correct
		while(cond_2)
		{
			//cin Title 
			class_object.readinTitle();
			class_object.endl();
			
			//cin School
			class_object.readinSchool();
			class_object.endl();
			
			//cin Year
			class_object.readinYear();
			class_object.endl();
			
			//cin Subject
			class_object.readinSubject();
			class_object.endl();
			
			
			
			//cout everything to check
			class_object.printTitle();	
			class_object.endl();
			
			class_object.printSchool();	
			class_object.endl();
			
			class_object.printYear();	
			class_object.endl();
			
			class_object.printSubject();	
			class_object.endl();
			
	
			//Check the list of items
			//int count = 0;
			redo_2 = class_object.anythingIncorrect();
			if(redo_2)
			{
				//let while loop reiterate
			}
			else
			{
				cond_2 = false;
			}
		}
		class_object.endl();
		
		
		class_object.printAll();
	}	
	
	public void endl()
	{
		System.out.println();
	}
	
	public void readinFirst()
	{	
		System.out.println("Enter your First Name:");
		System.out.print(">>");	
		f_name = cin.next();	
	}
	public void printFirst()
	{
		System.out.println("Your first name is " + f_name);
	}
	
	
	public void readinLast()
	{	
		System.out.println("Enter your Last Name:");
		System.out.print(">>");	
		l_name = cin.next();	
	}
	public void printLast()
	{
		System.out.println("Your last name is " + l_name);
	}
	
	
	public Boolean nameIncorrect()
	{
		Boolean exit = false, 
				incorrect = false;
		while(exit == false)
		{
			
			String response;
			System.out.println("Are you " + f_name + " " + l_name + "?(y or n)");
			response = cin.next();
			if(response.equals("y"))
			{
				exit = true;
			}
			else if(response.equals("n"))
			{
				incorrect = true;
				exit = true;
			}
			else
			{
				System.out.println("Please only enter y or n\n");
			}
		}
		return incorrect;
	}
	
	
	
	
	public void readinTitle()
	{	
		Boolean exit = false;
		
		while(exit == false)
		{
			System.out.println("Are you a...(1 or 2)");
			System.out.println("1. Student");
			System.out.println("2. Teacher");
			System.out.print(">>");	
			title_decision = cin.nextInt();	
			
			if(title_decision == 1)
			{
				title = "student";
				exit = true;
			}
			else if(title_decision == 2)
			{
				title = "teacher";
				exit = true;
			}
			else
			{
				System.out.println("Please only enter 1 or 2");
			}
		}
	}
	public void readinSchool()
	{	
		String newline;
		System.out.println("Enter the name of the school you attend:");
		System.out.print(">>");
		newline = cin.nextLine();
		school = cin.nextLine();	
	}
	public void readinYear()
	{
		System.out.println("What is the school year? (Ex: 1999-2000 or 2016-2017)");
		System.out.print(">>");	
		//newline = cin.nextLine();
		school_year = cin.nextLine();

	}
	public void readinSubject()
	{
		System.out.print("What is your subject?");
		System.out.print("\n>>");	
		//newline = cin.nextLine();
		subject = cin.nextLine();
	}
	
	
	public void printTitle()
	{
		System.out.println("Your are a " + title);
	}
	
	public void printSchool()
	{
		System.out.println("You go to " + school);
	}
	public void printYear()
	{
		System.out.println("The school year is " + school_year);
	}
	
	public void printSubject()
	{
		System.out.println("Your subject is " + subject);
	}
	
	public Boolean anythingIncorrect()
	{
		Boolean incorrect = false;
		String response, newline;
		System.out.println("Is any of the information above incorrect?(y or n)");
		//newline = cin.nextLine();
		response = cin.next();
		if(response.equals("y"))
		{
			incorrect = true;
		}
		return incorrect;
	}
	
	
	

	public void printAll()
	{
		System.out.println("********************Student ID**********************");
		
		System.out.println("Name: \t\t\t\t\t" + f_name + " " + l_name);
		System.out.println("School: \t\t\t\t\t" + school);
		System.out.println("Year: \t\t\t\t\t" + school_year);
		System.out.println("Title: \t\t\t\t\t" + title);
		System.out.println("Subject: \t\t\t\t\t" + subject);
		
		System.out.println("***************************************************");
	}
	
}