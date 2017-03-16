import java.util.*;
public class Car implements Location{
	public int ID;
	public double[] location;
	public Car()
	{
		location = new double[2];
	}
	public void move(double dx, double dy)
	{
		location[0] += dx;
		location[1] += dy;
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