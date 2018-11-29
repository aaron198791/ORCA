package API.orca;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.lang.Math;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
public class userName_Email_Check
{
	public userName_Email_Check(){}
	public void check(String path)
	{
	 	try{
		final Scanner scanner = new Scanner(new BufferedReader(new FileReader(path)));
		String text1 = scanner.useDelimiter("\\s*$").next();
			String[] userName_password = text1.split("\\s");
			String one =userName_password[0];
			String userName1=userName_password[1];
			String Email1 =userName_password[2];
			
			System.out.println(one);
			System.out.println(password);
			System.out.println(Email1);
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Cannot find file!");
		}
		
	}
}