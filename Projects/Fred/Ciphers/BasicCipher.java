package ORCA.Projects.Fred.Ciphers;
import ORCA.Projects.Fred.Ciphers.*;
import java.util.*;
import static ORCA.Projects.Fred.Ciphers.Letter.*;//Import should be unnecessary
//import ORCA.Projects.Fred.Ciphers.Message.*;//Import should be unnecessary

public class BasicCipher{
	/**
	* Builds the Map that will be used to execute the cipher
	* @deprecated
	*/
	public Map<Character, Character> buildBasicCipher(){//Utility
		Map<Character, Character> cipher = new HashMap<>();
		return cipher;
	}
	/**
	* Constructs a simple cipher, calling #easyCipherBuilderOne()
	* Can be one of any number of ciphers employed in complicated enciphering systems
	* @param Map<Character, Character> to hold employ the cipher
	*/
	public static void easyCipherOne(Map<Character, Character> cipher){//Cipher builder
		Letter[] a = alphabet();
		Letter[] b = easyCipherBuilderOne();
		for(int i = 0; i < a.length; i++){
			cipher.put(a[i].letter, b[i].letter);
		}
	}
	/**
	* Constructs a simple cipher, calling #easyCipherBuilderTwo()
	* Can be one of any number of ciphers employed in complicated enciphering systems
	* @param Map<Character, Character> to hold employ the cipher
	*/
	public static void easyCipherTwo(Map<Character, Character> cipher){//Cipher builder
		Letter[] a = alphabet();
		Letter[] b = easyCipherBuilderTwo();
		for(int i = 0; i < a.length; i++){
			cipher.put(a[i].letter, b[i].letter);
		}
	}
	/**
	* Constructs a simple cipher, calling #easyCipherBuilderThree()
	* Can be one of any number of ciphers employed in complicated enciphering systems
	* @param Map<Character, Character> to hold employ the cipher
	*/
	public static void easyCipherThree(Map<Character, Character> cipher){//Cipher builder
		Letter[] a = alphabet();
		Letter[] b = easyCipherBuilderThree();
		for(int i = 0; i < a.length; i++){
			cipher.put(a[i].letter, b[i].letter);
		}
	}
	/**
	* Constructs a simple cipher, calling #easyCipherOne(Map<Character, Character>)
	* Can be one of any number of ciphers employed in complicated enciphering systems
	* @param Map<Character, Character> to hold employ the cipher
	*/
	public static void basicEncipherOne(Message one){
		Map<Character, Character> cipher = new HashMap<>();
		easyCipherOne(cipher);
		for(int i = 0; i < one.letters.length; i++){
			if(Character.isUpperCase(one.letters[i])){
				one.letters[i] = Character.toLowerCase(one.letters[i]);
			}
			if(cipher.containsKey(one.letters[i])){
				one.letters[i] = cipher.get(one.letters[i]);
			}
		}
		one.word = new String(one.letters);
		one.word = one.word.toUpperCase();
		one.pieces = one.word.split(" ");
	}
	/**
	* Constructs a simple cipher, calling #easyCipherTwo(Map<Character, Character>)
	* Can be one of any number of ciphers employed in complicated enciphering systems
	* @param Map<Character, Character> to hold employ the cipher
	*/
	public static void basicEncipherTwo(Message one){
		Map<Character, Character> cipher = new HashMap<>();
		easyCipherTwo(cipher);
		for(int i = 0; i < one.letters.length; i++){
			if(Character.isUpperCase(one.letters[i])){
				one.letters[i] = Character.toLowerCase(one.letters[i]);
			}
			if(cipher.containsKey(one.letters[i])){
				one.letters[i] = cipher.get(one.letters[i]);
			}
		}
		one.word = new String(one.letters);
		one.word = one.word.toUpperCase();
		one.pieces = one.word.split(" ");
	}
	/**
	* Constructs a simple cipher, calling #easyCipherThree(Map<Character, Character>)
	* Can be one of any number of ciphers employed in complicated enciphering systems
	* @param Message, which is the input
	*/
	public static void basicEncipherThree(Message one){
		Map<Character, Character> cipher = new HashMap<>();
		easyCipherThree(cipher);
		for(int i = 0; i < one.letters.length; i++){
			if(Character.isUpperCase(one.letters[i])){
				one.letters[i] = Character.toLowerCase(one.letters[i]);
			}
			if(cipher.containsKey(one.letters[i])){
				one.letters[i] = cipher.get(one.letters[i]);
			}
		}
		one.word = new String(one.letters);
		one.word = one.word.toUpperCase();
		one.pieces = one.word.split(" ");
	}
//	public void basicEncipherOne(){//Still being flagged
//		Map<Character, Character> cipher = new HashMap<>();
//		easyCipher(cipher);
//		for(int i = 0; i < this.letters.length; i++){
//			if(Character.isUpperCase(this.letters[i])){
//				this.letters[i] = Character.toLowerCase(this.letters[i]);
//			}
//			if(cipher.containsKey(this.letters[i])){
//				this.letters[i] = cipher.get(this.letters[i]);
//			}
//		}
//		this.word = new String(this.letters);
//		this.word = this.word.toUpperCase();
//		this.pieces = this.word.split(" ");
//	}
	public static void main(String[] args){//main
		Message one = new Message();//Works when called in Message.java
		System.out.println(one);//Works when the problematic parts are deactivated; returns memory location
		System.out.println(one.word);//Not throwing problems, notably
		basicEncipherOne(one);
		System.out.println(one.word);
//		one.basicEncipherOne();//Blowing up. Treats one as VARIABLE
		System.out.println(one.word);
	}
	/**
	* Builds a simple cipher for implementation as values in a Map
	*/
	public static Letter[] easyCipherBuilderOne(){//Long and not worth viewing
		Letter[] a = new Letter[26];
		a[0] = new Letter('z');
		a[1] = new Letter('a');
		a[2] = new Letter('b');
		a[3] = new Letter('c');
		a[4] = new Letter('d');
		a[5] = new Letter('e');
		a[6] = new Letter('f');
		a[7] = new Letter('g');
		a[8] = new Letter('h');
		a[9] = new Letter('i');
		a[10] = new Letter('j');
		a[11] = new Letter('k');
		a[12] = new Letter('l');
		a[13] = new Letter('m');
		a[14] = new Letter('n');
		a[15] = new Letter('o');
		a[16] = new Letter('p');
		a[17] = new Letter('q');
		a[18] = new Letter('r');
		a[19] = new Letter('s');
		a[20] = new Letter('t');
		a[21] = new Letter('u');
		a[22] = new Letter('v');
		a[23] = new Letter('w');
		a[24] = new Letter('x');
		a[25] = new Letter('y');
		return a;
	}
	/**
	* Builds a simple cipher for implementation as values in a Map
	*/
	public static Letter[] easyCipherBuilderTwo(){//Long and not worth viewing
		Letter[] a = new Letter[26];
		a[0] = new Letter('y');
		a[1] = new Letter('z');
		a[2] = new Letter('a');
		a[3] = new Letter('b');
		a[4] = new Letter('c');
		a[5] = new Letter('d');
		a[6] = new Letter('e');
		a[7] = new Letter('f');
		a[8] = new Letter('g');
		a[9] = new Letter('h');
		a[10] = new Letter('i');
		a[11] = new Letter('j');
		a[12] = new Letter('k');
		a[13] = new Letter('l');
		a[14] = new Letter('m');
		a[15] = new Letter('n');
		a[16] = new Letter('o');
		a[17] = new Letter('p');
		a[18] = new Letter('q');
		a[19] = new Letter('r');
		a[20] = new Letter('s');
		a[21] = new Letter('t');
		a[22] = new Letter('u');
		a[23] = new Letter('v');
		a[24] = new Letter('w');
		a[25] = new Letter('x');
		return a;
	}
	/**
	* Builds a simple cipher for implementation as values in a Map
	*/
	public static Letter[] easyCipherBuilderThree(){//Long and not worth viewing
		Letter[] a = new Letter[26];
		a[0] = new Letter('x');
		a[1] = new Letter('y');
		a[2] = new Letter('z');
		a[3] = new Letter('a');
		a[4] = new Letter('b');
		a[5] = new Letter('c');
		a[6] = new Letter('d');
		a[7] = new Letter('e');
		a[8] = new Letter('f');
		a[9] = new Letter('g');
		a[10] = new Letter('h');
		a[11] = new Letter('i');
		a[12] = new Letter('j');
		a[13] = new Letter('k');
		a[14] = new Letter('l');
		a[15] = new Letter('m');
		a[16] = new Letter('n');
		a[17] = new Letter('o');
		a[18] = new Letter('p');
		a[19] = new Letter('q');
		a[20] = new Letter('r');
		a[21] = new Letter('s');
		a[22] = new Letter('t');
		a[23] = new Letter('u');
		a[24] = new Letter('v');
		a[25] = new Letter('w');
		return a;
	}
}

//	public String word;
//	public char[] letters;
//	public String[] pieces;
//	
//	public BasicCipher(String word){//Constructor
//		this.word = word;
//		this.letters = word.toCharArray();
//		this.pieces = word.split(" ");
//	}
//	public BasicCipher(char[] letters){//Constructor
//		this.letters = letters;
//		this.word = new String(letters);
//		this.pieces = word.split(" ");
//	}