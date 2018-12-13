package API.orca;

import java.util.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;
public class UUID_names {
	
	/*
	please ensure to record and keep your UUID safe
	please only instantiate once!
	I will keep track of who instantiates 
	*/
	public UUID_names() {
	}
	
	public UUID create_ID() {
		UUID uuid = UUID.randomUUID();
		return uuid;
<<<<<<< HEAD
<<<<<<< HEAD
try(
		String usernameComputer3=System.getProperty("user.dir");
		String usernameComputer4=System.getProperty("user");
PrintWriter writer = new PrintWriter(usernameComputer3+"/Do_Not_open.txt", "UTF-8");
			String cool = uuid.toString();
			writer.println(cool);
			writer.println(usernameComputer4);
=======
=======
>>>>>>> a5c74857456fd6386e10e6a18cb5960317a0343f
		try{//Unreachable statement
			String usernameComputer3 = System.getProperty("user.dir");
			PrintWriter writer = new PrintWriter(usernameComputer3 + "/Do_Not_open.txt", "UTF-8");
			writer.println(uuid.toString());
>>>>>>> a5c74857456fd6386e10e6a18cb5960317a0343f
			writer.close();		
		}
		catch (FileNotFoundException | UnsupportedEncodingException e){//Note the second
			System.out.println("couldn't find path");
		}
	}//Supposedly missing return statement; interesting because there IS one earlier, and it's causing its own problems
	public static void main(String[] args) {
		System.out.println("Successfully compiled UUID_names API");
	}
	
}