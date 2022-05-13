package Chapter4_Loops_and_Files;

import java.util.Scanner;

/**
 * @author Christian Aguirre
 */
public class UserSquares {
    public static void main(String[] args) {
        int number; //Loop control variable
        int maxValue; // Maximum value to display

        System.out.println("I will display a table of numbers and their squares");

        //Create a scanner object for keyboard input
        Scanner input = new Scanner(System.in);

        //Get the maximum value to display
        System.out.println("How high should I go? ");
        maxValue = input.nextInt();

        //Display the table
        System.out.println("Number Number Squared");
        System.out.println("-------------------------");
        for(number = 1; number <= maxValue; number++)
            System.out.println(number + "\t\t\t" + number * number);
    }
}
