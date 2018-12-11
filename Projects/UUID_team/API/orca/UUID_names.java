package API.orca;

import java.util.*;

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
	}
	
	public static void main(String[] args) {
		System.out.println("Successfully compiled UUID_names API");
	}
	
}