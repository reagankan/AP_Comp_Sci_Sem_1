import java.util.*;
public class Toyota extends Car{
	private double[] location = new double[2];
	private double ID;
	public Toyota()
	{
		location[0] = 0.0;
		location[1] = 0.0;
		ID = (int)(Math.random() * 1000000) + 1;
	}
	public Toyota(String coor)
	{
		String[] temp = coor.split(", ");
		location[0] = Double.parseDouble(temp[0]);
		location[1] = Double.parseDouble(temp[1]);
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