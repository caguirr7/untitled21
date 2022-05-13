package Chapter4_Loops_and_Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Christian Aguirre
 */
public class ReadingFirstLine {
    public static void main(String[] args) throws FileNotFoundException {
        //Create a scanner
        Scanner keyboard = new Scanner(System.in);


        //Get the file name
        System.out.println("Enter the name of a file: ");
        String filename = keyboard.nextLine();

        //Open the file
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        //Read the first line from the file
        String line = inputFile.nextLine();

        //Display the line
        System.out.println("The first line in the file is:");
        System.out.println(line);

        //Close the file
        inputFile.close();

    }
}
