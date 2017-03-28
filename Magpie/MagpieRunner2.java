import java.io.*;
import java.util.*;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner2
{
	public static String compareTo = ""; 
	public static int val = 0, min = 2010, max = -1;
	//65 91 97 123
	public static void testCompareTo(String comp, int start, int end)
	{
		boolean cond = true;
		if(end > 123){cond = false;}
		
		if(cond){
		if(comp.equals("")){comp = "[empty]";}
		if(comp.equals(" ")){comp = "[space]";}
		System.out.println("comp: " + comp);
		int cnt = 0;
		for(int i = start; i < end; i++)
		{
			if(cnt == 0){}
			else if(cnt%5 == 0){compareTo += "\n";}//System.out.println();}
			else{compareTo += "  \t";}//System.out.print("  \t");}
			char c = (char)i;
			
			String letter = "$";
			char[] arrTemp = letter.toCharArray();
			arrTemp[0] = c;
			letter = String.valueOf(arrTemp);
			int val = comp.compareTo(letter);
			min = Math.min(val, min);
			max = Math.max(val, max);
			if(letter.equals("A") || letter.equals("a") || letter.equals("Z") || letter.equals("z"))
				compareTo += comp + " compareTo "+ letter + " is " + comp.compareTo(letter);
			//System.out.print(comp + " with "+ letter + " is " + comp.compareTo(letter));
			cnt++;
		}//compareTo += "\n";//System.out.println("\n");
		System.out.println(compareTo);
		
		testCompareTo(comp,start+32,end+32);}
	}
	
	
	public static void testCompareTo()
	{
		for(int i = 65; i < 91; i++)
		{			
			for(int j = 0; j < 2; j++)
			{
				char c = (char)(i+j*32);
				
				String letter = "$";
				char[] arrTemp = letter.toCharArray();
				arrTemp[0] = c;
				letter = String.valueOf(arrTemp);
				compareTo += "===============================================================================================\n";
				testCompareTo(letter, 65, 91);
			}
		}
		try{
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("compareTo_values.cpp")));
			pw.println("/*"+compareTo+"*/"); pw.close();
		} catch (IOException e) {
		   System.out.println("FAILED TO CREATE <<compareTo_values.cpp>>");
		}
		System.out.println("CREATED <<compareTo_values.cpp>>");
	}
	void testCompareToRunner()
	{
		testCompareTo(); 
		System.out.printf("max value is %d\n", max);
		System.out.printf("min value is %d\n", min);
		max = 0; min = 2000;
		testCompareTo("",65, 91);
		System.out.printf("max value is %d\n", max);
		System.out.printf("min value is %d\n", min);
		max = 0; min = 2000;
		testCompareTo(" ",65, 91);
		System.out.printf("max value is %d\n", max);
		System.out.printf("min value is %d\n", min);
		System.exit(0);
	}
	/**
	 * Create a Magpie, give it user input, and print its replies.
	 * 6,25,-6,-31
	 */
	public static void main(String[] args)
	{
		Magpie2 maggie = new Magpie2();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}

}
