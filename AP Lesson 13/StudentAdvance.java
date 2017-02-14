public class StudentAdvance extends Advance
{
	public StudentAdvance(int daysLeft)
	{
		super(daysLeft);
	}
	
	public double getPrice()
	{
		return super.getPrice()/2;
	}
	public String getType()
	{
		return "Student Ticket";
	}
	public String toString()
	{
		return super.toString() + 
			   "STUDENT ID REQUIRED!" + "\n";
	}
}