/*Aahan is doing homework where he has to find the product of N integers. The problem is, he missed the class of MULTIPLICATION and donâ€™t know how to do it. Can you write a code to help him?

Input Format:
The first line of input consist of number of integers, N.
The second line of input consist of N space separated integers.

Constraints:
1<= N <=10
1<= Integer <=25

Output Format:
Print the product of N integers.*/

import java.io.*;
import java.util.*;
public class Multiply{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int product = 1;

        for (int i = 0; i < N; i++) {
            product *= scanner.nextInt();
        }

        System.out.println(product);
        scanner.close();
    }
}
