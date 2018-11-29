package API.orca;
public class test
{
public static void main(String[] args)
	{	
		String UserName="aaron";
		String Email="test123@gmail.com";
		UserNameCreate create =new UserNameCreate("aaron","test@gmail.com");
		create.netIsAvailable();
		create.saveString(UserName,Email);
	}
}