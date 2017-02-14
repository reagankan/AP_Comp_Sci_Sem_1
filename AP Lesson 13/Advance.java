public class Advance extends Ticket
{
	private int daysLeft;
	
	public Advance(int daysLeft)
	{
		super();
		this.daysLeft = daysLeft;
	}
	
	public double getPrice()
	{
		if(daysLeft >= 10)
		{
			return 30.00;
		}
		else
		{
			return 40.00;
		}
	}
	
	public String getType()
	{
		return "Advance Ticket";
	}
}