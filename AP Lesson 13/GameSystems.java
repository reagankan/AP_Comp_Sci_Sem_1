import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static java.lang.Math.pow;
import static java.lang.Math.abs;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;
public class GameSystems
{
	public String platform;
	public int serialNo;
	Random rand = new Random();
	 
	//default constructor
	public GameSystems()
	{
		this.platform = "VOID";
		this.serialNo = -1;
	}
	//constructor
	public GameSystems(String p)
	{
		this.platform = p;
		this.serialNo = rand.nextInt(9999999);;
	}
		
	/*Accessors*/
	public String getPlatform()
	{
		return platform;
	}
	public int getSerial()
	{
		return serialNo;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Lab_13.1::Ex_02::Game Systems");
		
		//testing PC class
		cout("Testing PC class\n");endl();msleep(250);
		PC PCTestObj0 = new PC("PC Platform");
		System.out.println(PCTestObj0);
		PC PCTestObj1 = new PC();
		System.out.println(PCTestObj1);
		
		//testing xbox class
		cout("Testing XBOX class\n");endl();msleep(750);
		XBOX xboxTestObj0 = new XBOX("XBOX Platform");
		System.out.println(xboxTestObj0);
		XBOX xboxTestObj1 = new XBOX();
		System.out.println(xboxTestObj1);
		
		//testing playStation class
		cout("Testing PlayStation class\n");endl();msleep(750);
		PlayStation psTestObj0 = new PlayStation("XBOX Platform");
		System.out.println(psTestObj0);
		PlayStation psTestObj1 = new PlayStation();
		System.out.println(psTestObj1);
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