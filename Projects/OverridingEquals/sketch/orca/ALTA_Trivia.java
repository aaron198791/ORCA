package sketch.orca;

import java.util.*;
import java.lang.*;

public class ALTA_Trivia {
	private String aang;
	private int numberNations;
	private String numberKyoshiWarriors;
	
	public ALTA_Trivia() {
		this.aang = "the last airbender";
		this.numberNations = 4;
		this.numberKyoshiWarriors = "less than ten";		
	}

	public String getAang() {
		return aang;
	}

	public int getNumberNations() {
		return numberNations;
	}

	public String getNumberKyoshiWarriors() {
		return numberKyoshiWarriors;
	}

	@Override
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		}

		One one = (One) o;

		return numberKyoshiWarriors.equals(one.getDescription());
	}

	@Override
	public int hashCode() {
		return aang.hashCode();
	}

	@Override
	public String toString() {
		return String.valueOf(numberNations);
	}

	public static void main(String[] args) {}
	
}