package Chapter_10_Inheritance;

/**
 * @author Christian Aguirre
 */
public class FinalExam2 extends GradedActivity2 {
    private int numQuestions; //Number of questions
    private double pointsEach; //Points for each question
    private int numMissed; //Number of questions missed

    public FinalExam2(int numQuestions, int numMissed){

        double numericScore; //To hold a numeric score

        //Set the numQuestions and numMissed fields
        this.numMissed = numMissed;
        this.numQuestions = numQuestions;

        //Calculate the points for each question and
        //the numeric score for this exam
        pointsEach = 100.0 / numQuestions;
        numericScore = 100.0 - (numMissed * pointsEach);

        //Call the inherited setScore method to
        //set the numeric score
        setScore(numericScore);

        //Adjust the score
        adjustScore();

    }

    /**
     * The getPointsEach method returns the number of
     * points each question is worth
     * @return The value in the pointsEach field
     */
    public double getPointsEach(){
        return pointsEach;
    }

    /**
     * The getNumMissed method returns the number of
     * questions missed.
     * @return The value in the numMissed field.
     */
    public int getNumMissed(){
        return numMissed;
    }

    private void adjustScore(){
        double fraction;

        //Get the fractional part of the score
        fraction = score - (int) score;

        //If the fractional part is .5 or greater,
        //round the score up to the next whole number
        if(score >= 0.5)
            score = score + (1.0 - fraction);
    }
}
