package sketch.orca;

import java.util.*;
import java.lang.*;
import sketch.orca.*;

public class NumberToText {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();

		NumberTxt nt = new NumberTxt(str);
		
		System.out.println(nt.getSign());
	}
}