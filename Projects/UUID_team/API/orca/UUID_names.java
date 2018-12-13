package API.orca;

import java.util.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;
public class UUID_names {
	public static void main(String[] args) {
		System.out.println("Successfully compiled UUID_names API");
		UUID_names name = new UUID_names();
		name.create_ID();
	}
	
	/*
	please ensure to record and keep your UUID safe
	please only instantiate once!
	I will keep track of who instantiates 
	*/
	public UUID_names() {
	}
	
	public void create_ID() {
		UUID uuid = UUID.randomUUID();
		//return uuid;

try{
		String usernameComputer3=System.getProperty("user.dir");
		String usernameComputer4=System.getProperty("user");
PrintWriter writer = new PrintWriter(usernameComputer3+"/Do_Not_open.txt", "UTF-8");
			writer.println(uuid.toString());
			writer.println(usernameComputer4);
			writer.close();		
}
		catch (FileNotFoundException | UnsupportedEncodingException e){//Note the second
			System.out.println("couldn't find path");
		}
	}//Supposedly missing return statement; interesting because there IS one earlier, and it's causing its own problems
	
	
}
