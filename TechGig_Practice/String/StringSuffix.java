/*You just need to take two strings as an input and check later string is the suffix of the former one. If yes, return a string 'True' else return 'False'.

Input Format
You will be given a function with two strings as an arguments. 

Constraints
1 <= P, Q <= 10^3

Output Format
You need to return a string "True" or "False" 
*/

/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class StringSuffix {
   public static void main(String args[] ) throws Exception {
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      String substr=sc.nextLine();
      int start=str.length() - substr.length();
      String newstr=str.substring(start);
      //String new=str.Substring(start,substr.length());
      if(substr.equals(newstr)){
         System.out.println("True");
      }
      else{
         System.out.println("False");
      }
	//Write code here

   }
}



/*equals() is used to compare the content of two strings in Java. Using == would only check if both references point to the same object in memory*/