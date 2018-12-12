package API.orca;
import API.orca.*;
import static API.orca.Letter.*;
import static API.orca.Message.*;
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
				basicEncipherTwo(x);
			}
			if(i % 3 == 2){
				basicEncipherThree(x);
			}
			if(i % 3 == 0){
				basicEncipherOne(x);
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