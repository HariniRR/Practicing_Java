/*You just need to take string input and checks whether all the case-based characters (letters) of the string are lowercase.

Input Format
You will be given a function with string as an argument. 

Constraints
1 <= |S| <= 10^5

Output Format
You need to return the string either "True" or "False". */

import java.io.*;
import java.util.*;
public class LowerCase {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.print(isLowerCase(str));
    	//Write code here

   }
   static String isLowerCase(String input) {
    for (int i = 0; i < input.length(); i++) {
        char ch = input.charAt(i);
        if (Character.isLetter(ch) && !Character.isLowerCase(ch)) { 
            return "False"; // Found an uppercase letter
        }
    }
    return "True"; // All case-based characters are lowercase
}
}
