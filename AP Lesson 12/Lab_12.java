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
		
		/*List<Integer> dec;// = new ArrayList<Integer>();
		dec.add(777);
		System.out.println(dec);
		
		
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
			*/
		Ex_1 one = new Ex_1();
		one.main();
		pauseFor(3);
		endl();
		

		Ex_2 two = new Ex_2();
		two.main();	
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

		public static void main()
		{
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

		public static void main()
		{
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
	public static void create_exercise_name()
	{
		exercise_name.add("Miles Per Hour");
		exercise_name.add("Distance Between 2 Points");
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