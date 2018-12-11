package ORCA.Projects.Fred.Ciphers;
import ORCA.Projects.Fred.Ciphers.*;
import java.util.Scanner;

/**
* Takes input to be enciphered
* Holds input as sentence(word), array of characters(letters), and words(pieces)
*/
public class Message{
	public String word;
	public char[] letters;
	public String[] pieces;
	
	/**
	* Constructs Message object from user input via terminal
	*/
	public Message(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter text to be enciphered: ");
		this.word = (sc.nextLine());
		this.letters = word.toCharArray();
		this.pieces = word.split(" ");
	}
	/**
	* Constructs Message object from existing String
	*/
	public Message(String word){
		this.word = word;
		this.letters = word.toCharArray();
		this.pieces = word.split(" ");
	}
	/**
	* Constructs Message object from existing char array
	*/
	public Message(char[] letters){
		this.letters = letters;
		this.word = new String(letters);
		this.pieces = word.split(" ");
	}
	/**
	* Changes the sentence to "THE CAT IS SLOW"
	*/
	public void edit(){
		this.word = "THE CAT IS SLOW";
	}
	public static void main(String[] args){
		Message one = new Message();
		System.out.println(one.word);
		one.edit();
		System.out.println(one.word);
	}
}