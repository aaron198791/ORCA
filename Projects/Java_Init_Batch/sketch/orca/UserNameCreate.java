package sketch.orca;
import javax.swing.ImageIcon;
import java.lang.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import java.awt.Font;
import java.net.URL;
import javax.imageio.ImageIO;
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.*;
import java.net.URL;
import java.net.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
public class UserNameCreate
{
	public static void main(String[] args)
	{
		
	
	UserNameCreate create =new UserNameCreate();
	create.netIsAvailable();
	}
	public UserNameCreate(){}
	
	private boolean netIsAvailable() 
	{
    try {
        final URL url = new URL("http://www.google.com");
        final URLConnection conn = url.openConnection();
        conn.connect();
        conn.getInputStream().close();
		return true;
    } catch (MalformedURLException e) {
        System.out.print("Please make mure you are connected to the internet.");;
		return false;
    } catch (IOException e) {
       System.out.print("No internet detected!");
	   return false;
    }
	}
	
	public void EmailCheck(String Email) throws IOException, InterruptedException {
	
		if(netIsAvailable()==true)
		{
			
			Path directory = Paths.get("c:\\temp\\example");
		Files.createDirectories(directory);
		gitInit(directory);
		Files.write(directory.resolve("example.txt"), new byte[0]);
		gitStage(directory);
		gitCommit(directory, "Add example.txt");
	
		}
	}	
	
	/*public void createName()
	{
		String UserName =new String();
		String Email =new String();
		
		JFrame User =new JFrame("Create an Account");
		User.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		JTextArea textArea = new JTextArea("Enter in User Name You Want");
		User.setVisible(true);
		
		 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    User.setSize(screenSize.width, screenSize.height);
		
	}*/
}