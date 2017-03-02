import java.util.*;
public class Honda implements Location {
	public double[] location;
	public Honda(double[] coor)
	{
		location = coor;
	}
	public int getID()
	{
		return (int)(Math.random() * 1000000) + 1;
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
}