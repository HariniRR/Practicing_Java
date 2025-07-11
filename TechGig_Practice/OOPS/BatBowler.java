/*Create two classes BATSMAN and BOWLER. Both the classes have same method name quality().
The method quality() has the below text-
CLASS BATSMAN
quality() - I am BATSMAN
CLASS BOWLER
quality() - I am BOWLER too
Make the object of class BOWLER.*/

import java.io.*;
import java.util.*;
public class BatBowler {
   public static void main(String args[] ) throws Exception {
      Batsman bat=new Batsman();
      Bowler ball=new Bowler();
      bat.quality();
      ball.quality();
	//Write code here

   }
}
class Batsman{
   public void quality(){
      System.out.println("I am BATSMAN");
   }
}
class Bowler{
   public void quality(){
      System.out.println("I am BOWLER too");
   }
}
