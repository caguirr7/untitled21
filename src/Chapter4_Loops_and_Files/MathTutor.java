package Chapter4_Loops_and_Files;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Christian Aguirre
 */
public class MathTutor {
    public static void main(String[] args) {
        int number1 ; // A number
        int number2;  //Another number
        int sum; // The sum of the numbers
        int userAnswer; // The user's answer


        //Create a scanner
        Scanner input = new Scanner(System.in);

        //Create a random class object
        Random randomNumbers = new Random();

        //Get two random numbers
        number1 = randomNumbers.nextInt(100);
        number2 = randomNumbers.nextInt(100);

        //Display an addition problem
        System.out.println("What is the answer to the following problem?");
        System.out.println(number1 + " + " + number2 + " =? ");


        //Calculate the answer
        sum = number1 + number2;

        //Get the user's answer
        userAnswer = input.nextInt();

        //Display the user's result
        if(userAnswer == sum)
            System.out.println("Correct!");
        else{
            System.out.println("Sorry, wrong answer. The correct answer is " + sum);
        }
    }
}
