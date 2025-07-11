/*Make three classes BATSMAN, BOWLER and ALLROUNDER. The three classes have functions bat(), bowl(), both() respectively. Class ALLROUNDER inherits class BATSMAN and CLASS BOWLER.
The respective methods have the following texts:
bat(): I am Batsman 
bowl(): I am Bowler
both(): I am Batsman and Bowler
Make the object of class ALLROUNDER.*/

import java.io.*;

public class Multiple {
    public static void main(String args[]) throws Exception {
        AllRounder ar = new AllRounder();
        ar.bat();
        ar.bowl();
        ar.both();
    }
}

class Batsman {
    public void bat() {
        System.out.println("I am Batsman");
    }
}

class Bowler {
    public void bowl() {
        System.out.println("I am Bowler");
    }
}

class AllRounder extends Batsman {   //multiple inheritance
    private Bowler bowler = new Bowler();   // Composition

    public void bowl() {
        bowler.bowl();   // Call the bowl method from Bowler
    }

    public void both() {
        System.out.println("I am Batsman and Bowler");
    }
}
