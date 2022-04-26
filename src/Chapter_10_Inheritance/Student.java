package Chapter_10_Inheritance;

/**
 * @author Christian Aguirre
 */
public abstract class Student {
    private String name;
    private String idNumber;
    private int yearAdmitted;

    /**
     * The constructor sets the student's name,
     * ID number, and year admitted.
     * @param name The student's name
     * @param idNumber The student's ID number
     * @param yearAdmitted The year the student was admitted
     */
    public Student(String name, String idNumber, int yearAdmitted){
        this.name = name;
        this.idNumber = idNumber;
        this.yearAdmitted = yearAdmitted;

    }

    /**
     * The toString method returns a String containing
     * the student's data
     * @return A refernce to a String
     */
    public String toString(){
        String str;

        str = "Name: " + name
                + "\nID Number: " + idNumber
                + "\nYear Admitted: " +yearAdmitted;

        return str;
    }

    public abstract int getRemainngHours();
}
