import javax.swing.JFrame;

public class ServerTest
{
	public static void main(String[] args){
		Server reagan = new Server();
		reagan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		reagan.startRunning();
	}
}
