package sketch.orca;

import java.util.*;
import java.lang.*;

public class NumberTxt {

	private static String sign;
	private static String number;
	private static String decimal;
	
	public NumberTxt(final String inputNum) {
		if(inputNum == null || inputNum.isEmpty()) {
			throw new IllegalArgumentException("NULL / EMPTY INPUT!");
		}

		if(inputNum.charAt(0) == '-') {
			this.sign = "NEGATIVE";

			padNum(inputNum);

			this.number = inputNum.substring(1, indexOf('.'));
			this.decimal = inputNum.substring(indexOf('.'));
		}

		else {
			this.sign = "POSITIVE";
			
			padNum(inputNum);

			this.number = inputNum.substring(0, indexOf('.'));
			this.decimal = inputNum.substring(indexOf('.'));
		}

		isNum();		
	}

	private static void padNum(final String inputNum) {
		if(sign == "NEGATIVE") {
			while(inputNum.substring(1, indexOf('.')).length() % 3 != 0) {
				inputNum = " ".concat(inputNum);
			}

			while(inputNum.substring(indexOf('.')).length() % 3 != 0) {
				inputNum = inputNum.concat(" ");
			}
		}
		
		if(sign == "POSITIVE") {
			while(inputNum.substring(0, indexOf('.')).length() % 3 != 0) {
				inputNum = " ".concat(inputNum);
			}

			while(inputNum.substring(indexOf('.')).length() % 3 != 0) {
				inputNum = inputNum.concat(" ");
			}
		}
	}

	private static void isNum() {
		boolean hasDecimal = false;
				
		for(int i = 0; i < number.length(); i++) {
			if(! Character.isDigit(number.charAt(i))) {
				if(number.charAt(i) == '.' && hasDecimal == false) {
					hasDecimal = true;
					continue;
				}

				throw new IllegalArgumentException("NON-NUMBER INPUT!");
			}
		}
	}

	private static String[] tokenizer() {
		String[] tokens = new String[(int) number.length() / 3];
		int j = 0;

		for(int i = 0; i < number.length(); i += 3) {
			tokens[j] = number.substring(i, i + 3);
			j++;
		}

		return tokens;
	}

	private static String getPlaceName() {
		int size = (int) number.length() / 3;

		switch (size) {
			case 0: 
				return "";
				break;

			case 1:
				return "thousand";
				break;

			case 2:
				return "million";
				break;

			case 3:
				return "billion";
				break;

			case 4:
				return "trillion";
				break;

			default:
				return "OUT_OF_RANGE";
				break;
		}
	}

	private static String processTokens(final String token) {
		for(int i = 0; i < 3; i++) {
			switch(Integer.valueOf(token.charAt(i))) {
				case 0
			}
		}
	}
	private static String makeTxt(final String txtToken) {
		//fill later
	}

	@Override
	public static String toString() {
		return sign+" "+make
	}

	public static void main(String[] args){
		System.out.println("Successfully compiled NumberEnum");
	}
}