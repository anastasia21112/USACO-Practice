/*
ID: anastas11
LANG: JAVA
TASK: friday
*/

import java.io.*;
import java.util.*;

class friday {
     public static void main (String[] args) throws IOException {
	   BufferedReader f = new BufferedReader(new FileReader("friday.in")); //input file name
	   PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out"))); //output file name
	   StringTokenizer st = new StringTokenizer(f.readLine()); //breaks up the input file into tokens
     int n = Integer.parseInt(st.nextToken());
     n += 1900;
	   HashMap<String, Integer> counts = new HashMap<String, Integer>();
     friday num = new friday();
     counts.put("Saturday", 0);
     counts.put("Sunday", 0);
     counts.put("Monday", 0);
     counts.put("Tuesday", 0);
     counts.put("Wednesday", 0);
     counts.put("Thursday", 0);
     counts.put("Friday", 0);

     String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

     String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

     for (int i = 1900; i < n; i++) {
       if((i)%100==0 && i != 1900 && (i)%400 == 0) {
         for (int j = 0; j < 12; j++) {
           if (months[j].equals("February")) {
             for (int y = 1; y < 30; y++) {
               if(y==13) {
                 String key = num.zellers(y, j, i);
                 counts.put(key, counts.get(key) + 1);
               }
             }
           } else if (months[j].equals("September") || months[j].equals("April") || months[j].equals("June") || months[j].equals("November")) {
             for (int k = 1; k < 31; k++) {
               if(k==13) {
                 String key = num.zellers(k, j, i);
                 counts.put(key, counts.get(key) + 1);
               }
             }
           } else {
             for (int l = 1; l < 32; l++) {
               if(l==13) {
                 String key = num.zellers(l, j, i);
                 counts.put(key, counts.get(key) + 1);
               }
             }
           }
         }
       } else if((i)%4==0){
         for (int g = 0; g < 12; g++) {
           if (months[g].equals("February")) {
             for (int h = 1; h < 30; h++) {
               if(h==13) {
                 String key = num.zellers(h, g, i);
                 counts.put(key, counts.get(key) + 1);
               }
             }
           } else if (months[g].equals("September") || months[g].equals("April") || months[g].equals("June") || months[g].equals("November")) {
             for (int d = 1; d < 31; d++) {
               if(d==13) {
                 String key = num.zellers(d, g, i);
                 counts.put(key, counts.get(key) + 1);
               }
             }
           } else {
             for (int e = 1; e < 32; e++) {
               if(e==13) {
                 String key = num.zellers(e, g, i);
                 counts.put(key, counts.get(key) + 1);
                 System.out.println("here");
               }
             }
           }
         }
       } else {
         for (int x = 0; x < 12; x++) {
           if (months[x].equals("February")) {
             for (int a = 1; a < 30; a++) {
               if(a == 13) {
                 String key = num.zellers(a, x, i);
                 counts.put(key, counts.get(key) + 1);
              }
             }
           } else if (months[x].equals("September") || months[x].equals("April") || months[x].equals("June") || months[x].equals("November")) {
             for (int b = 1; b < 31; b++) {
               if(b == 13) {
                 String key = num.zellers(b, x, i);
                 counts.put(key, counts.get(key) + 1);
               }
             }
           } else {
             for (int c = 1; c < 32; c++) {
               if(c==13) {
                 String key = num.zellers(c, x, i);
                 counts.put(key, counts.get(key) + 1);
               }
             }
           }
         }
       }
     }
     out.println(counts.get("Saturday") + " " + counts.get("Sunday") + " " + counts.get("Monday") + " " + counts.get("Tuesday") + " " + counts.get("Wednesday") + " " + counts.get("Thursday")  + " " +  counts.get("Friday"));
	   out.close(); //close output file
    }

    public String zellers(int day, int month, int yearNum) {
      int monthh;
      switch (month) {
        case 0:
          monthh = 11;
          break;
        case 1:
          monthh = 12;
          break;
        case 2:
          monthh = 1;
          break;
        case 3:
          monthh = 2;
          break;
        case 4:
          monthh = 3;
          break;
        case 5:
          monthh = 4;
          break;
        case 6:
          monthh = 5;
          break;
        case 7:
          monthh = 6;
          break;
        case 8:
          monthh = 7;
          break;
        case 9:
          monthh = 8;
          break;
        case 10:
          monthh = 9;
          break;
        case 11:
          monthh = 10;
          break;
        default:
          monthh = 1;
          break;
      }
      int century;
      int year;
      if (monthh == 11 || monthh == 12) {
        century = (yearNum-1)/100;
        year = (yearNum-1)%100;
      } else {
        century = yearNum/100;
        year = yearNum%100;
      }
      int date = (day) + ((13*(monthh)-1)/5) + (year) + ((year)/4) + ((century)/4) - 2*(century);
      int remainder;
      if (date < 0) {
        remainder = date%7 + 7;
      } else {
        remainder = date%7;
      }
      String weekday;
      switch (remainder) {
        case 0:
          weekday = "Sunday";
          break;
        case 1:
          weekday = "Monday";
          break;
        case 2:
          weekday = "Tuesday";
          break;
        case 3:
          weekday = "Wednesday";
          break;
        case 4:
          weekday = "Thursday";
          break;
        case 5:
          weekday = "Friday";
          break;
        case 6:
          weekday = "Saturday";
          break;
        default:
          weekday = "Sunday";
      }
      return weekday;
    }

}
