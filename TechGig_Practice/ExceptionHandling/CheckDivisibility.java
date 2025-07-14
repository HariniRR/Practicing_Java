//You have to divide a by b. If there is any arithmetic exception than print it else print the correct output.

import java.io.*;
import java.util.*;
public class CheckDivisibility {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
		try {
			int a=s.nextInt();
			int b=s.nextInt();
			System.out.println(a/b); 
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
	}
}
