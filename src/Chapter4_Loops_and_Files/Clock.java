package Chapter4_Loops_and_Files;

/**
 * @author Christian Aguirre
 */
public class Clock {
    public static void main(String[] args) {
        //Simulate the clock
        for(int hours = 1; hours <= 24; hours++){
            for (int minutes = 0; minutes <= 59; minutes++){
                for(int seconds = 0; seconds <= 59; seconds++){
                    System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
                }
            }
        }
    }
}
