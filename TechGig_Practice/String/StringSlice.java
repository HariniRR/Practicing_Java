/* You need to take string input and two other numbers which will be the start and end point of the slice and you need to print that slice of string.

Input Format
You will be given a function with string and two other integers as arguments.

Constraints
1 <= |S| <= 10^3

Output Format
You need to return the slice of the string.*/

import java.io.*;
import java.util.*;
public class StringSlice {
   public static void main(String args[] ) throws Exception {
      Scanner s=new Scanner(System.in);
      String inputstr=s.nextLine();
      int st=s.nextInt();
      int end=s.nextInt() +1;
      System.out.print(inputstr.substring(st,end));
	   s.close();
	//Write code here

   }
}
// The inputString.substring(start, end) method in Java returns the part of the string from start (inclusive) to end (exclusive).



