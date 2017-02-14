public class Walkup extends Ticket
{
	public Walkup()
	{
		super();
	}
	
	public double getPrice()
	{
		return 50.00;
	}
	
	public String toString()
	{
		return super.toString();
	}
	
	public String getType()
	{
		return "Walkup Ticket";
	}
}