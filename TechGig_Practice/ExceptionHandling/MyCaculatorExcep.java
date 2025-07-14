/*Create a class MyCalculator which consists of a single method long power(int, int). This method takes two integers, n and p, as parameters and finds n^p . If either n or p is negative, then the method must throw an exception which says "n or p should not be negative.". Also, if both n and p are zero, then the method must throw an exception which says "n and p should not be zero."

Input Format
Each line of the input contains two integers, n and p.

Constraints
-10 < n < 10
-10 < p < 10

Output Format
Each line of the output contains the result , if both n and p are positive. If either n or p is negative, the output contains "n and p should be non-negative". If both n and p are zero, the output contains "n and p should not be zero.".*/

import java.io.*;
import java.util.*;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

class MyCalculator {
    public long power(int n, int p) throws MyException {
        if (n < 0 || p < 0) {
            throw new MyException("n or p should not be negative.");
        } else if (n == 0 && p == 0) {
            throw new MyException("n and p should not be zero.");
        }
        return (long) Math.pow(n, p); //return n^p;
    }
}

public class CandidateCode {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        MyCalculator mc = new MyCalculator();

        while (s.hasNextInt()) { // Check if there is more input
            try {
                int n = s.nextInt();
                int p = s.nextInt();
                System.out.println(mc.power(n, p));
            } catch (MyException e) {
                System.out.println("java.lang.Exception: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter two integers.");
                s.next(); // Clear the invalid input
            }
        }
        s.close(); 
    }
}
