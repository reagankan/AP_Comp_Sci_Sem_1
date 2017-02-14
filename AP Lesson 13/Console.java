public abstract class Console extends GameSystems
	{
		public Console()
		{
			super();
		}
		public Console(String plat)
		{
			super(plat);
		}
		
		/*Abstract Methods*/
		public abstract String getController();
		
		public String toString()
		{
			return "Platform: " + super.getPlatform() + "\n" +
				   "Serial #: " + super.getSerial() + "\n" + 
				   "Controller: " + getController() + "\n";
		}
	}