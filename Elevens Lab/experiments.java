import java.util.*;
public class experiments {
	public static void main(String[] args)
	{
		logic();
	}
	public static void numConversion()
	{
		System.out.println(3.0 / 4);
		System.out.println(3 / 4.0);
		System.out.println((int) 3.0 / 4);
		System.out.println((double) 3 / 4);
		System.out.println((double) (33 / 4));
	}
	public static void logic()
	{
		boolean[][] arr = new boolean[][]{{true, false},{true, true},{false,false}};
		boolean x, y;
		for(int i = 0; i < arr.length; i++)
		{
			x = arr[i][0]; 
			y = arr[i][1];
			if((x && y) || !(x && y))
			{
				System.out.println("True");
			}
		}
	}
}
