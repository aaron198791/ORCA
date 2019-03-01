import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LeftRotation {

    public static void rotate(int[] a, int d) {
        int[] b = new int[a.length];

        for(int i = 0; i < a.length; i++) {
            if(i - d < 0) {
                b[a.length + i - d] = a[i];
            }

            else {
                b[i - d] = a[i];
            }
        }

        for(int j = 0; j < a.length; j++) {
            System.out.print(b[j] + " ");
        } 
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        rotate(a, d);

        scanner.close();
    }
}