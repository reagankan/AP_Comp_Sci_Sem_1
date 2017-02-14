public class PC extends GameSystems
	{
		public PC()
		{
			super();
		}
		public PC(String plat)
		{
			super(plat);
		}
		public String systemInput()
		{
			return "Keyboard and Mouse";
		}
		public String toString()
		{
			return "Platform: " + super.getPlatform() + "\n" +
				   "Serial #: " + super.getSerial() + "\n" + 
				   "System Input: " + systemInput() + "\n";
		}
	}