import java.util.*;
public class Honda extends Car{
	public Honda(double[] coor)
	{
		location = coor;
		ID = (int)(Math.random() * 1000000) + 1;
	}
}