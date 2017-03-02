import java.util.*;
public class Toyota implements Location {
	private double[] location = new double[2];
	public Toyota(String coor)
	{
		String[] temp = coor.split(", ");
		location[0] = Double.parseDouble(temp[0]);
		location[1] = Double.parseDouble(temp[1]);
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
		double[] array = new double[2];
		array[0] = location[0];
		array[1] = location[1];
		return array;
	}
}