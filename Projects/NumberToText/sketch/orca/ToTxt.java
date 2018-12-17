package sketch.orca;

import java.util.*;
import java.lang.*;

public class ToTxt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] inDig = sc.next().toCharArray();

		String str = "";

		for(int i = 0; i < 3; i++) {
			switch(Integer.valueOf(inDig[0])) {
				case 0:
					str.concat("");
					break;

				case 1:
					if(i == 0 || i == 2) {
						str.concat("one ");
						break;
					}

					if(i == 1) {
						switch(Integer.valueOf(inDig[2])) {
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

			if(i == 0) {
				str.concat("hundred ");
			}
		}
	}
}