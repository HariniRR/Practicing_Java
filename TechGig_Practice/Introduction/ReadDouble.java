/*Input Format
The only line of input consist of a double value.

Constraints
NA

Output Format
Print the double value with the prefix of DOUBLE.*/

import java.io.*;
import java.util.*;
public class ReadDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextDouble();
        System.out.println("DOUBLE " + value);
        scanner.close();
    }
}
