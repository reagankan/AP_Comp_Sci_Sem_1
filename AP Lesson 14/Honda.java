import java.util.*;
public class Honda extends Car{
	private double[] location;
	private double ID;
	public Honda(double[] coor)
	{
		location = coor;
		ID = (int)(Math.random() * 1000000) + 1;
	}
	public void move(double dx, double dy)
	{
		location[0] += dx;
		location[1] += dy;
	}
	public double getID()
	{
		return ID;
	}
	public double[] getLoc()
	{
		return location;
	}
}