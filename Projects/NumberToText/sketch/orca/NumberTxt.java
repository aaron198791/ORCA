package sketch.orca;

import java.util.*;
import java.lang.*;
import java.lang.reflect.Array;

public class NumberTxt {

	private static String sign;

	public NumberTxt(final String inputNum) {
		if(inputNum.charAt(0) == '-') {
			this.sign = "NEGATIVE";
		}

		else {
			this.sign = "POSITIVE";
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

	private static String getPlaceName() {
		int size = (int) number.length() / 3;
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

	private static String processTokens(final String token) {
		String str = "";

		for(int i = 0; i < 3; i++) {
			switch(Integer.valueOf(token.charAt(i))) {
				case 0:
					str.concat("");
					break;

				case 1:
					if(i == 1 || i == 2) {
						str.concat("one ");
						break;
					}

					if(i == 1) {
						switch(Integer.valueOf(token.charAt(2))) {
							case 0:
								return str.concat("ten ");

							case 1:
								return str.concat("eleven ");

							case 2:
								return str.concat("twelve ");

							case 3:
								return str.concat("thirteen ");

							case 4:
								return str.concat("fourteen ");

							case 5:
								return str.concat("fifteen ");

							case 6:
								return str.concat("sixteen ");

							case 7:
								return str.concat("seventeen ");

							case 8:
								return str.concat("eighteen ");

							case 9:
								return str.concat("nineteen ");

							default:
								return str.concat("");
						}
					}

					break;

				case 2:
					if(i == 1) {
						str.concat("twenty-");
					}

					else {
						str.concat("two ");
					}

					break;

				case 3:
					if(i == 1) {
						str.concat("thirty-");
					}

					else {
						str.concat("three ");
					}

					break;

				case 4:
					if(i == 1) {
						str.concat("forty-");
					}

					else {
						str.concat("four ");
					}

					break;

				case 5:
					if(i == 1) {
						str.concat("fifty-");
					}

					else {
						str.concat("five ");
					}

					break;

				case 6:
					if(i == 1) {
						str.concat("sixty-");
					}

					else {
						str.concat("six ");
					}

					break;

				case 7:
					if(i == 1) {
						str.concat("seventy-");
					}

					else {
						str.concat("seven ");
					}

					break;

				case 8:
					if(i == 1) {
						str.concat("eighty-");
					}

					else {
						str.concat("eight ");
					}

					break;

				case 9:
					if(i == 1) {
						str.concat("ninety-");
					}

					else {
						str.concat("nine ");
					}

					break;

				default:
					str.concat("");
					break;
			}

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

	public static String getSign() {
		return sign;
	}

	public static void main(String[] args){
		System.out.println("Successfully compiled NumberEnum");
	}
}