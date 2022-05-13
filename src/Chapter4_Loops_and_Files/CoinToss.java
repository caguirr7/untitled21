package Chapter4_Loops_and_Files;

import java.util.Random;

/**
 * @author Christian Aguirre
 */
public class CoinToss {
    public static void main(String[] args) {
        //Create a random object
        Random rand = new Random();

        //Simulate the coint tosses
        for(int count = 0; count < 10; count++){
            if(rand.nextInt(2) == 0)
                System.out.println("Tails");
            else
                System.out.println("Heads");
        }
    }
}
