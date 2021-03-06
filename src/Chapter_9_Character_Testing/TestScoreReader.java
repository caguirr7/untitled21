package Chapter_9_Character_Testing;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Christian Aguirre
 */
public class TestScoreReader {

    private Scanner inputFile;
    private String line;


    /**
     * The constructor opens a file to read the grades from
     * @param filename The file to open
     * @throws IOException
     */
    public TestScoreReader(String filename) throws IOException{

        File file = new File(filename);
        inputFile = new Scanner(file);
    }


    /**
     * The readNextLine method reads the next line
     * from the file
     * @return True if the line was read, false otherwise.
     * @throws IOException
     */
    public boolean readNextLine() throws IOException{
        boolean lineRead; //Flag variable

        //Determine whether there is more to read
        lineRead = inputFile.hasNext();

        //If so, read the next line
        if(lineRead)
            line = inputFile.nextLine();

        return lineRead;
    }

    public double getAverage(){
        int total = 0; //Accumulator
        double average; // The average test score


        //Tokenize the last line read from the file
        String[] tokens = line.split(",");

        //Calculate the total of the test scores
        for(String str : tokens){
            total += Integer.parseInt(str);
        }

        /*Calculate teh average of the scores
        Use a cast to avoid integer division.
         */
        average = (double) total / tokens.length;

        //Return the average
        return average;
    }

    public void close() throws IOException
    {
        inputFile.close();
    }


}
