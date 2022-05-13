package Chapter4_Loops_and_Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Christian Aguirre
 */
public class FileReadDemo {
    public static void main(String[] args) throws FileNotFoundException {
        //Create a scanner
        Scanner input = new Scanner(System.in);

        //Get the filename
        System.out.println("Enter the filename: ");
        String filename = input.nextLine();

        //Open the file
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        //Read lines from the file until no more are left
        while (inputFile.hasNext()){
            //Read the next name
            String friendName = inputFile.nextLine();

            //Display the last name read
            System.out.println(friendName);
        }

        //Close the file
        inputFile.close();


    }
}
