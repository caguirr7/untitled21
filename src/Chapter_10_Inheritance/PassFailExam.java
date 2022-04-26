package Chapter_10_Inheritance;

/**
 * @author Christian Aguirre
 */
public class PassFailExam extends PassFailActivity{

   private int numQuestions;
   private double pointsEach;
   private int numMissed;

   public PassFailExam(int numQuestions, int numMissed, double minPassing){
       //Call the superclass constructor
       super(minPassing);

       //Declare a local variable for the score
       double numericScore;

       //Set the numQuestions and numMissed fields
       this.numQuestions = numQuestions;
       this.numMissed = numMissed;

       //Calculate the points for each question and
       //the numeric score for this exam
       pointsEach = 100.0 / numQuestions;
       numericScore = 100.0 - (numMissed * pointsEach);

       //Call the superclass's setScore method to
       //set the numeric score
       setScore(numericScore);

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
     * questions missed
     * @return The value in the numMissed field
     */
   public int getNumMissed(){
       return numMissed;
   }

}
