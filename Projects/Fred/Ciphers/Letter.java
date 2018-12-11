package ORCA.Projects.Fred.Ciphers;
import ORCA.Projects.Fred.Ciphers.*;
/**
* Creates a Letter object, enabling the easy creation of arrays for building ciphers
* Character[] may well work; I haven't checked
*/
public class Letter{
	public Character letter;
/**
* Constructs the Letter object
* @param a input for cipher setup
*/	
	public Letter(Character a){
		this.letter = a;
	}
	/**
	* Builds the input segment for every cipher
	* @return Letter[] which is used in the creation of every cipher as Key
	*/
	public static Letter[] alphabet(){//Long and boring
		Letter[] a = new Letter[26];
		Letter x = new Letter('a');
		a[0] = new Letter('a');
		a[1] = new Letter('b');
		a[2] = new Letter('c');
		a[3] = new Letter('d');
		a[4] = new Letter('e');
		a[5] = new Letter('f');
		a[6] = new Letter('g');
		a[7] = new Letter('h');
		a[8] = new Letter('i');
		a[9] = new Letter('j');
		a[10] = new Letter('k');
		a[11] = new Letter('l');
		a[12] = new Letter('m');
		a[13] = new Letter('n');
		a[14] = new Letter('o');
		a[15] = new Letter('p');
		a[16] = new Letter('q');
		a[17] = new Letter('r');
		a[18] = new Letter('s');
		a[19] = new Letter('t');
		a[20] = new Letter('u');
		a[21] = new Letter('v');
		a[22] = new Letter('w');
		a[23] = new Letter('x');
		a[24] = new Letter('y');
		a[25] = new Letter('z');
		return a;
	}
	public static void main(String[] args){
		Letter x = new Letter('x');
		System.out.print(x.letter);
		Letter[] y = alphabet();
		for(int i = 0; i < y.length; i++){
			System.out.print(y[i].letter);
		}
	}
}