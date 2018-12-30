package sketch.orca;

import java.util.*;
import java.lang.*;

public class One {
	private String name;
	private int value;
	private String description;
	
	public One() {
		this.name = "one";
		this.value = 1;
		this.description = "less than ten";		
	}

	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}

	public String getDescription() {
		return description;
	}

	/*@Override
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		}

		ALTA_Trivia trivia = (ALTA_Trivia) o;

		return trivia.getNumberKyoshiWarriors().equals(description);
	}*/

	@Override
	public int hashCode() {
		return Objects.hashCode(value);
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	public static void main(String[] args) {
		One one = new One();
		ALTA_Trivia alta = new ALTA_Trivia();
		
		try {
			System.out.println(one.equals(alta));
			System.out.println(one.hashCode()+"\t"+alta.hashCode());
			System.out.println(one+"\t"+alta);
			System.out.println(one.description+"\t"+alta.getNumberKyoshiWarriors());
		}
		
		catch(Exception e) {
			System.err.println(e);
		}
	}
	
}