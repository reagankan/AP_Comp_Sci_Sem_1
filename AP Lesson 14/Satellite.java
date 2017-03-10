import java.util.*;
import java.lang.*;
import java.util.concurrent.ThreadLocalRandom;
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


       System.out.println(printout);
	   /**********************************************************************/
	   double one, two;
	   System.out.println("\n\nLab 14.1 \n==========================");
	   for(int i = 0; i < locate.size(); i++)
	   {
		   Location temp = locate.get(i);
		   Car elem = (Car)(temp);
		   
		   one = randomDouble(); one *= 100; one = Math.round(one); one /= 100;
		   two = randomDouble(); two *= 100; two = Math.round(two); two /= 100;
		   
		   elem.move(one,two);
		   
		   System.out.println("After " + elem.getID() + " Moved (" + one + ", " + two + ")");
		   System.out.println("New Location: (" + getLocation(elem.getLoc()) + ")");
		   if(i != locate.size()-1)
		   {
			   System.out.println();
		   }
	   }
	   System.out.println("==========================\nDistance from home...");
	   for(Location elem : locate)
	   {
			double temp = getDistance(elem.getLoc(), home);
			temp *= 100; temp = Math.round(temp); temp /= 100;
			System.out.println("Distance for " + elem.getID() + ": (" + temp + ")");
	   }
	   System.out.println("==========================");
   }
	public static double randomDouble()
	{
		double min = 0, max = 100;
		return ThreadLocalRandom.current().nextDouble(min, max);
	}

   public static double getDistance(double[] car, double[] home)
   {
       return Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
   }
   public static String getLocation(double[] loc)
   {
       return loc[0] + ", " + loc[1];
   }
}