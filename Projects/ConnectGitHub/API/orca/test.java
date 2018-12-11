package API.orca;
import java.util.SortedSet;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
public class test
{
public static void main(String[] args)
	{	
		
		 String UserName= JOptionPane.showInputDialog("Please enter a user name you want: ");
        String Email	= JOptionPane.showInputDialog("Please enter an email for your account(emails can only be used once): ");
			userName_Email_Check check1 =new userName_Email_Check();
		UserNameCreate create =new UserNameCreate(UserName,Email);
		create.netIsAvailable();
		create.saveString(UserName,Email);
		check1.check();
	}
}