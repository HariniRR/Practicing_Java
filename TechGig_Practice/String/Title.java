/*You just need to take string input and checks whether all the case-based characters in the string following non-casebased letters. Non-casebased letters are uppercase and all other case-based characters are lowercase.

Input Format
You will be given a function with string as single argument. 

Constraints
1 <= |S| <= 10^4

Output Format
You need to return the String either "True" or "False". */

import java.io.*;
import java.util.*;
public class Title {
    public static void main(String args[]) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine(); // Read input string
        boolean uppercaseFound = false;
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                uppercaseFound = true;
            } else if (Character.isLowerCase(c) && !uppercaseFound) {
                System.out.println("False");
                return; // Exit immediately
            }
        }
        System.out.println("True");
    }
}