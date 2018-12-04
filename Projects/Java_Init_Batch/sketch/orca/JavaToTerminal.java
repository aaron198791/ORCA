package sketch.orca;

import java.util.*;
import java.lang.*;
import java.io.*;

public class JavaToTerminal {
    public static void main(String args[]) throws Exception{
		Process p;
		
		p.exec("/bin/bash -c echo HELLO THERE");
        System.exit(0);
    }
}