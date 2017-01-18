import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static java.lang.Math.pow;
import static java.lang.Math.abs;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;

public class Lab_12
{
	//Instantiate Scanner class object
	static Scanner cin = new Scanner(System.in);
	//Instantiate Random class object
	static Random random = new Random();
	static Vector<String> exercise_name = new Vector<String>();
	public static void main(String[]args)
	{
		System.out.println("Lab_12");
		create_exercise_name();
		
/*
		Ex_1 one = new Ex_1();
		one.main();
		pauseFor(3);
		endl();
		
		Ex_2 two = new Ex_2();
		two.main();
		pauseFor(3);
		endl();
		
		System.out.println("Lab_12.1"); cout("...");
		
		Ex_3 three = new Ex_3();
		three.main();
		pauseFor(3);
		
		Ex_4 four = new Ex_4();
		four.main();
		pauseFor(3);
		*/
		Ex_5 five = new Ex_5();
		five.main();
		pauseFor(3);
		
		Ex_6 six = new Ex_6();
		six.main();
	}	
	public static void listTest()
	{
		List<Integer> dec;// = new ArrayList<Integer>();
		//dec.add(777);
		//System.out.println(dec);
		
		
		List<Integer> init = new ArrayList<>();
		init.add(888);
		System.out.println(init.get(0));
		
		List<Integer> test = new ArrayList<>();
		test.add(1);
		test.add(1);
		test.add(1);
		test.add(1);
		test.add(1);
		System.out.println(test);
	
		Vector<Integer> testtest = new Vector<Integer>();
		testtest.add(123);
		testtest.add(321);
		System.out.println(testtest);
	}
	public static class Ex_1
	{
		private int timeHR, timeMIN, distMI;
		private double mph;
		//default constructor
		public Ex_1()
		{
			timeHR = 0;
			timeMIN = 0;
			distMI = 0;
			mph = 0;
		}
		//constructor
		public Ex_1(int readinHRS, int readinMIN, int readinDist)
		{
			timeHR = readinHRS;
			timeMIN = readinMIN;
			distMI = readinDist;
		}
		
		//modifiers
		public void setTimeHR(int newHR)
		{
			timeHR = newHR;
		}
		public void setTimeMIN(int newMIN)
		{
			timeMIN = newMIN;
		}
		public void setDist(int newDIST)
		{
			distMI = newDIST;
		}
		
		//accessors
		public int getTimeHR()
		{
			return timeHR;
		}
		public int getTimeMIN()
		{
			return timeMIN;
		}
		public int getDist()
		{
			return distMI;
		}
		public double getMPH()
		{
			mph = Math.round(distMI / (timeHR + timeMIN / 60.0));
			return mph;
		}

		public void main()
		{
			printHeading(1);
			int hour = 0, minutes = 0, distance = 0;
			System.out.println("Enter Hours: ");
			System.out.print(">>");
			hour = cin.nextInt();
				
			System.out.println("Enter Minutes: ");
			System.out.print(">>");
			minutes = cin.nextInt();
				
			System.out.println("Enter Distance in miles: ");
			System.out.print(">>");
			distance = cin.nextInt();
			
			Ex_1 MilesPerHour = new Ex_1(hour, minutes, distance);
			System.out.println(
				MilesPerHour.getDist() + " miles in " + 
				MilesPerHour.getTimeHR() + " hours and " + 
				MilesPerHour.getTimeMIN() + " minutes = " + 
				MilesPerHour.getMPH() + " mph."
			);
			
			//second calculation
			System.out.println("Enter New Hours: ");
			System.out.print(">>");
			MilesPerHour.setTimeHR(cin.nextInt());
				
			System.out.println("Enter Minutes: ");
			System.out.print(">>");
			MilesPerHour.setTimeMIN(cin.nextInt());
				
			System.out.println("Enter Distance in miles: ");
			System.out.print(">>");
			MilesPerHour.setDist(cin.nextInt());
			
			System.out.println(
				MilesPerHour.getDist() + " miles in " + 
				MilesPerHour.getTimeHR() + " hours and " + 
				MilesPerHour.getTimeMIN() + " minutes = " + 
				MilesPerHour.getMPH() + " mph."
			);
		}
	}
	public static class Ex_2
	{
		private double X1, X2, Y1, Y2;
		private double distance;
		//default constructor
		public Ex_2()
		{
			X1 = 0;
			Y1 = 0;
			X2 = 0;
			Y2 = 0;
		}
		//constructor
		public Ex_2(double xOne, double yOne, double xTwo, double yTwo)
		{
			X1 = xOne;
			Y1 = yOne;
			X2 = xTwo;
			Y2 = yTwo;
		}
		
