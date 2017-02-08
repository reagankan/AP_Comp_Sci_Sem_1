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
		/*pauseFor(3);
		endl();
		
		System.out.println("Lab_13.1"); cout("...");
		Ex_2 two = new Ex_2();
		two.main();
		endl();*/
	}	
	
	public static class Ex_1
	{
		//ToyRunner for testing 
		//and
		//running the main for the ToyStore Class
		public void ToyRunner()
		{
			AFigure afTestObj = new AFigure("action_test");
			Car carTestObj = new Car("car_test");
			
			System.out.println(afTestObj);
			endl();
			System.out.println(carTestObj);
		}
		//ToyStoreRunner
		public void ToyStoreRunner()
		{
			String input = "Hotwheel, Car, G.I.Joe, Action Figure, PennyRacer, Car, Matchbox, Car, Star Wars, Action Figure, Pullback, Car, Star Wars, Action Figure";
			ToyStore toyStoreObj = new ToyStore(input);
			System.out.println(toyStoreObj);
			System.out.println("Most Frequent Toy:" + toyStoreObj.getMostFrequentToy);
			System.out.println("Most Frequent Type:" + toyStoreObj.getMostFrequentType);
		}
		//ToyStore Class
		public class ToyStore
		{
			ArrayList<Toy> toyList = new ArrayList();
			//default constructor
			public ToyStore()
			{
				loadToys("Hotwheel, Car, G.I.Joe, Action Figure, PennyRacer, Car, Matchbox, Car, Star Wars, Action Figure, Pullback, Car, Star Wars, Action Figure");
			}
			//constructor
			public ToyStore(String listOfToys)
			{
				loadToys(listOfToys);
			}
			
			public void loadToys(String toyList)
			{
				ArrayList<String> toys = toyList.split(", ");
				
				for(i = 0; i < toys.length(); i+=2)
				{
					String name = toys.at(i);
					String type = toys.at(i+1);
					Toy newToyObj = getThatToy(name);
					
					if(newToyObj == null)
					{
						
					}
					else
					{
						new
					}
				}
			}
			public Toy getThatToy(String NaMe)
			{
				for(Toy x : toyList)
				{
					if(x.getName().equals(NaMe))
					{
						return x;
					}
				}
				return null;
			}
			public String getMostFrequentToy()
			{
				String name;
				int max = Integer.MIN_VALUE;
				for(Toy x : toyList)
				{
					if(max < x.getCount())
					{
						max = x.getCount();
						name = x.getName();
					}
				}
				return name;
			}
			public String getMostFrequentType()
			{
				int cars = 0;
				int figures = 0;
				
				for(Toy x : toyList)
				{
					if(x.getType().equals("Cars"))
					{
						cars++;
					}
					if(x.getType().equals("Action Figure"))
					{
						figures++;
					}
				}
				
				if(cars > figures)
				{
					return "Cars";
				}
				else if(cars == figures)
				{
					return "Equal amounts of action figures and cars!";
				}
				return "Action Figures";
			}
			public String toString()
			{
				return 
			}
		}
	/****************************Start Hierarchy***************************/
		/*superClass superClass superClass superClass superClass superClass*/
		public abstract class Toy
		{
			//private vars
			private String nameOfToy;
			private int numToysInSystem;
			
			//default constructor
			public Toy()
			{
				nameOfToy = "VOID";
				numToysInSystem = 1;
			}
			//constructor
			public Toy(String toyName)
			{
				nameOfToy = toyName;
				numToysInSystem = 1;
			}
			
			/*Accessors*/
			public String getName()
			{
				return nameOfToy;
			}
			public int getCount()
			{
				return numToysInSystem;
			}
			
			/*Modifiers*/
			public void setName(String newName)
			{
				nameOfToy = newName;
			}
			public void setCount(int newCount)
			{
				numToysInSystem = newCount;
			}
			
			/*Abstract Methods*/
			public abstract String getType();
			
			public String toString()
			{
				return "[" + nameOfToy + "][" + numToysInSystem + "]\n";
			}
		}
		/*superClass superClass superClass superClass superClass superClass*/
		/*subClass subClass subClass subClass subClass subClass subClass subClass*/
		//AFigure
		public class AFigure extends Toy
		{
			//default constructor
			public AFigure()
			{
				super();
			}
			//constructor
			public AFigure(String toyName)
			{
				super(toyName);
			}
			/*Accessors*/
			public String getName()
			{
				return super.getName();
			}
			public int getCount()
			{
				return super.getCount();
			}
			
			/*Modifiers*/
			public void setName(String newName)
			{
				super.setName(newName);
			}
			public void setCount(int newCount)
			{
				super.setCount(newCount);
			}
			/*Overridden Abstract Methods*/
			public String getType()
			{
				return "Action Figure";
			}
		}
		//Car
		public class Car extends Toy
		{
			//default constructor
			public Car()
			{
				super();
			}
			//constructor
			public Car(String toyName)
			{
				super(toyName);
			}
			/*Accessors*/
			public String getName()
			{
				return super.getName();
			}
			public int getCount()
			{
				return super.getCount();
			}
			
			/*Modifiers*/
			public void setName(String newName)
			{
				super.setName(newName);
			}
			public void setCount(int newCount)
			{
				super.setCount(newCount);
			}
			/*Overridden Abstract Methods*/
			public String getType()
			{
				return "Car";
			}
		}
		/*subClass subClass subClass subClass subClass subClass subClass subClass*/
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