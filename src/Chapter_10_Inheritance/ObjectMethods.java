package Chapter_10_Inheritance;

/**
 * @author Christian Aguirre
 */
public class ObjectMethods {
    public static void main(String[] args){
        //Create two objects
        PassFailExam exam1 = new PassFailExam(0, 0, 0);
        PassFailExam exam2 = new PassFailExam(0, 0, 0);

        //Send the objects to println, which
        //will call the toString method
        System.out.println(exam1);
        System.out.println(exam2);

        //Test the equals method
        if(exam1.equals(exam2))
            System.out.println("They are the same.");
        else
            System.out.println("They are not the same.");
    }
}
