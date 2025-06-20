/*Rohan wants to find the summation of N integers. But he don't know how to do that. Can you Help Rohan find the summation ?

Input Format
The first line of input consists of number of integers, N.
The second line of input consist of N space separated integers.

Constraints
1<= N <=10
1<= Ai <=50

Output Format
Print the summation of N integers.*/

import java.io.*;
import java.util.*;
public class Summation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += scanner.nextInt();
        }
        System.out.println(sum);
        scanner.close();
    }
}
