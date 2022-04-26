package Chapter_10_Inheritance;

/**
 * @author Christian Aguirre
 */
public class TestCalculator {
    public static void main(String[] args){

        IntCalculator square = new IntCalculator() {
            @Override
            public int calculate(int number) {
                return number * number;
            }
        };

        System.out.println(square.calculate(2));
    }
}
