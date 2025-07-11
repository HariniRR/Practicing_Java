/*
One Two Three (100 Marks)
Make three classes FIRST, SECOND and THIRD. The three classes have functions one(), two(), three() respectively. Class SECOND inherits class FIRST and CLASS THIRD inherits class SECOND.
The respective methods have the following texts:
one(): This is base class
two(): This inherits class FIRST
three(): This inherits class SECOND
Make the object of class THIRD.*/

/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
public class OneTwoThree {
    public static void main(String args[] ) throws Exception {
        Third thre=new Third();
        thre.one();
        thre.two();
        thre.three();
    	//Write code here

   }
}
class First{
    public void one(){
        System.out.println("This is base class.");
    }
}
class Second extends First{
    public void two(){
        System.out.println("This inherits class FIRST.");
    }
}
class Third extends Second{
    public void three(){
        System.out.println("This inherits class SECOND.");
    }
}
