import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static java.lang.Math.pow;
import static java.lang.Math.abs;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;

public class Lab_13
{
	//Instantiate Scanner class object
	static Scanner cin = new Scanner(System.in);
	//Instantiate Random class object
	static Random random = new Random();
	static Vector<String> exercise_name = new Vector<String>();
	public static void main(String[]args)
	{
		System.out.println("Lab_13");
		create_exercise_name();
		
		Ex_1 one = new Ex_1();
		//test the construction of class heirarchy
		one.ToyRunner();
		//use the class heirarchy
		one.ToyStoreRunner();
	}	
	
	public static class Ex_1
	{
		//ToyRunner for testing 
		//and
		//running the main for the ToyStore Class
		public void ToyRunner()
		{
			printHeading(1);
			msleep(1500);
			AFigure afTestObj = new AFigure("action_test");
			Car carTestObj = new Car("car_test");
			
			System.out.println("Checking Toy class...\n"+afTestObj);
			System.out.println(carTestObj); msleep(1500);
			endl();
		}
		//ToyStoreRunner
		public void ToyStoreRunner()
		{
			String input = "Hotwheel, Car, G.I.Joe, Action Figure, PennyRacer, Car, Matchbox, Car, Star Wars, Action Figure, Pullback, Car, Star Wars, Action Figure";
			ToyStore toyStoreObj = new ToyStore(input);
			
			System.out.print("[ ");
			for(int i = 0; i < toyStoreObj.getSize()-1; i++)
			{
				System.out.print(toyStoreObj.toString(i) + ", ");
			}
			System.out.print(toyStoreObj.toString(toyStoreObj.getSize()-1)+" ]");
			System.out.println("\nMost Frequent Toy:" + toyStoreObj.getMostFrequentToy());
			System.out.println("Most Frequent Type:" + toyStoreObj.getMostFrequentType());
		}
		//ToyStore Class
		public class ToyStore
		{
			ArrayList<Toy> List = new ArrayList<Toy>();
			//default constructor
			public ToyStore()
			{
				loadToys("Hotwheel, Car, G.I.Joe, Action Figure, PennyRacer, Car, Matchbox, Car, Star Wars, Action Figure, Pullback, Car, Star Wars, Action Figure");
			}
			//constructor
			public ToyStore(String listOfToys)
			{
				loadToys(listOfToys);
				System.out.println("List...");
				System.out.println(listOfToys);
			}
			
			public void loadToys(String toyList)
			{
				String[] temp = toyList.split(", ");
				ArrayList<String> toys = new ArrayList<String>(Arrays.asList(temp));
				for(int i = 0; i < toys.size(); i+=2)
				{
					String name = toys.get(i);
					String type = toys.get(i+1);
					Toy newToyObj = getThatToy(name);
					
					if(newToyObj == null)
					{
						if(type.equals("Car"))
						{
							List.add(new Car(name));
						}
						if(type.equals("Action Figure"))
						{
							List.add(new AFigure(name));
						}
					}
					else
					{
						newToyObj.setCount(newToyObj.getCount()+1);
					}
				}
			}
			public Toy getThatToy(String NaMe)
			{
				//System.out.println("List___________");
				for(Toy x : List)
				{
					//System.out.println(x);
					if(x.getName().equals(NaMe))
					{
						return x;
					}
				}
				return null;
			}
			public String getMostFrequentToy()
			{
				String name = "";
				int max = Integer.MIN_VALUE;
				for(Toy x : List)
				{
					if(max < x.getCount())
					{
						max = x.getCount();
						name = x.getName();
					}
				}
				return " " + name;
			}
			public String getMostFrequentType()
			{
				int cars = 0;
				int figures = 0;
				
				for(Toy x : List)
				{
					//System.out.print(x);
					if(x.getType().equals("Car"))
					{
						//System.out.println(" is a Car");
						cars++;
					}
					if(x.getType().equals("Action Figure"))
					{
						//System.out.println(" is an AF");
						figures++;
					}
				}
				
				if(cars > figures)
				{
					return " Cars";
				}
				else if(cars == figures)
				{
					return "Equal amounts of action figures and cars!";
				}
				return " Action Figures";
			}
			public int getSize()
			{
				return List.size();
			}
			public String toString(int i)
			{
				//System.out.println(List.size());
				return List.get(i).toString();
			}
		}		
	}
	public static void create_exercise_name()
	{
		exercise_name.add("The Toy Inventory System");
		exercise_name.add("Game Systems");
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
			//do nothing...just need to catch exception
		}
	}
	public static void pauseFor(int sec)
	{
		System.out.print("Moving on in: ");
		for(int i = sec; i >= 1; i--)
		{
			System.out.print(i);
			msleep(250);
			cout("...");
			
		}
	}
	public static void cout(String str)
	{
		for(int i = 0; i < str.length(); i++)
		{
			System.out.print(str.charAt(i));
			msleep(250);
		}
	}
}