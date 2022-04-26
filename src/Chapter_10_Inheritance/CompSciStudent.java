package Chapter_10_Inheritance;

/**
 * @author Christian Aguirre
 */
public class CompSciStudent extends Student{

    //Required hours
    private final int MATH_HOURS = 20; //Math hours
    private final int CS_HOURS = 40; //Comp sci hours
    private final int GEN_ED_HOURS = 60; //Gen ed hours

    //Hours taken
    private int mathHours; // Math hours taken
    private int csHours; //Comp sci hours taken
    private int genEdHours; //General ed hours taken


    /**
     * The Constructor sets the student's name,
     * ID numebr, and the year admitted
     * @param n The student's name
     * @param id The student's ID number
     * @param year The year the student was admitted
     */
    public CompSciStudent(String n, String id, int year){
        super(n, id, year);
    }

    /**
     * The setMathHours method sets the numebr of math hours takne
     * @param math The math hours taken.
     */
    public void setMathHours(int math){
        mathHours = math;
    }

    /**
     * The setCsHours method sets the number of
     * computer science hours taken
     * @param csHours The computer science hours taken
     */
    public void setCsHours(int csHours) {
        this.csHours = csHours;
    }

    /**
     * The setGenEdHours method sets the number of
     * general ed hours taken.
     * @param genEdHours The general ed hours taken
     */

    public void setGenEdHours(int genEdHours) {
        this.genEdHours = genEdHours;
    }

    /**
     * The getRemainingHours method returns the
     * number of hours remaining to be taken.
     * @return The hours remaining for the student
     */
    @Override
    public int getRemainngHours() {
        int reqHours; //Total required hours
        int remainingHours = 0; //Remaining hours

        //Calculate the required hours.
        reqHours = MATH_HOURS + CS_HOURS + GEN_ED_HOURS;

        //Calculate the remaining hours
        remainingHours = reqHours - (mathHours + csHours + genEdHours);

        return remainingHours;


    }

    public String toString(){
        String str;

        str = super.toString() +
                "\nMajor: Computer Science" +
                "\nMath Hours Taken: " + mathHours +
                "\nComputer Science Hours Taken: " +csHours +
                "\nGeneral Ed Hours Taken: " +genEdHours;

        return str;
    }

}
