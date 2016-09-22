import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import static java.lang.Math.pow;

public class Lab_04_02
{
	//Instantiate Scanner class object
	Scanner cin = new Scanner(System.in);
	int id = 0, title_decision = 7;
	string f_name, l_name, school, subject, school_year, title;
	public static void main(String[]args)
	{
		//Instantiate Class object
		Lab_04_02 class_object = new Lab_04_02();
		
		
		System.out.println("Lab 4 Part 2: School ID\n\n");
		
		String name;
		Boolean cond_1 = true, cond_2 = true, redo_1 = false, redo_2 = false;
		
		//keeps running until the num_items is correct
		while(cond_1)
		{
			//number of items
			class_object.readinNumItems();
			class_object.endl();
		
			//Print num_items
			class_object.printNumItems();
			class_object.endl();
			
			//Check the num_items
			redo_1 = class_object.numItems_Incorrect();
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
		
		//keeps running until the Array List is correct
		while(cond_2)
		{
			//cin items
			class_object.readinArrayList();
			class_object.endl();
			
			//cout items
			class_object.printArrayList();	
			class_object.endl();
			
			//Check the list of items
			redo_2 = class_object.ArrayList_Incorrect();
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
		
		class_object.calculate();
		
		class_object.printReceipt();
	}	
	
	public void endl()
	{
		System.out.println();
	}
	
	public void readinFirst()
	{	
		System.out.println("Enter your First Name:");
		System.out.print(">>");	
		f_name = cin.nextLine();	
	}
	public void printFirst()
	{
		System.out.println("Your first name is " + f_name);
	}
	
	public void readinLast()
	{	
		System.out.println("Enter your Last Name:");
		System.out.print(">>");	
		l_name = cin.nextLine();	
	}
	public void printLast()
	{
		System.out.println("Your last name is " + l_name);
	}
	
	public void readinTitle()
	{	
		System.out.println("Are you a...(1 or 2)");
		System.out.println("1. Student");
		System.out.println("2. Teacher");
		System.out.print(">>");	
		title_decision = cin.nextInt();	
		
		if(title_decision == 1)
		{
			title = "student";
		}
		else
		{
			title = "teacher";
		}
	}
	public void printTitle()
	{
		System.out.println("Your are a " + title);
	}
	
	public void readinSchool()
	{	
		System.out.println("Enter the name of the school you attend:");
		System.out.print(">>");	
		school = cin.nextLine();	
	}
	public void printSchool()
	{
		System.out.println("You go to " + school);
	}
	
	
	
	
	
	public void printReceipt()
	{
		System.out.println("********************Receipt**********************");
		for(int iterator = 0; iterator < items.size(); iterator++)
		{
			System.out.print("   Item[" + (iterator + 1) + "]: "); 
			System.out.printf("%-5s   ", items.get(iterator));
			System.out.print("\t\tquantity: ");
			System.out.printf("%2d", specific_num_al.get(iterator));
			System.out.printf("\t$%-10.2f", (price_al.get(iterator) * specific_num_al.get(iterator)));
			System.out.println();
		}
		System.out.printf("\n\n   Subtotal: \t\t\t\t$%-10.2f", subtotal);
		System.out.printf("\n   Tax: \t\t\t\t\t$%-10.2f", tax);
		System.out.printf("\n   Total: \t\t\t\t\t$%-10.2f", total);
		System.out.println("\n*************************************************");
	}
	
}