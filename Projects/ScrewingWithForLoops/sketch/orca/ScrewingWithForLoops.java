package sketch.orca;

import java.util.*;
import java.lang.*;
import java.io.*;

public class ScrewingWithForLoops {
	public static void main(String[] args) {
		for(int i = 0; i < 20; i++) {
			if(i % 3 == 0) {
				i++;
			}
			
			System.out.println(i);
		}
	}
}