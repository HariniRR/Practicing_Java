 /*
Create two classes:
BaseClass
The Rectangle class should have two data fields-width and height of int types. The class should have display()method, to print the width and height of the rectangle separated by space.
DerivedClass 
The RectangleArea class is derived from Rectangle class, i.e., it is the sub-class of Rectangle class. The class should have read_input() method, to read the values of width and height of the rectangle. The RectangleArea class should also overload  the display() method to print the area (width*height) of the rectangle.

Input Format
The first and only line of input contains two space separated integers denoting the width and height of the rectangle.

Constraints
1 <= width,height <= 10^3

Output Format
The output should consist of exactly two lines: 
In the first line, print the width and height of the rectangle separated by space. 
In the second line, print the area of the rectangle.
*/

import java.io.*;
import java.util.*;
public class JavaInheritance {
   public static void main(String args[] ) throws Exception {
      Scanner s=new Scanner(System.in);
      int len=s.nextInt();
      int wid=s.nextInt();
      RectangleArea r=new RectangleArea();
      r.read_input(len, wid);
      r.display();
	s.close();
	//Write code here
   }
}
    class Rectangle{
       int len;
       int wid;
      public void read_input(int len, int wid){
         this.len=len;
         this.wid=wid;
      }
      public void display(){
         System.out.println(len+" "+wid);
      }
   }
    class RectangleArea extends Rectangle{
      public void display(){
        super.display();
         System.out.println(len * wid);
      }
   }
