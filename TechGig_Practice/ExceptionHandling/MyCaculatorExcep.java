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
class MyException extends Exception{
	public MyException(String a) {
		super(a);
	}
}
public class CandidateCode {
    public static void main(String args[] ) throws MyException {
        try{
            Scanner s=new Scanner(System.in);
        while(true){
            int p=s.nextInt();
            int n=s.nextInt();
            if(p<0 || n<0){
                throw new MyException("n or p should not be negative.");
            }
            else if(p==0&&n==0){
                throw new MyException("n and p should not be zero.");
            }
            else{
                System.out.println(mc.power(p,n));
            }
        }
        s.close();
    	//Write code here

   }
   catch(Exception e){
       System.out.println("Caught Exception: " + e.getMessage());
   }
}}
class MyCalculator{
    public long power(int a,int b){
        return a^b;
    }
}