package API.orca;
import API.orca.*;
import static API.orca.Encryption.*;
import static API.orca.GUI.*;
import java.util.*;
import javax.swing.*;
import java.io.*;
import java.nio.file.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class Interface{
	
	public static boolean pastUser(){//Doesn't work; not active in code (Throws unchecked exceptions)
		String msg = "If you have a username and password, please press \"Yes\" If you want one, press \"No\".";
		Object[] options = {JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_CANCEL_OPTION};
		ImageIcon x = new ImageIcon();
		Icon y = (Icon) x;
		Label emptyLabel = new Label();
		int pastUser = JOptionPane.showOptionDialog(emptyLabel, BorderLayout.CENTER, msg, JOptionPane.QUESTION_MESSAGE, JOptionPane.YES_NO_OPTION, y, options, options[0]);
		return true;
	}
	public static String newUsername(Set<String> usernames){
		String userName = "";
		do{
			userName = JOptionPane.showInputDialog("Please enter a username.\n If it is not unique, you will need to try again.");
			if(usernames.contains(userName)){
				continue;
			}
			else{
				break;
			}
		} while(true);
		usernames.add(userName);
		System.out.println("Your new username is: " + userName);
		File newFile = new File("API\\orca\\users\\" + userName + ".txt");
		try{
			boolean x = newFile.createNewFile();
		}
		catch(IOException e){
			System.out.println(e);
		}
		return userName;
	}
	public static String newPassword(String newUsername, Map<String, String> accounts){
		String password = "";
		boolean number = false;
		boolean upperCase = false;
		boolean lowerCase = false;
		do{
			password = JOptionPane.showInputDialog("Please enter a password.\nDon't forget it, because it can never be changed.\nThe password must contain at least one:\nCapital letter, Lowercase letter, Number.");
			char[] tester = password.toCharArray();
			number = false;
			upperCase = false;
			lowerCase = false;
			for(int i = 0; i < tester.length; i++){
				if(Character.isDigit(tester[i])){
					number = true;
				}
				if(Character.isLowerCase(tester[i])){
					lowerCase = true;
				}
				if(Character.isUpperCase(tester[i])){
					upperCase = true;
				}
			}
		} while((lowerCase == false) || (upperCase == false) || (number == false) || (password.length() < 7));
		accounts.put(newUsername, password);
		System.out.println("Your new password is: " + password);
		try{
			Path path = Paths.get("API/orca/Accounts.txt");
			File output = path.toFile();
			FileWriter writer = new FileWriter(output, true);
			String[] pieces = {newUsername, password, ""};
			pieces = encrypt(pieces);
			writer.write(pieces[0] + ";" + pieces[1] + ";" + pieces[2] + "\n");
			writer.close();
		}
		catch(IOException e){
			System.err.println(e + "Please create an Accounts.txt file along the path API/orca. Otherwise, the program cannot run");
		}
		return password;
	}
	public static String login() throws IOException {
		try{
			Path path = Paths.get("API/orca/Accounts.txt");
			BufferedReader reader = Files.newBufferedReader(path);
			Scanner sc = new Scanner(reader);
			Set<String> usernames = new HashSet<>();
			Map<String, String> accounts = new HashMap<>();
			while(sc.hasNextLine()){//Reading the file to the set and map
				String temp1 = sc.nextLine();
				String[] temp2 = temp1.split(";");
				temp2 = decrypt(temp2);
				usernames.add(temp2[0]);
				accounts.put(temp2[0], temp2[1]);
			}
			sc.close();
			String userName = "";
			while(true){
				userName = JOptionPane.showInputDialog("Enter your username, or \"null\" to create a new account:");
				if(userName.equals("null")){
					newPassword(newUsername(usernames), accounts);
					return login();
				}
				if(accounts.containsKey(userName)){
					break;
				}
			}
			for(int i = 1; i < 4; i++){
				String password = JOptionPane.showInputDialog("Enter your password:");
				if(password.equals(accounts.get(userName))){
					System.out.println("Access granted");
					return new String(userName);
				}
				else{
					System.out.println("Access denied. " + (3 - i) + " attempts remain.");
				}
			}
			return null;
		}
		catch(IOException e){
			System.err.println(e + "Please create an Accounts.txt file along the path API/orca. Otherwise, the program cannot run");
		}
		return null;
	}
	public static void gatedFunctions() throws IOException {//Fill me in. Ideas: ability to edit a file, display the Map
		String username = login();
		if(username == null){
			System.exit(1);
		}
		System.out.println("Welcome to the Restricted Section");//Hoping to implement a GUI here, with buttons for various options
		Interface x = new Interface();
		x.account(username);
	}
	public static void main(String[] args) throws IOException {
		gatedFunctions();
	}
	@Override
	public int hashCode(){
		return Objects.hash(this);
	}
	@Override
	public boolean equals(Object that){
		if(this == that){
			return true;
		}
		if(that == null){
			return false;
		}
		if( this.getClass() != that.getClass()){
			return false;
		}
		String otherString = (String) that;
		return this.equals(otherString);
	}
}