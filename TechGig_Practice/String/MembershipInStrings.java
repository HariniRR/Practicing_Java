/*You just need to take string and a character as an input and print 'Yes' if that character is present in that string otherwise print 'No'.

Input Format
You will be given two strings P and Q.

Constraints
1 <= P,Q <=10^3

Output Format
Print "Yes" if that character is present in that string, otherwise print "No".
*/

import java.io.*;
import java.util.*;
public class MembershipInStrings {
    public static void main(String args[] ){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String c=s.nextLine();
        //c.length() == 1 && str.indexOf(c.charAt(0)) != -1
        if (c.length() == 1 && str.contains(c)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        s.close();
    	//Write code here

   }
}
