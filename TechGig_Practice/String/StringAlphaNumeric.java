/*You just need to take string input and checks whether the string consists of alphanumeric characters.

Input Format
You will be given a function with string as an argument. 

Constraints
1 <= |S| <= 10^4

Output Format
You need to return the string either "True" or "False". */

/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
public class StringAlphaNumeric {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        // Check if the string is alphanumeric
        if (input.matches("[a-zA-Z0-9]+")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        scanner.close();
    	//Write code here
   }
}
