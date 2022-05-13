package Chapter4_Loops_and_Files;

import java.util.Scanner;

/**
 * @author Christian Aguirre
 */
public class SumOfNumbers {
    public static void main(String[] args) {

        formula();

        int num = 50;
        int sum = 0;

        for (int i = 1; i <= num; ++i) {
            sum += i;
        }
        System.out.println("Sum is " + sum);
    }

    public static void formula() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of integers");
        int n = input.nextInt();
        System.out.println("Enter first term");
        int a = input.nextInt();
        System.out.println("Enter last term");
        int l = input.nextInt();
        int s;

        s = (n * (a + l)) / 2;

       System.out.println(s);


    }
}




