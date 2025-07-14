//Take two numbers x and y. Throw the exception if the two numbers are negative else print the Product of x and y.
import java.io.*;
import java.util.*;
class MyException extends Exception{
    public MyException(String a) {
		super(a);
	}
}

public class Negative {
    public static void main(String args[] ) throws MyException {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        try{
            if(x<0&&y<0){
                throw new MyException("x and y should not be zero.");
            }
            else{
                System.out.println(x*y);
            }
        }
        catch(MyException e){
            System.out.println("java.lang.Exception: "+e.getMessage());
        }
    	//Write code here

   }
}
