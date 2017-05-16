import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ServerRK extends JFrame{
	private JTextField userText;
	private JTextPane chatWindow;
	private JButton b;
	
	/*private ObjectOutputStream output;
	private ObjectInputStream input;
	private ServerSocket server;
	private Socket connection;*/
	
	//constructor will format window
	public ServerRK()
	{
		//super class is a jFrame
		super("Server Window");
		
		//layout using GridBagLayout
		setLayout(new GridBagLayout());//setup grids
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		
		
		//components in order of appearance top bottom left right
		chatWindow = new JTextPane();
		c.fill = GridBagConstraints.HORIZONTAL;
		//c.weightx = 1;
		c.gridx = 0;
		c.gridy = 0;
		//c.gridwidth = 0;
		//c.gridheight = 2;
		add(chatWindow, c); 
		//c.gridwidth = 0;//reset
		
		//button test
		JButton button = new JButton("Button 1");
		
		c.weightx = 1;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 1;
		add(button, c);

		button = new JButton("Button 2");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 1;
		c.gridx = 1;
		c.gridy = 1;
		add(button, c);

		button = new JButton("Button 3");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 1;
		c.gridx = 2;
		c.gridy = 1;
		add(button, c);
		
		button = new JButton("Long-Named Button 4");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 40;      //make this component tall
		c.weightx = 1;
		c.gridwidth = 3;
		c.gridx = 0;
		c.gridy = 2;
		add(button, c);
		
		
		
		
		/*
		//suggestions bar with emojis = row of buttons(defined later)...
		userText = new JTextField();
		
		
		
		
		
		
		
		
		userText.setEditable(false);//user cannot type when not connected
		userText.addActionListener(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent event)
				{
					//sendMessage(event.getActionCommand());
					userText.setText("");
				}
			}
		);
		
		add(userText);//add textbox to jFrame
		add(b);
		add(new JScrollPane(chatWindow)); //place chatWindow in JScrollPane, then add to jFrame
		*/
		setSize(300,150);//set size
		
		//show window
		pack();
		setVisible(true);
	}
	public static void main(String[] args)
	{
		ServerRK rk = new ServerRK();
		rk.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}