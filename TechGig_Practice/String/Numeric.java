/*You just need to take string input and checks whether the string consists of only numeric characters.

Input Format
You will be given a function with string as single argument. 

Constraints
1 <= |S| <= 10^4

Output Format
You need to return the string value either "True" or "False". */

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.print(isNumeric(str));
    	//Write code here

   }
static String isNumeric(String input){
    for (int i = 0; i < input.length(); i++) {
        if (!Character.isDigit(input.charAt(i))) { 
            return "False"; // Found a non-digit character
        }
    }
    return "True"; // All characters are digits
}
}

