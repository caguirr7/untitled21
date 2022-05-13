package Chapter4_Loops_and_Files;

/**
 * @author Christian Aguirre
 */
public class Series {
    public static void main(String[] args) {

        double count = 30;
        double sum = 0;

        for(int i = 1; i <=30; i++){
            sum = sum +i/count;

            count--;
            System.out.println(sum);
        }
    }
}
