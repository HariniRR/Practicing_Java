/*You just need to take string input and checks whether the string consists of digits only.

Input Format
You will be given a function with string as an argument. 

Constraints
1 <= |S| <= 10^5

Output Format
You need to return the string either "True" or "False" from the given function. */

import java.io.*;
import java.util.*;
public class Digitizing {
   public static void main(String args[] ) throws Exception {
      Scanner sc=new Scanner(System.in);
      String str =sc.nextLine();
      System.out.print(isNumeric(str));
      }
	//Write code here
   static String isNumeric(String input){
    for (int i = 0; i < input.length(); i++) {
        if (!Character.isDigit(input.charAt(i))) { 
            return "False"; 
        }
    }
    return "True"; 
}
}

/*
static String isNumeric(String input) {
    return input.chars().allMatch(Character::isDigit) ? "True" : "False";
}
*/
