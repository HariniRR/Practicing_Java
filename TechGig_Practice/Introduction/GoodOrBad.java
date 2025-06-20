/*In a village in UP, a number n is considered GOOD if it is completely divisible by 2 otherwise it is considered to be BAD. Can you tell whether the given number is GOOD or BAD ?
Input Format:
The only line of input consist of a number N.
Constraints:
1<= N <=100
Output Format:
Print whether number if GOOD or BAD.*/
import java.io.*;
import java.util.*;
public class GoodOrBad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        if (N % 2 == 0) {
            System.out.println("GOOD");
        } else {
            System.out.println("BAD");
        }
        
        scanner.close();
    }
}
