package Chapter4_Loops_and_Files;

/**
 * @author Christian Aguirre
 */
public class Squares {
    public static void main(String[] args) {
        int number; // Loop control variable

        System.out.println("Number Number Squared");
        System.out.println("-------------------------");

        for(number = 1; number <=100; number++){
            System.out.println(number + "\t\t\t" + number * number* number);
        }
    }
}
