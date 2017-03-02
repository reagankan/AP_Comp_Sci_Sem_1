import java.util.*;
public class GMC implements Location {
	public double x,y;
	public GMC(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	public int getID()
	{
		return (int)(Math.random() * 1000000) + 1;
	}
	public void move(double dx, double dy)
	{
		x += dx;
		y += dy;
	}
	public double[] getLoc()
	{
		double[] array = new double[2];
		array[0] = x;
		array[1] = y;
		return array;
	}
}