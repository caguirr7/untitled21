package Chapter_10_Inheritance;

import java.util.Scanner;

/**
 * @author Christian Aguirre
 */
public class CurvedActivityDemo {
    public static void main(String[] args){

        double score; //Raw score
        double curvePercent; //Curve percentage


        //Create a scanner
        Scanner keyboard = new Scanner(System.in);

        //Get the unadjusted exam score
        System.out.print("Enter the student's raw numeric score: ");

        score = keyboard.nextDouble();

        //Get the curve percentage
        System.out.print("Enter the curve percentage: ");
        curvePercent = keyboard.nextDouble();

        //Create a CurvedActivity object
        CurvedActivity curvedExam = new CurvedActivity(curvePercent);

        //set the exam score
        curvedExam.setScore(score);

        //Display the raw score
        System.out.println("The raw score is " + curvedExam.getRawScore() + " points.");

        //Display the curved score
        System.out.println("The curved score is " + curvedExam.getScore());

        //Display the exam grade
        System.out.println("The exam grade is " + curvedExam.getGrade());
    }
}
