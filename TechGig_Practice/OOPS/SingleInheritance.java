/*Make a Base class Cricket with function game(). Make another class Player which inherits the class Cricket. Class Player has a function captain(). The function game() should print "GENTLEMEN GAME" and function captain() should print "SOURAV GANGULY".

Make the object of class Player.*/

import java.io.*;
import java.util.*;
public class SingleInheritance {
    public static void main(String args[] ) throws Exception {
            Player Strength=new Player();
            Strength.game();
            Strength.captain();
    	//Write code here

   }
}
class Cricket{
    public void game(){
        System.out.println("GENTLEMEN GAME");
    }
}
class Player extends Cricket{
    public void captain(){
        System.out.println("SOURAV GANGULY");
    }
}