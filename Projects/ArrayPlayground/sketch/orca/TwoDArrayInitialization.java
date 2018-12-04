package sketch.orca;

import java.util.*;
import java.lang.*;
import java.io.*;

public class TwoDArrayInitialization {
	public static void main(String[] args) {
		int[] array1 = {5, 87, 39, 82};
		int[] array2 = {37, 43, 90, 1};
		int[] array3 = {12, 77, 26, 87};
		
		int[][] twoD = {array1, array2, array3};
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.println(twoD[i][j]);
			}
		}
	}
}