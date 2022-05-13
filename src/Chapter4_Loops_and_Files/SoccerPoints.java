package Chapter4_Loops_and_Files;

import java.util.Scanner;

/**
 * @author Christian Aguirre
 */
public class SoccerPoints {
    public static void main(String[] args) {
        int points; //Game points
        int totalPoints = 0; // Accumulator intialized to 0

        //Create a scanner object for keyboard input
        Scanner input = new Scanner(System.in);

        //Display general instructions
        System.out.println("Enter the number of points your team");
        System.out.println("has earned for each game this season.");
        System.out.println("Enter -1 when finished");
        System.out.println();

        //Get the first number of points
        System.out.println("Enter game points or -1 to end: ");
        points = input.nextInt();

        //Accumulate the points until -1 is entered
        while (points != -1){
            //Add points to totalPoints
            totalPoints += points;

            //Get the next number of points
            System.out.println("Enter game points or -1 to end: ");
            points = input.nextInt();
        }

        //Display the total number of points
        System.out.println("The total points are " + totalPoints);
    }
}
