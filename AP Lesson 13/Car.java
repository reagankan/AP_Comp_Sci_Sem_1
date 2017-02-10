public class Car extends Toy
		{
			//default constructor
			public Car()
			{
				super();
			}
			//constructor
			public Car(String toyName)
			{
				super(toyName);
			}
			/*Accessors*/
			public String getName()
			{
				return super.getName();
			}
			public int getCount()
			{
				return super.getCount();
			}
			
			/*Modifiers*/
			public void setName(String newName)
			{
				super.setName(newName);
			}
			public void setCount(int newCount)
			{
				super.setCount(newCount);
			}
			/*Overridden Abstract Methods*/
			public String getType()
			{
				return "Car";
			}
		}