package character;

import java.util.Random;
public class Dice {
    private Random r;
    
     public Dice (){
          r = new Random();
    }
    
    public int roll (){
        int n = r.nextInt(6);
        return n +1;
    }
}
