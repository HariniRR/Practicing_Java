/*Input Format
The first line of input consist of a string.
Next 2 lines consist of an integer.

Constraints
1<= |string| <=10
1<= Integer <=50

Output Format
Print the input read to stdout in the similar format in separate lines.*/

// import java.util.Scanner;
import java.io.*;
import java.util.*;
public class ReadWrite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int firstInteger = scanner.nextInt();
        int secondInteger = scanner.nextInt();
        System.out.println(inputString);
        System.out.println(firstInteger);
        System.out.println(secondInteger);
        scanner.close();
    }
}
