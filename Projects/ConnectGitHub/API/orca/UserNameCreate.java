package API.orca;

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

public class UserNameCreate {
	String UserName;
	String Email;
	
	
	public UserNameCreate(String UserName, String Email)
	{
		this.UserName=UserName;
		this.Email=Email;
	}
	
	public boolean netIsAvailable() {
		try
		{
			final URL url = new URL("http://www.google.com");
			final URLConnection conn = url.openConnection();
			conn.connect();
			conn.getInputStream().close();
			return true;
		} 
		
		catch(MalformedURLException e) {
			System.out.print("Please make mure you are connected to the internet.");;
			return false;
		} 
		
		catch (IOException e) {
		   System.out.print("No internet detected!");
		   return false;
		}
	}
	
	public void saveString(String UserName,String Email)
	{
		try{
		try{
			//String usernameComputer1 = System.getProperty("user.home")+"/Desktop/";
			//String usernameComputer2 = System.getProperty("ORCA");
			String usernameComputer3=System.getProperty("user.dir");
			System.out.print(usernameComputer3);
			//PrintWriter writer = new PrintWriter(usernameComputer1+"Aaron/ORCA/ORCA/Projects/ConnectGitHub/API/orca/UserInformation.txt", "UTF-8");
			PrintWriter writer = new PrintWriter(usernameComputer3+"/UserInformation.txt", "UTF-8");
			writer.println(UserName);
			writer.println(Email);
			writer.close();}
		catch (UnsupportedEncodingException e){
			System.out.print("cannot find path.");
		}
		}
		catch (FileNotFoundException e)
		{
			System.err.print("Cannot find path.");
		}
	}
	
	
}