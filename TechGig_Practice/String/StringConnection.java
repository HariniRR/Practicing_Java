/*You just need to take two strings as input and concatenate them and print the concatenated string.

Input Format
You will be given a function with two strings as arguments. 

Constraints
1 <= S1 <= 10^3
1 <= S2 <= 10^3

Output Format
You need to return the concatenated string from the given function. 
*/

import java.io.*;
import java.util.*;
public class StringConnection {
   public static void main(String args[] ) throws Exception {
      Scanner s=new Scanner(System.in);
      String str1=s.nextLine().trim();
      String str2=s.nextLine().trim();
      String str3=str1+str2;
      System.out.print(str3);
	//Write code here

   }
}

