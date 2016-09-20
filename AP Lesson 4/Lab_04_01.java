import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import static java.lang.Math.pow;

public class Lab_04_01
{
	//Instantiate Scanner class object
	Scanner cin = new Scanner(System.in);
	double price = 0, running_total = 0, subtotal = 0, tax = 0.08, total = 0;
	String num_items, specific_num, item, newline;
	ArrayList<String> items = new ArrayList<String>();
	ArrayList<Integer> specific_num_al = new ArrayList<Integer>();
	ArrayList<Double> price_al = new ArrayList<Double>();
	
	public static void main(String[]args)
	{
		//Instantiate Class object
		Lab_04_01 class_object = new Lab_04_01();
		
		
		System.out.println("Lab 4 Part 1: Receipt\n\n");
		
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
	}	
	
	public void endl()
	{
		System.out.println();
	}
	
	public void readinNumItems()
	{
		Boolean cond = true;
		while(cond)
		{
			System.out.println("How many items are you buying?(There is a limit of 99 items)");
			System.out.print(">>");	
			num_items = cin.nextLine();
			
			if(num_items.length() > 2)
			{
				System.out.println("Error: incorrect input\nPlease enter an integer number Ex: 1 or 2 or 3...up to 99");
				System.out.println("Try Again!");
			}
			else
			{
				cond = false;
			}
		}
		
	}
	public void printNumItems()
	{
		if(num_items.equals("1"))
		{
			System.out.println("You are buying " + num_items + " item.");
		}
		else
		{
			System.out.println("You are buying " + num_items + " items.");
		}
	}
	
	public Boolean numItems_Incorrect()
	{
		String confirm;
		Boolean cond = true, repeat = false;
		
		while(cond)
		{
			System.out.println("Is this right?(y or n)");
			System.out.print(">>");
			confirm = cin.nextLine();
			if(confirm.equals("y"))
			{
				cond = false;
			}
			else if(confirm.equals("n"))
			{
				cond = false;
				repeat = true;
			}
			else
			{
				System.out.println("Error: incorrect input");
				System.out.println("Please enter y or n");
				System.out.print("Your input was: " + confirm + "\n");
				System.out.println("Try Again!");
			}
		}
		return repeat;
	}
	

	public void readinArrayList()
	{
		int int_num_items = Integer.parseInt(num_items);
		for(int i = 0; i < int_num_items; i++)
		{
			if(i == 0)
			{
				System.out.println("Enter item[" + (i+1) + "]");
				System.out.print(">>");
				
				item = cin.nextLine();
				items.add(item);
				
				
			
				Boolean cond_1 = true;
				while(cond_1)
				{
					//number per item
					System.out.println("How many " + items.get(i) + " are you purchasing?(The limit is 99)");
					System.out.print(">>");
				
					specific_num = cin.nextLine();
					
					if(num_items.length() > 2)
					{
						System.out.println("Error: incorrect input\nPlease enter an integer number Ex: 1 or 2 or 3...up to 99");
						System.out.println("Try Again!");
					}
					else
					{
						cond_1 = false;
					}
				}
				
				int int_specific_num = Integer.parseInt(specific_num);
				specific_num_al.add(int_specific_num); //push back specific_num to array list
				
				
				
				
				//price per item
				System.out.println("What is the price of a single " + items.get(i));
				System.out.print(">>");

				price = cin.nextDouble();		
				price_al.add(price); //push back specific_num to array list
			}
			
			
			else
			{
				System.out.println("Enter item[" + (i+1) + "]");
				System.out.print(">>");
				newline = cin.nextLine();
				item = cin.nextLine();
				items.add(item);
				
				
			
				Boolean cond_1 = true;
				while(cond_1)
				{
					//number per item
					System.out.println("How many " + items.get(i) + " are you purchasing?(The limit is 99)");
					System.out.print(">>");
				
					specific_num = cin.nextLine();
					
					if(num_items.length() > 2)
					{
						System.out.println("Error: incorrect input\nPlease enter an integer number Ex: 1 or 2 or 3...up to 99");
						System.out.println("Try Again!");
					}
					else
					{
						cond_1 = false;
					}
				}
				
				int int_specific_num = Integer.parseInt(specific_num);
				specific_num_al.add(int_specific_num); //push back specific_num to array list
				
				
				//price per item
				System.out.println("What is the price of a single " + items.get(i));
				System.out.print(">>");

				price = cin.nextDouble();		
				price_al.add(price); //push back specific_num to array list
			}
		}
	}

	public void printArrayList()
	{
		System.out.print("You are buying...\n");
		for(int i = 0; i < items.size(); i++)
		{
			System.out.print(specific_num_al.get(i) + " " + items.get(i) + " and each costs " + price_al.get(i));
			System.out.println();
		}			
	}
	
	public Boolean ArrayList_Incorrect()
	{
		String confirm;
		Boolean cond = true, repeat = false;
		int count = 0;
		
		while(cond)
		{
			if(count == 0)
			{
				System.out.println("Is this right?(y or n)");
				System.out.print(">>");
				confirm = cin.nextLine();
				if(confirm.equals("y"))
				{
					cond = false;
				}
				else if(confirm.equals("n"))
				{
					cond = false;
					repeat = true;
					items.clear();//clears items so the list may be corrected
				}
				else
				{
					System.out.println("Error: incorrect input");
					System.out.println("Please enter y or n");
					System.out.print("Your input was: " + confirm + "\n");
					System.out.println("Try Again!");
				}
			}
			else
			{
				String newline_1;
				System.out.println("Is this right?(y or n)");
				System.out.print(">>");
				newline_1 = cin.nextLine();
				confirm = cin.nextLine();
				if(confirm.equals("y"))
				{
					cond = false;
				}
				else if(confirm.equals("n"))
				{
					cond = false;
					repeat = true;
					items.clear();//clears items so the list may be corrected
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
		return repeat;
	}
	
	public void calculate()
	{
		for(int iter = 0; iter < items.size(); iter++)
		{
			running_total += (specific_num_al.get(iter)) * (price_al.get(iter));
		}
		
		subtotal = running_total * tax;
		
		total = subtotal + running_total;
	}
	
	public void printReceipt()
	{
		System.out.println("******************Receipt*******************");
		for(int iterator = 0; iterator < items.size(); iterator++)
		{
			System.out.print(items.get(iterator) + "")
		}	
	}
	
}