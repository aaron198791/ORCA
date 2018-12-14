package API.orca;
import java.util.*;
import java.lang.*;
import java.io.*;
public class userName_Email_Check
{
	public userName_Email_Check(){}
	public void check()
	{
	 	try{
		final Scanner scanner = new Scanner(new BufferedReader(new FileReader(new File("UserInformation.txt"))));
		String text1 = scanner.useDelimiter("\\s*$").next();
			String[] userName_password = text1.split("\n");
			String userName1 =userName_password[0];
			String Email=userName_password[1];
			System.out.println(userName1);
			System.out.println(Email);
			final Scanner scanner1 = new Scanner(new BufferedReader(new FileReader(new File("List_of_Emails_UserNames.txt"))));
			String text2 = scanner.useDelimiter("\\s*$").next();
			String[] userName_Email_Collection = text2.split("\n");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Cannot find file!");
		}
		
	}
}