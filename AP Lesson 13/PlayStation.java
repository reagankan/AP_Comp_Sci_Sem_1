public class PlayStation extends Console
	{
		public PlayStation()
		{
			super();
		}
		public PlayStation(String plat)
		{
			super(plat);
		}
		/*Abstract Methods*/
		public String getController()
		{
			return "PS DualShock 3";
		}
		public String getPlatform()
		{
			return "PlayStation";
		}
		public String toString()
		{
			return "Platform: " + this.getPlatform() + "\n" +
				   "Serial #: " + super.getSerial() + "\n" + 
				   "Controller: " + getController() + "\n";
		}
	}