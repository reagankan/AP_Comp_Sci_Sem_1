public abstract class Toy
		{
			//private vars
			private String nameOfToy;
			private int numToysInSystem;
			
			//default constructor
			public Toy()
			{
				nameOfToy = "VOID";
				numToysInSystem = 1;
			}
			//constructor
			public Toy(String toyName)
			{
				nameOfToy = toyName;
				numToysInSystem = 1;
			}
			
			/*Accessors*/
			public String getName()
			{
				return nameOfToy;
			}
			public int getCount()
			{
				return numToysInSystem;
			}
			
			/*Modifiers*/
			public void setName(String newName)
			{
				nameOfToy = newName;
			}
			public void setCount(int newCount)
			{
				numToysInSystem = newCount;
			}
			
			/*Abstract Methods*/
			public abstract String getType();
			
			public String toString()
			{
				return nameOfToy +  " " + numToysInSystem;
				//return "[" + nameOfToy + "][" + numToysInSystem + "]";
			}
		}