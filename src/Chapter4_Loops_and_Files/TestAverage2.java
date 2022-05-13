package Chapter4_Loops_and_Files;

import java.util.Scanner;

/**
 * @author Christian Aguirre
 */
public class TestAverage2 {
    public static void main(String[] args) {

        int numStudents, //Number of students
            numTests, //Number of tests per student
            score, // Test score
            total; //Accumulator for test score
        double average; // Average test score

        //Create a scanner
        Scanner input = new Scanner(System.in);

        //Get the number of students
        System.out.println("How many students do you have? ");
        numStudents = input.nextInt();


        //Get the number of test scores per students
        System.out.println("How many test scores per student? ");
        numTests = input.nextInt();


        //Process all the students
        for(int student = 1; student <= numStudents; student++){
            total = 0; //Set the accumulator

            //Get the test scores for a student
            System.out.println("Student number " + student);
            System.out.println("-----------------------------");
            for(int test = 1; test <= numTests; test++){
                System.out.println("Enter score " + test + ": ");
                score = input.nextInt();
                total += score; //Add score to total
            }

            //Calculate and display the average
            average = total / numTests;

            System.out.printf("The average for student %d is %.1f.\n\n", student, average);
        }
    }
}
