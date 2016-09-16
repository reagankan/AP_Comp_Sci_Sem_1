import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import static java.lang.Math.pow;

public class Lab_04_01
{
	//Instantiate Scanner class object
	Scanner cin = new Scanner(System.in);
	double num_items = 0, price = 0, subtotal = 0, tax = 0, total = 0;
	String item, newline;
	ArrayList<String> items = new ArrayList<String>();
	
	public static void main(String[]args)
	{
		//Instantiate Class object
		Lab_04_01 class_object = new Lab_04_01();
		
		
		System.out.println("Lab 4 Part 1: Receipt\n\n");
		
		String name;
		
		
		class_object.readinNumItems();
		System.out.println();
		class_object.showNumItems();
		System.out.println();
		class_object.makeArrayList();
		System.out.println();
		class_object.printArrayList();	
		System.out.println();		
	}	
	
	public void readinNumItems()
	{
		System.out.println("How many items are you buying?");
		System.out.print(">>");
		num_items = cin.nextDouble();
	}
	public void showNumItems()
	{
		System.out.printf("You are buying... %10.0f items.\n", num_items);
	}
	

	public void makeArrayList()
	{
		for(int i = 0; i < num_items; i++)
		{
			if(i == 0)
			{
				System.out.println("Enter item[" + (i+1) + "]");
				System.out.print(">>");
				newline = cin.nextLine();
				item = cin.nextLine();
				items.add(item);
			}
			else
			{
				System.out.println("Enter item[" + (i+1) + "]");
				System.out.print(">>");
				item = cin.nextLine();
				items.add(item);
			}
		}
	}

	public void printArrayList()
	{
		System.out.print("You are buying...\n");
		for(int i = 0; i < items.size(); i++)
		{
			System.out.print("Item " + (i+1) + ": " + items.get(i));
			System.out.println();
		}			
	}
	
	
	
}