package API.orca;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
public class UUID_names {
	
	/*
	please ensure to record and keep your UUID safe
	please only instanticate once!
	I will keep track of who instanciates 
	*/
	public UUID_names() {}
	
	public UUID create_ID() {
		UUID uuid =UUID.randomUUID();
		return uuid;
String usernameComputer3=System.getProperty("user.dir");
PrintWriter writer = new PrintWriter(usernameComputer3+"/Do_Not_open.txt", "UTF-8");
			writer.println(UserName);
			writer.println(Email);
			writer.close();		
	}
	
	public static void main(String[] args) {
		System.out.println("Successfully compiled UUID_names API");
	}
	
}