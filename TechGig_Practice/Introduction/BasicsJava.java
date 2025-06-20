/*Input Format
Read a single string, int, float with one on each line.

Constraints
1 <= |S| <= 10^5
1 <= N <= 10^5

Output Format
Print your string, int, float value to the stdout with each in each line.*/

import java.io.*;
import java.util.*;
public class BasicsJava {
    public static void main(String args[] ) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int inputInt = scanner.nextInt();
        float inputFloat = scanner.nextFloat();
        System.out.println(inputString);
        System.out.println(inputInt);
        System.out.println(inputFloat);
        scanner.close();
    }
}
