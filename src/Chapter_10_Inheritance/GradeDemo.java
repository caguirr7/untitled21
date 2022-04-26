package Chapter_10_Inheritance;

import javax.swing.*;

/**
 * @author Christian Aguirre
 */
public class GradeDemo {
    public static void main(String[] args){

        String input; //To hold input
        double testScore; // A test score


        GradedActivity grade = new GradedActivity();

        //Get a test score
        input = JOptionPane.showInputDialog("Enter a numeric test score.");
        testScore = Double.parseDouble(input);

        //Score the score in the grade object
        grade.setScore(testScore);

        //Display the letter grade for the score
        JOptionPane.showMessageDialog(null,
                "The grade for that test is " + grade.getGrade());

        System.exit(0);
    }
}
