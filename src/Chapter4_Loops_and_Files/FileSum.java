package Chapter4_Loops_and_Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Christian Aguirre
 */
public class FileSum {
    public static void main(String[] args) throws FileNotFoundException {
        double sum = 0.0; //Accumulator, initialized to 0

        //Open the file for reading
        File file = new File("Numbers.txt");
        Scanner inputFile = new Scanner(file);

        //Read all of the values from the file
        //and calculate their total
        while(inputFile.hasNext()){
            //Read a value from the file
            double number = inputFile.nextDouble();

            //Add the number to sum
            sum = sum + number;
        }

        //Close the file
        inputFile.close();

        //Display the sum of the numbers
        System.out.println("The sum of the numbers in Numbers.txt is " + sum);
    }
}
