/*
ID: anastas11
LANG: JAVA
PROG: gift1
 */
import java.io.*;
import java.util.*;

class gift1 {

    public static void main(String[] args) throws IOException {

	BufferedReader g = new BufferedReader(new FileReader("gift1.in"));
	PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));	

	int NP = Integer.parseInt(g.readLine());
	
	String[] names = new String[NP];
	
	int[] namesVal = new int[NP];

	for(int u = 0; u < NP; u++) {
	    namesVal[u] = 0;
	}

	for(int z = 0; z < NP; z++) {
	    names[z] = g.readLine();
	}
	
	int count = 0;
	String giver;
        while((giver = g.readLine()) != null) {
	   
	  
	    StringTokenizer st = new StringTokenizer(g.readLine());
	    
	    int money = Integer.parseInt(st.nextToken());
	    int people = Integer.parseInt(st.nextToken());
	    
	    String[] gifts = new String[people];

	    for(int j = 0; j < people; j++) {  
		gifts[j] = g.readLine();
       	    }
	    
	    for(int i = 0; i < people; i++) {
		int l = 0;
		while(!gifts[i].equals(names[l])) {    
		    l++;
		}
		
		if(people == 0) {    
		} else{ 
		    namesVal[l] = namesVal[l] + money/people;
		}
	    }

	    int a = 0;
	    
	    while(!giver.equals(names[a])) {
		a++;
	    }
	    
	    if(people == 0) {
	    } else {
		namesVal[a] = (namesVal[a] - money) + (money%people);
	    }
	}
	
	for(int h = 0; h < NP; h++) {
	    out.println(names[h] + " " + namesVal[h]);
	}

	out.close();
    }
}

	    
	    
		
		    
		
			
		

	

	
					    
