/*Input Format:
The only line of input consist of an integer, N
Constraints:
-20<= N <= 20
Output Format:
Print Successful Conversion if the integer is Successfully converted else print Conversion Unsuccessful.*/

import java.io.*;
import java.util.*;
public class Conversion {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int N = scanner.nextInt();
       String convertedString = String.valueOf(N);
       if (convertedString != null) {
           System.out.println("Conversion Successful");
       } else {
           System.out.println("Conversion Unsuccessful");
       }
       scanner.close();
   }
}

