//Charmaze Trinidad
//Contains the username and password
public class Information 
{
	private String userName;
	private char[] password;
	
	//Constructor
	public Information()
	{ 
		userName = "admin";
		String str = "password";
		password = str.toCharArray();
	}
	public String getUserName()
	{
		return userName;
	}
	public char[] getPassword()
	{
		return password;
	}
}
