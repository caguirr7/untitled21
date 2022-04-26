package Chapter_10_Inheritance;

/**
 * @author Christian Aguirre
 */
public class PassFailActivity extends GradedActivity {
    private double minPassingScore;


    /**
     * The constructor sets the minimum passing score
     * @param mps The minimum passing score
     */
    public PassFailActivity(double mps){
        minPassingScore = mps;
    }

    @Override
    public char getGrade(){
        char letterGrade;

        if(super.getScore() >= minPassingScore)
            letterGrade = 'P';
        else
            letterGrade = 'F';

        return letterGrade;
    }

}
