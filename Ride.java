/*
ID: anastas11
LANG: JAVA
PROG: ride
*/

import java.io.*;
import java.util.*;

class ride {
    
    public static void main(String[] args) throws IOException{
	int comet = 1;
	int ufo = 1;

	char[] abc = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	
	BufferedReader r = new BufferedReader(new FileReader("ride.in"));
	PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
	
	String line1 = r.readLine();
	String line2 = r.readLine();

	int[] line1Val = new int[line1.length()];
	int[] line2Val = new int[line2.length()];

	for(int i = 0; i < line1.length(); i++) {
	    int arrayCount = 0;
	    while(line1.charAt(i) != abc[arrayCount]) {
		arrayCount++;
	    }

	    line1Val[i] = arrayCount + 1;
	}

	for(int j = 0; j < line2.length(); j++) {
	    int arrayCount = 0;
	    while(line2.charAt(j) != abc[arrayCount]) {
		arrayCount++;
	    }

	    line2Val[j] = arrayCount + 1;
	}

	for(int g = 0; g < line1Val.length; g++) {
	    comet = comet * line1Val[g];
	}

	for(int h = 0; h < line2Val.length; h++) {
	    ufo = ufo * line2Val[h];
	}

	if(comet%47 == ufo%47) {
	    out.println("GO");
	} else {
	    out.println("STAY");
	}

	out.close();
    }
}

  
	
	
