import java.util.*;
public class GMC extends Car{
	private double[] loc = new double[2];
	private double ID;
	public GMC()
	{
		loc[0] = 0;
		loc[1] = 0;
		ID = (int)(Math.random() * 1000000) + 1;
	}
	public GMC(double x, double y)
	{
		loc[0] = x;
		loc[1] = y;
		ID = (int)(Math.random() * 1000000) + 1;
	}
	public void move(double dx, double dy)
	{
		loc[0] += dx;
		loc[1] += dy;
	}
	public double getID()
	{
		return ID;
	}
	public double[] getLoc()
	{
		return loc;
	}
}