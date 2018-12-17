package sketch.orca;

import java.util.*;
import java.lang.*;
import java.lang.reflect.Array;

public class NumberTxt {
	private String userIn;
	private String sign;
	private String number;
	private String decimal;

	public NumberTxt(final String input) {
		this.userIn = input;
	}

	private String toTxt(final String input) {
		tokenize(getSign(input));

		System.out.println(sign);
		System.out.println(number);
		System.out.println(decimal);

		return sign+numTxt()+decTxt();
	}

	private String getSign(final String input) {
		if(input.charAt(0) == '-') {
			sign = "NEGATIVE ";
			return input.substring(1);
		}

		else {
			sign = "";
			return input;
		}
	}

	private void tokenize(final String input) {
		StringTokenizer st = new StringTokenizer(input.replaceAll("\\s", ""), "."); 

		if(st.countTokens() == 1) {
			number = pad(st.nextToken());
			decimal = "";
		}

		else if(st.countTokens() == 2) {
			number = pad(st.nextToken());
			decimal = pad(st.nextToken());
		}

		else {
			throw new IllegalArgumentException("TOO MANY TOKENS!");
		}
	}

	private String pad(String input) {
		String str = input;
		
		while(input.length() % 3 != 0) {
			str = "0".concat(input);
			input = str;
		}

		return str;
	}

	private String numTxt() {
		String num = number;
		char[] numToken;

		for(int i = 0; i < num; i += 3) {
			char[] numToken = num.substring(i, i + 3).toCharArray();
			num = number.substring(i + 3);
			int j = i + 3;

			while(i < j) {
				convert(char[i])
			}
		}
	}

	private String decTxt(final String input) {
		//fill
	}*/

	private static String getPlaceName() {
		int size = (number.length() - 1) / 3;
		String placeName;
		
		switch (size) {
			case 0: 
				placeName = "";
				break;

			case 1:
				placeName = "thousand ";
				break;

			case 2:
				placeName = "million ";
				break;

			case 3:
				placeName = "billion ";
				break;

			case 4:
				placeName = "trillion ";
				break;

			default:
				placeName = "OUT_OF_RANGE ";
				break;
		}

		return placeName;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		
		if((o == null) ||  o.getClass() != getClass()) {
			return false;
		}
		
		final NumberTxt that = (NumberTxt) o;
		
		return toString.equals(that.toString());
	}
	
	@Override
	public int hashCode() {
		return toString().hashCode();
	}

	@Override
	public String toString() {
		return toTxt(userIn);
	}

	public static void main(String[] args) {
		NumberTxt nt = new NumberTxt(-1234567.89);

		System.out.println(nt);
	}
}




		










	/*private static String number;
	private static String decimal;
	
	public NumberTxt(final String inputNum) {
		if(inputNum == null || inputNum.isEmpty()) {
			throw new IllegalArgumentException("NULL / EMPTY INPUT!");
		}

		if(inputNum.charAt(0) == '-') {
			this.sign = "NEGATIVE";

			String unsigned = inputNum.substring(1);
			String str = padNum(unsigned);

			this.number = str.substring(1, str.indexOf('.'));
			this.decimal = str.substring(str.indexOf('.'));
		}

		else {
			this.sign = "POSITIVE";
			
			String str = padNum(inputNum);

			this.number = str.substring(0, str.indexOf('.'));
			this.decimal = str.substring(str.indexOf('.'));
		}

		isNum();		
	}

	private static String padNum(final String inputNum) {
		String str1 = "";
		String str2 = "";

		if(sign == "NEGATIVE") {
			if(inputNum.contains(".")) {
				while(inputNum.substring(1, inputNum.indexOf('.')).length() % 3 != 0) {
					str1 = " ".concat(inputNum);
				}

				while(inputNum.substring(str1.indexOf('.')).length() % 3 != 0) {
					str2 = str1.concat(" ");
				}
			}

			else {
				while(inputNum.substring(1).length() % 3 != 0) {
					str2 = " ".concat(inputNum);
				}
			}
		}
		
		else {
			if(inputNum.contains(".")) {
				while(inputNum.substring(0, inputNum.indexOf('.')).length() % 3 != 0) {
					str1 = " ".concat(inputNum);
				}

				while(inputNum.substring(str1.indexOf('.')).length() % 3 != 0) {
					str2 = str1.concat(" ");
				}
			}

			else {
				while(inputNum.length() % 3 != 0) {
					str2 = " ".concat(inputNum);
				}
			}
		}

		return str2;
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

	

	private static String processTokens(final String token) {
		String str = "";

		for(int i = 0; i < 3; i++) {
			

			if(i == 0 && Integer.valueOf(token.charAt(0)) != 0) {
				str.concat("hundred ");
			}
		}

		return str;
	}

	private static String makeTxt() {
		String txt = "";
		String[] tokens = tokenizer();

		for(int i = 0; i < Array.getLength(tokens); i++) {
			txt.concat(processTokens(tokens[i])).concat(getPlaceName());
			number = number.substring(3);
		}

		return txt;
	}

	@Override
	public String toString() {
		return sign+" "+makeTxt();
	}*/