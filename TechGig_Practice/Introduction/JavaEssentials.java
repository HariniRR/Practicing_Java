/*Input Format:
Read 5 strings with one string on each line.

Constraints:
1 <= |S| <= 10^5

Output Format:
Print your strings to the stdout with each string in each line.*/

import java.io.*;
import java.util.*;
public class JavaEssentials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();
    }
}