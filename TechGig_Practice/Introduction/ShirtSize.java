/*Input Format
The only line of input consists of a number, N

Constraints
1<= N <=100

Output Format
Print SMALL, MEDIUM or LARGE based on the number provided.*/

import java.io.*;
import java.util.*;
public class ShirtSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if (N >= 1 && N <= 30) {
            System.out.println("SMALL");
        } else if (N >= 31 && N <= 60) {
            System.out.println("MEDIUM");
        } else if (N >= 61 && N <= 100) {
            System.out.println("LARGE");
        }

        scanner.close();
    }
}
