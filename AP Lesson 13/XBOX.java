public class XBOX extends Console
	{
		public XBOX()
		{
			super();
		}
		public XBOX(String plat)
		{
			super(plat);
		}
		/*Abstract Methods*/
		public String getController()
		{
			return "XBox Wireless Controller";
		}
		public String getPlatform()
		{
			return "XBox";
		}
		public String toString()
		{
			return "Platform: " + this.getPlatform() + "\n" +
				   "Serial #: " + super.getSerial() + "\n" + 
				   "Controller: " + getController() + "\n";
		}
	}