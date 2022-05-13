package Chapter4_Loops_and_Files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Christian Aguirre
 */
public class FileWriteDemo {
    public static void main(String[] args) throws FileNotFoundException {
        String filename; //File name
        String friendName; //Friend's name
        int numFriends; //Number of friends

        //Create a scanner
        Scanner input = new Scanner(System.in);

        //Get the number of friends
        System.out.println("How many friends do you have? ");
        numFriends = input.nextInt();

        //Consume the remaining newline character
        input.nextLine();

        //get the filename
        System.out.println("Enter the filename: ");
        filename = input.nextLine();

        //Open the file
        PrintWriter outputFile = new PrintWriter(filename);

        //get data and write it to the file
        for(int i = 1; i <= numFriends; i++){
            //Get the name of a friend
            System.out.println("Enter the name of friend number " + i + ": ");
            friendName = input.nextLine();

            //Write the name to the file
            outputFile.println(friendName);
        }
        //Close the file
        outputFile.close();
        System.out.println("Data written to the file");
    }
}
