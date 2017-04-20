import java.util.*;
import java.lang.*;
import java.util.concurrent.ThreadLocalRandom;
import java.text.DecimalFormat; 
import java.util.concurrent.TimeUnit;
public class Satellite
{
   public static void main(String[]args)
   {
       System.out.println("Lab 14");
	   ArrayList<Location> locate = new ArrayList<>();
       double[] honLoc = {5, 6};
       locate.add(new Honda(honLoc));
       locate.add(new Toyota("8, 9"));
       locate.add(new GMC(3, 8));

       double[] home = {0, 0};
	   
	   
       String printout = 
               "==========================" + "\nStarting locations...";


       for (Location l : locate)
       {
           printout += "\nLocation for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")";
       }


       printout += "\n\n" + "==========================" +
                   "\nDistance from home...";


       for (Location l : locate)
       {
           double temp = getDistance(l.getLoc(), home);
		   temp *= 100; temp = Math.round(temp); temp /= 100;
		   printout += "\nDistance for " + l.getID() + ": (" + temp + ")";
       }


       System.out.println(printout); pauseFor(3); endl();
	   /**********************************************************************/
	   System.out.println("\n\nLab 14.1");
	   System.out.println(printout);pauseFor(3); endl();System.out.println("===========================");
	   double one, two;
	   for(int i = 0; i < locate.size(); i++)
	   {
		   Location temp = locate.get(i);
		   Car elem = (Car)(temp);
		   
		   one = roundedRandomDouble(); 
		   two = roundedRandomDouble();
		   
		   elem.move(one,two);
		   		   
		   System.out.print("After " + elem.getID() + " Moved (");
		   System.out.printf("%.2f, ", one);
		   System.out.printf("%.2f)", two);   
		   System.out.println("\nNew Location: (" + getLocation(elem.getLoc()) + ")");
		   
		   if(i != locate.size()-1)
		   {
			   System.out.println();
		   }
	   }
	   System.out.println("==========================\nDistance from home...");
	   for(Location elem : locate)
	   {
			double temp = roundTwoDecimals(getDistance(elem.getLoc(), home));
			System.out.println("Distance for " + elem.getID() + ": (" + temp + ")");
	   }
	   System.out.println("==========================");
   }
	public static double roundedRandomDouble()
	{
		double min = 0, max = 100;
		return roundTwoDecimals(ThreadLocalRandom.current().nextDouble(min, max));
	}

	public static double roundTwoDecimals(double d) {
		DecimalFormat twoDForm = new DecimalFormat("#.##");
		return Double.valueOf(twoDForm.format(d));
	}
   public static double getDistance(double[] car, double[] home)
   {
       return Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
   }
   public static String getLocation(double[] location)
   {
       return roundTwoDecimals(location[0]) + ", " + roundTwoDecimals(location[1]);
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