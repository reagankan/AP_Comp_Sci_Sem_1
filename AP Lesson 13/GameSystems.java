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
	public static void main(String[] args)
	{
		
	}
	
	public String platform;
	public int serialNo;
	Random rand = new Random();
	 
	//default constructor
	public GameSystems()
	{
		platform = "VOID";
		serialNo = -1;
	}
	//constructor
	public GameSystems(String p)
	{
		platform = p;
		serialNo = rand.nextInt(9999999);;
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
}