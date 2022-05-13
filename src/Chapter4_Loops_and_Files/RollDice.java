package Chapter4_Loops_and_Files;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Christian Aguirre
 */
public class RollDice {
    public static void main(String[] args) {
        String again = "y"; //To control the loop
        int die1; // To hold the value of die 1
        int die2; //To hold the value of die 2

        //Create a scanner
        Scanner input = new Scanner(System.in);

        //Create a random object to generate random numbers
        Random rand = new Random();

        //Simulate rolling the dice
        while (again.equalsIgnoreCase("y")){
            System.out.println("Rolling the dice...");
            die1 = rand.nextInt(6) + 1;
            die2 = rand.nextInt(6) + 1;
            System.out.println("Their values are:");
            System.out.println(die1 + " " + die2);
            if(die1 == 1 && die2 == 1){
                System.out.println("Snake Eyes! You lose!");
                System.exit(0);
            }

            System.out.println("Roll them again(y = yes)? ");
            again = input.nextLine();
        }
    }
}