		//modifiers
		public void setX1(double newX)
		{
			X1 = newX;
		}
		public void setY1(double newY)
		{
			Y1 = newY;
		}
		public void setX2(double newX)
		{
			X2 = newX;
		}
		public void setY2(double newY)
		{
			Y2 = newY;
		}
		
		//accessors
		public double getX1()
		{
			return X1;
		}
		public double getY1()
		{
			return Y1;
		}
		public double getX2()
		{
			return X2;
		}
		public double getY2()
		{
			return Y2;
		}
		public double getDistance()
		{
			distance = Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1)*(Y2-Y1));
			return distance;
		}

		public void main()
		{
			printHeading(2);
			double x1 = 0, y1 = 0, x2 = 0, y2 = 0;
			System.out.println("Enter x1: ");
			System.out.print(">>");
			x1 = cin.nextDouble();
				
			System.out.println("Enter y1: ");
			System.out.print(">>");
			y1 = cin.nextDouble();
				
			System.out.println("Enter x2: ");
			System.out.print(">>");
			x2 = cin.nextDouble();
			
			System.out.println("Enter y2: ");
			System.out.print(">>");
			y2 = cin.nextDouble();
			
			Ex_2 distObject = new Ex_2(x1, y1, x2, y2);
			System.out.printf(
				"distance = %-10.2f\n", distObject.getDistance()
			);
			
			//second calculation
			System.out.println("Enter x1: ");
			System.out.print(">>");
			distObject.setX1(cin.nextDouble());
				
			System.out.println("Enter y1: ");
			System.out.print(">>");
			distObject.setY1(cin.nextDouble());
				
			System.out.println("Enter x2: ");
			System.out.print(">>");
			distObject.setX2(cin.nextDouble());
			
			System.out.println("Enter y2: ");
			System.out.print(">>");
			distObject.setY2(cin.nextDouble());
			
			System.out.printf(
				"distance = %-10.2f\n", distObject.getDistance()
			);
		}
	}
	public static class Ex_3
	{
		private static String paint, interior, engine, tires;
		
		//default constructor
		public Ex_3()
		{
			paint = "red w/gold fleck";
			interior = "Corinthian leather (Brown)";
			engine = "5 litre v8 507hp";
			tires = "20\" Priellis";
		}
		//constructor
		public Ex_3(String userPaint, String userInterior, String userEngine, String userTires)
		{
			paint = userPaint;
			interior = userInterior;
			engine = userEngine;
			tires = userTires;
		}
		//Modifier
		public static void resetAttributes(String resetPaint, String resetInterior, String resetEngine, String resetTires)
		{
			paint = resetPaint;
			interior = resetInterior;
			engine = resetEngine;
			tires = resetTires;
		}
		//Accessors
		public static String getPaint()
		{
			return paint;
		}
		public static String getInterior()
		{
			return interior;
		}
		public static String getEngine()
		{
			return engine;
		}
		public static String getTires()
		{
			return tires;
		}
		public static void printAttributes(int num)
		{
			System.out.println(
			"\nYour vehicle #" + num + " is ready...\n" +
			"Paint:\t" + getPaint() + "\n" +
			"Interior:\t" + getInterior() + "\n" +
			"Engine:\t" + getEngine() + "\n" +
			"Tires:\t" + getTires() +  "\n"
			);
		}
		//overloaded in case we forget to make a class object
		public static void printAttributes()
		{
			System.out.println(
			"A default vehicle is ready...\n" +
			"Paint:\t" + getPaint() + "\n" +
			"Interior:\t" + getInterior() + "\n" +
			"Engine:\t" + getEngine() + "\n" +
			"Tires:\t" + getTires() +  "\n"
			);
		}
		public void main()
		{
			printHeading(3);
			
			printAttributes();//prints attributes provided by default constructor
			
			String Paint, Interior, Engine, Tires;
			System.out.println("Enter paint: ");
			System.out.print(">>");
			Paint = cin.nextLine();
				
			System.out.println("Enter interior: ");
			System.out.print(">>");
			Interior = cin.nextLine();
				
			System.out.println("Enter engine: ");
			System.out.print(">>");
			Engine = cin.nextLine();
			
			System.out.println("Enter tires: ");
			System.out.print(">>");
			Tires = cin.nextLine();
			
			//although the class methods are static, we still need to 
			//instantiate an object for the class in order to avoid using
			//the default constructor
			Ex_3 carObject = new Ex_3(Paint,Interior,Engine,Tires);
			printAttributes(1);
			
			//second car
			System.out.println("Enter new paint: ");
			System.out.print(">>");
			Paint = cin.nextLine();
				
			System.out.println("Enter new interior: ");
			System.out.print(">>");
			Interior = cin.nextLine();
				
			System.out.println("Enter new engine: ");
			System.out.print(">>");
			Engine = cin.nextLine();
			
			System.out.println("Enter new tires: ");
			System.out.print(">>");
			Tires = cin.nextLine();
			
			resetAttributes(Paint,Interior,Engine,Tires);
			printAttributes(2);
		}	
	}
	/*************************************************/
	public static class Ex_4
	{
		private static String hair, eyes, skin;
		
		//default constructor
		public Ex_4()
		{
			hair = "black";
			eyes = "green";
			skin = "tan";
		}
		//constructor
		public Ex_4(String userHair, String userEyes, String userSkin)
		{
			hair = userHair;
			eyes = userEyes;
			skin = userSkin;
		}
		//Modifier
		public static void resetAttributes(String resetHair, String resetEyes, String resetSkin)
		{
			hair = resetHair;
			eyes = resetEyes;
			skin = resetSkin;
		}
		//Accessors
		public static String getHair()
		{
			return hair;
		}
		public static String getEyes()
		{
			return eyes;
		}
		public static String getSkin()
		{
			return skin;
		}

		public static void printProfile(int num)
		{
			System.out.println(
			"\nProfile #" + num + " is ready...\n" +
			"Hair:\t" + getHair() + "\n" +
			"Eyes:\t" + getEyes() + "\n" +
			"Skin:\t" + getSkin() + "\n" 
			);
		}
		//overloaded in case we forget to make a class object
		public static void printProfile()
		{
			System.out.println(
			"A default profile is ready...\n" +
			"Hair:\t" + getHair() + "\n" +
			"Eyes:\t" + getEyes() + "\n" +
			"Skin:\t" + getSkin() + "\n"
			);
		}
		public void main()
		{
			printHeading(4);
			
			printProfile();//prints attributes provided by default constructor
			
			String Hair, Eyes, Skin;
			System.out.println("Enter hair: ");
			System.out.print(">>");
			Hair = cin.nextLine();
				
			System.out.println("Enter eyes: ");
			System.out.print(">>");
			Eyes = cin.nextLine();
				
			System.out.println("Enter skin: ");
			System.out.print(">>");
			Skin = cin.nextLine();
			
			//although the class methods are static, we still need to 
			//instantiate an object for the class in order to avoid using
			//the default constructor
			Ex_4 carObject = new Ex_4(Hair, Eyes, Skin);
			printProfile(1);
			
			//second profile
			System.out.println("Enter new hair: ");
			System.out.print(">>");
			Hair = cin.nextLine();
				
			System.out.println("Enter new eyes: ");
			System.out.print(">>");
			Eyes = cin.nextLine();
				
			System.out.println("Enter new skin: ");
			System.out.print(">>");
			Skin = cin.nextLine();
			
			resetAttributes(Hair, Eyes, Skin);
			printProfile(2);
		}	
	}
	/*****************************/
	/*****************************/
	public static class Ex_5
	{
		private static String firstName, lastName, avatar;
		private static int userID;
		
		//default constructor
		public Ex_5()
		{
			firstName = "Richard";
			lastName = "Robinette";
			avatar = "Falcon";
			userID = (int)(Math.random() * 1000000) + 1;
		}
		//constructor without Avatar
		public Ex_5(String fName, String lName)
		{
			firstName = fName;
			lastName = lName;
			avatar = "Undefined";
			userID = (int)(Math.random() * 1000000) + 1;
		}
		//full constructor with Avatar
		public Ex_5(String fName, String lName, String uAvatar)
		{
			firstName = fName;
			lastName = lName;
			avatar = uAvatar;
			userID = (int)(Math.random() * 1000000) + 1;
		}
		//this is called when we print the class object
		public String toString()
		{
			return "Customer Info...\nFirst Name: " + firstName +
									"\nLast Name: " + lastName +
									"\nAvatar: " + avatar +
									"\nUser ID#: " + userID + "\n";
		}
		public void main()
		{
			printHeading(5);
			
			System.out.print("Default ");
			Ex_5 default1 = new Ex_5();
			System.out.println(default1);
			
			String first_name, last_name, userAvatar, choice;
			int ID = 0;
			
			System.out.println("Enter First Name: ");
			System.out.print(">>");
			first_name = cin.nextLine();
				
			System.out.println("Enter Last Name: ");
			System.out.print(">>");
			last_name = cin.nextLine();
		
			System.out.println(first_name + " " + last_name + ", do you want an avatar?(y or n)");
			System.out.print(">>");
			choice = cin.nextLine();
			
			if(choice.equals("n") || choice.equals("N") || choice.equals("no") || choice.equals("nO") || choice.equals("No") || choice.equals("NO"))
			{
				Ex_5 noAvatar = new Ex_5(first_name, last_name);
				endl();
				System.out.println(noAvatar);
			}
			else
			{
				System.out.println("Enter Avatar: ");
				System.out.print(">>");
				userAvatar = cin.nextLine();
				
				Ex_5 withAvatar = new Ex_5(first_name, last_name, userAvatar);
				endl();
				System.out.println(withAvatar);
			}
		}	
	}
		public static class Ex_6
	{
		private static String manufacturer, name, category;
		private static long UPC;
		private static double price;
		
		//default constructor
		public Ex_6()
		{
			
		}
		
		//constructor without category and price
		public Ex_6(String uManufacturer, String uName)
		{
			manufacturer = uManufacturer;
			name = uName;
			category = "n\\a";
			UPC = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
			price = -1;
		}
		//full constructor 
		public Ex_6(String uManufacturer, String uName, String uCategory, double uPrice)
		{
			manufacturer = uManufacturer;
			name = uName;
			category = uCategory;
			UPC = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
			price = uPrice;
		}
		//this is called when we print the class object
		public String toString()
		{
			return "Product Info...\nManufacturer: " + manufacturer +
									"\nLast Name: " + name +
									"\nAvatar: " + category +
									"\nUser ID#: " + UPC +
									"\nPrice: $" + price + "\n";
		}
		public void main()
		{
			printHeading(6);
	
			String manu, itemName, categ, choice;
			double Price = 0;
			
			System.out.println("Enter Manufacturer");
			System.out.print(">>");
			manu = cin.nextLine();
				
			System.out.println("Enter Item Name");
			System.out.print(">>");
			itemName = cin.nextLine();
			
			System.out.println("Will you be entering the category and price information?(y or n)");
			System.out.print(">>");
			choice = cin.nextLine();
			
			if(choice.equals("n") || choice.equals("N") || choice.equals("no") || choice.equals("nO") || choice.equals("No") || choice.equals("NO"))
			{
				Ex_6 withOut = new Ex_6(manu, itemName);
				endl();
				System.out.println(withOut);
			}
			else
			{
				System.out.println("Enter Category: ");
				System.out.print(">>");
				categ = cin.nextLine();
				
				System.out.println("Enter Price: ");
				System.out.print(">>");
				Price = cin.nextDouble();
				
				Ex_6 everything = new Ex_6(manu, itemName, categ, Price);
				endl();
				System.out.println(everything);
			}
		}	
	}
	public static void create_exercise_name()
	{
		exercise_name.add("Miles Per Hour");
		exercise_name.add("Distance Between 2 Points");
		exercise_name.add("Car Class");
		exercise_name.add("Human Class");
		exercise_name.add("The User Class");
		exercise_name.add("Inventory Items");
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