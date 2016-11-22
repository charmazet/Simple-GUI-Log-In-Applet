//Charmaze Trinidad
//Sets up a panel that allows the user to enter in the username and password

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;  //To use listener interfaces
import java.util.Arrays;
public class Panel extends JPanel
{
	private JLabel userName, password;
	private JTextField userNameText;
	private JButton enter;
	private JPanel panel,panelOne;
	private JTextArea displayArea;
	private JPasswordField passwordText; 
	
	public Panel()
	{
		
		userName = new JLabel("Username");
		password = new JLabel("Password");
		
		userNameText = new JTextField(10);
		passwordText = new JPasswordField(10);
		
		enter = new JButton("Log In");
		enter.addActionListener(new ButtonListener());
		
		displayArea = new JTextArea(2,0);
		displayArea.setText("Please enter username and password.");
		displayArea.setEditable(false);
		displayArea.setOpaque(false);
		
		//Arranges labels and textfields
		panelOne = new JPanel(new GridLayout(2,2));
		panelOne.add(userName);
		panelOne.add(userNameText);
		panelOne.add(password);
		panelOne.add(passwordText);
		
		//Arranges previous panel and other components
		panel = new JPanel (new BorderLayout());
		panel.add(displayArea,BorderLayout.NORTH);
		panel.add(panelOne, BorderLayout.CENTER);
		panel.add(enter, BorderLayout.SOUTH);
		
		add(panel);
	}
	
	//Listener for the LogOn button. Displays a text in the displayArea
	//depending on the action taken
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			Information info = new Information();
			String username = userNameText.getText();
			char[] password = passwordText.getPassword();
			char[] pass = info.getPassword();

			if(username.equals(info.getUserName()) && Arrays.equals(password, pass))
			{
				displayArea.setText("CONGRATULATIONS! YOU LOGGED IN!");
			}
			else
			{
				displayArea.setText("Incorrect username or password. Please try again.");
			}
			//Clears the fields
			userNameText.setText("");
			passwordText.setText("");
		}
	}
}
