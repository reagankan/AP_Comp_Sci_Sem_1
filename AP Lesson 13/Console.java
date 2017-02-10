public abstract class Console extends GameSystems
	{
		/*Abstract Methods*/
		public abstract String getController();
		
		public String toString()
		{
			return "Platform: " + super.getPlatform() + "\n" +
				   "Serial #: " + super.getSerial() + "\n" + 
				   "Controller: " + getController() + "\n";
		}
	}