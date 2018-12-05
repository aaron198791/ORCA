package sketch.orca;

import java.lang.*;
import java.util.*;

public class TryCatch {
	public static void main(String[] args) {
		int a, b, c = 0;
		a = 6;
		b = 0;
		
		try {
			c = a / b;
		}
		
		catch(Exception e) {
			c = 57;
		}
		
		System.out.println(c);
	}
}