package ORCA.Projects.Fred.Ciphers;
import ORCA.Projects.Fred.Ciphers.*;
import static ORCA.Projects.Fred.Ciphers.Letter.*;
import static ORCA.Projects.Fred.Ciphers.BasicCipher.*;
import java.util.*;

public class ComplexCipher{
	/**
	* creates a 3-part cipher, using one of three ciphers for each individual word
	* @param one is the input
	*/
	public static void triPartCipher(Message one){
		one.word = "";
		for(int i = 0; i < one.pieces.length; i++){
			Message x = new Message(one.pieces[i]);
			if(i % 3 == 1){
				basicEncipherOne(x);
			}
			if(i % 3 == 2){
				basicEncipherTwo(x);
			}
			if(i % 3 == 0){
				basicEncipherThree(x);
			}
			one.pieces[i] = x.word;
			one.word += one.pieces[i];
			one.word += " ";
		}
	}
	public static void main(String[] args){
		Message one = new Message();
		System.out.println(one.word);
		triPartCipher(one);
		System.out.println(one.word);
	}
}