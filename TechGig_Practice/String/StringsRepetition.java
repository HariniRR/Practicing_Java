/*Input Format
You will be given a function with string and an integer as an argument. 

Constraints
1 <= S <= 10^3
1 <= N <= 100

Output Format
You need to return the string from the given function. */

import java.io.*;
import java.util.*;
public class StringsRepetition
 {
   public static void main(String args[] ) throws Exception {
   Scanner sc=new Scanner(System.in);
   String s=sc.nextLine();
   int num=sc.nextInt();
   String result=" ";
   for(int i=0;i<num;i++)
   {
      result=result.concat(s);
   }
   System.out.println(result);
   // String result = P.repeat(num);
   // System.out.println(result);
   sc.close();
	//Write code here

   }
}
