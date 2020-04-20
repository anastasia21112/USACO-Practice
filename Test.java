/* 
Read two integers from an input file and output their sum
*/

/*
ID: anastas11
LANG: JAVA
TASK: test
*/

import java.io.*;
import java.util.*;

class test {
    public static void main (String[] args) throws IOException {
	BufferedReader f = new BufferedReader(new FileReader("test.in")); //input file name
	PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("test.out"))); //output file name
	StringTokenizer st = new StringTokenizer(f.readLine()); //breaks up the input file into tokens

	int i1 = Integer.parseInt(st.nextToken()); //parses each token into an integer
	int i2 = Integer.parseInt(st.nextToken()); //parses each (second) token into an integer
	out.println(i1 + i2); //output result
	out.close(); //close output file
    }
}
