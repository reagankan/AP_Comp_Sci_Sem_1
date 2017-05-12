import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//JMS
//up to 59
//https://www.youtube.com/watch?v=r-yuvNv58nM&t=1s
public class Server extends JFrame{
	private JTextField userText;
	private JTextArea chatWindow;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private ServerSocket server;
	private Socket connection;
	
	//constructor
	public Server()
	{
		super("MSG");
		userText = new JTextField();
		userText.setEditable(false);//user cannot type when not connected
		userText.addActionListener(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent event)
				{
					sendMessage(event.getActionCommand());
					userText.setText("");
				}
			}
		);
		add(userText,BorderLayout.SOUTH);
		chatWindow = new JTextArea();
		add(new JScrollPane(chatWindow));
		setSize(300,150);
		setVisible(true);
	}
	
	//set up and run the server
	public void startRunning()
	{
		try{
			//port# 6789   size of waitlist 100
			server = new ServerSocket(6789,100);
			while(true)
			{
				try{
					waitForConnection();//defined below
					setupStreams();
					whileChatting();
				}catch(EOFException eofException)
				{
					showMessage("\n Server ended the connection!");
				}finally
				{
					//aka closeCrap
					closeStuff();
				}
			}
		}catch(IOException ioException)
		{
			ioException.printStackTrace();
		}
	}
	
	//wait for connection, then display connection info
	private void waitForConnection() throws IOException
	{
		showMessage("Waiting for someone to connect...");
		//define instance var
		connection = server.accept();//variable only created when connected???
		showMessage("Now connected to " + connection.getInetAddress().getHostName());
	}
		
	//get stream to send and receive data
	private void setupStreams() throws IOException
	{
		//define instance var
		output = new ObjectOutputStream(connection.getOutputStream());
		output.flush();//push leftover bytes to other user??
		input = new ObjectInputStream(connection.getInputStream());
		showMessage("\nStreams are now setup!\n");
	}
	
	//during the chat conversation
	private void whileChatting() throws IOException
	{
		String message = "You are now connected!";
		sendMessage(message);
		ableToType(true); //define l8r //allow user to type
		do{
			try{
				message = (String) input.readObject();//readin msg
				showMessage("\n"+message);
			}catch(ClassNotFoundException classNotFoundException){
				showMessage("\n dont know that user sent??");
			}
		}while(!message.equals("CLIENT - END"));
	}
	
	//close streams and sockets once done chatting
	private void closeStuff()
	{
		showMessage("\n Closing connections...\n");
		ableToType(false);
		try{
			output.close();
			input.close();
			connection.close();
		}catch(IOException ioException)
		{
			ioException.printStackTrace();
		}
	}
	
	//send a message to client
	private void sendMessage(String message)
	{
		try{
			output.writeObject("SERVER - " + message);
			output.flush();
			showMessage("\n SERVER - " + message);
		}catch(IOException ioException){
			chatWindow.append("\n ERROR: CANNOT SEND\n");
		}
	}
	
	//updates chatWindow
	private void showMessage(final String text)
	{
		SwingUtilities.invokeLater(
			new Runnable(){
				public void run(){
					chatWindow.append(text);
				}
			}
		);
	}
	
	//let the user type
	private void ableToType(final boolean tof)
	{
		SwingUtilities.invokeLater(
			new Runnable(){
				public void run(){
					userText.setEditable(tof);
				}
			}
		);
	}
}
//last updated Monday May 8, 2017 7:14PM