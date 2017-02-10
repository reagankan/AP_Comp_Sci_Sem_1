public class AFigure extends Toy
		{
			//default constructor
			public AFigure()
			{
				super();
			}
			//constructor
			public AFigure(String toyName)
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
				return "Action Figure";
			}
		}