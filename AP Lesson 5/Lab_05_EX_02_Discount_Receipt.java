import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import static java.lang.Math.pow;

public class Lab_05_EX_02_Discount_Receipt
{
	//Instantiate Scanner class object
	static Scanner cin = new Scanner(System.in);
	static double price = 0, running_total = 0, subtotal = 0, tax = 0.08, total = 0, tax_value = 0;
	static String num_items, specific_num, item, newline, divider = "*********************************************", str_price;
	static String tax_str = "0.08%";
	static ArrayList<String> items = new ArrayList<String>();
	static ArrayList<Integer> specific_num_al = new ArrayList<Integer>();
	static ArrayList<Double> price_al = new ArrayList<Double>();
	
	public static void main(String[]args)
	{
		System.out.println("Lab 5 Exercise 2: Discount Receipt\n\n");
		
		String name;
		Boolean cond_1 = true, cond_2 = true, redo_1 = false, redo_2 = false;
		
		//keeps running until the num_items is correct
		while(cond_1)
		{
			//number of items
			readinNumItems();
			endl();
		
			//Print num_items
			printNumItems();
			endl();
			
			//Check the num_items
			redo_1 = numItems_Incorrect();
			if(redo_1)
			{
				//let while loop reiterate
			}
			else
			{
				cond_1 = false;
			}
		}
		endl();
		
		//keeps running until the Array List is correct
		while(cond_2)
		{
			//cin items
			readinArrayList();
			endl();
			
			//cout items
			printArrayList();	
			endl();
			
			//Check the list of items
			redo_2 = ArrayList_Incorrect();
			if(redo_2)
			{
				//let while loop reiterate
			}
			else
			{
				cond_2 = false;
			}
		}
		endl();
		
		discount();
		createDividers();
		printReceipt();
	}	
	
	public static void endl()
	{
		System.out.println();
	}
	
	public static void createDividers()
	{
		int max_len_item = 0,
			max_len_price = 0,
			temp = 0;
		
		for(int i = 0; i < items.size(); i++)
		{
			//change price to string --> lets us find length
			str_price = Double.toString(price_al.get(i));
			
			temp = items.get(i).length();
			if(temp > max_len_item)
			{
				max_len_item = temp;
			}
			
			temp = str_price.length();
			if(temp > max_len_price)
			{
				max_len_price = temp;
			}
		}
		for(int ii = 0; ii < max_len_price + max_len_item-7; ii++)
		{
			//divider = divider.concat("*");
			divider += '*';
		}
	}
	
	public static void readinNumItems()
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
	public static void printNumItems()
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
	
	public static Boolean numItems_Incorrect()
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
	

	public static void readinArrayList()
	{
		int int_num_items = Integer.parseInt(num_items);
		int int_specific_num = 0;
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
					int_specific_num = Integer.parseInt(specific_num); 
					if(int_specific_num > 99)
					{
						System.out.println("Error: incorrect input\nPlease enter an integer number Ex: 1 or 2 or 3...up to 99");
						System.out.println("Try Again!");
					}
					else
					{
						cond_1 = false;
					}
				}
				
				//int int_specific_num = Integer.parseInt(specific_num);
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
					int_specific_num = Integer.parseInt(specific_num); 
					if(int_specific_num > 99)
					{
						System.out.println("Error: incorrect input\nPlease enter an integer number Ex: 1 or 2 or 3...up to 99");
						System.out.println("Try Again!");
					}
					else
					{
						cond_1 = false;
					}
				}
				
				//int int_specific_num = Integer.parseInt(specific_num);
				specific_num_al.add(int_specific_num); //push back specific_num to array list
				
				
				//price per item
				System.out.println("What is the price of a single " + items.get(i));
				System.out.print(">>");

				price = cin.nextDouble();		
				price_al.add(price); //push back specific_num to array list
			}
		}
	}

	public static void printArrayList()
	{
		System.out.print("You are buying...\n");
		for(int i = 0; i < items.size(); i++)
		{
			System.out.print(specific_num_al.get(i) + "\t" + items.get(i) + " and each costs $" + price_al.get(i));
			System.out.println();
		}			
	}
	
	public static Boolean ArrayList_Incorrect()
	{
		String confirm;
		Boolean cond = true, repeat = false;
		int count = 0;
		
		while(cond)
		{
			if(count == 0)
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
	
	public static void discount()
	{
		for(int iter = 0; iter < items.size(); iter++)
		{
			subtotal += (specific_num_al.get(iter) * price_al.get(iter));
			//System.out.println("subtotal when specific_num is " + specific_num_al.get(iter) + " and price is: " + price_al.get(iter) + "is:..." +subtotal);
		}
		
		total = subtotal * (1 + tax);
		tax_value = subtotal * tax;
	}
	
	public static void printReceipt()
	{
		System.out.println("Receipt");
		System.out.println(divider);
		//System.out.println(divider + divider + divider + divider);
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
		System.out.print("\n   Tax" + "(" + tax_str + "): \t\t\t\t");
		System.out.printf("$%-10.2f", tax_value);
		System.out.printf("\n   Total: \t\t\t\t\t$%-10.2f", total);
		endl();
		System.out.println(divider);
	}
	
}