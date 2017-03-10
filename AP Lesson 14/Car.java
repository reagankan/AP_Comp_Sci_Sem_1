import java.util.*;
public class Car implements Location{
	private int ID;
	private double[] location = new double[2];
	public Car()
	{
		ID = 0;
	}
	public void move(double dx, double dy)
	{
		
	}
	public double[] getLoc()
	{
		return location;
	}
	public int getID()
	{
		return ID;
	}
}