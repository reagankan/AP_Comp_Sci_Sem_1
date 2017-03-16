import java.util.*;
public class Toyota extends Car{
	public Toyota(String coor)
	{
		String[] temp = coor.split(", ");
		location[0] = Double.parseDouble(temp[0]);
		location[1] = Double.parseDouble(temp[1]);
		ID = (int)(Math.random() * 1000000) + 1;
	}
}