/*You just need to take string input and checks whether the string consists of alphabetic characters only.

Input Format
You will be given a function with a string as an argument. 

Constraints
1 <= |S| <= 10^3

Output Format
You need to return the string either "True" or "False". */

import java.util.Scanner;
public class StringAlphabetics {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(isAlphabetic(str));
    }

    static String isAlphabetic(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isLetter(input.charAt(i))) {  
                return "False"; // Found a non-alphabetic character
            }
        }
        return "True"; // All characters are alphabetic
    }
}