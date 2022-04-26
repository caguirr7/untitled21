package Chapter_9_Character_Testing;

import java.util.Scanner;

/**
 * @author Christian Aguirre
 */
public class WordCounter {
    public static void main(String[] args){

        String str;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any sentence");
        str = input.nextLine();

        WordCounter test = new WordCounter();

        test.wordCounter(str);


    }

    public void wordCounter(String str){

        String[] wordArray = str.trim().split("\\s+");
        int wordCount = wordArray.length;

        System.out.println("Word count is " + wordCount);
    }
}
