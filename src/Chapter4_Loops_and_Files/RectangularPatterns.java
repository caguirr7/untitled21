package Chapter4_Loops_and_Files;

import java.util.Scanner;

/**
 * @author Christian Aguirre
 */
public class RectangularPatterns {
    public static void main(String[] args) {
        int rows, cols;

        //Create a scanner
        Scanner keyboard = new Scanner(System.in);

        //Get the number rof rows and columns
        System.out.println("How many rows? ");
        rows = keyboard.nextInt();
        System.out.println("How many columns? ");
        cols = keyboard.nextInt();

        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
