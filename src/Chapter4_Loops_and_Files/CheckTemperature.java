package Chapter4_Loops_and_Files;

import java.util.Scanner;

/**
 * @author Christian Aguirre
 */
public class CheckTemperature {
    public static void main(String[] args) {
        final double MAX_TEMP = 102.5; //Maximum temperature
        double temperature; //To hold the temperature

        //Create a scanner object for keyboard input
        Scanner input = new Scanner(System.in);

        //Get the current temperature
        System.out.println("Enter the substance's Celsius temperature: ");
        temperature = input.nextDouble();


        //As long as necessary, instruct the technician to adjust the temperature
        while(temperature > MAX_TEMP){
            System.out.println("The temperature is too high. Turen the");
            System.out.println("thermostat down and wait 5 minutes");
            System.out.println("Then, take the Celsius temperature again");
            temperature = input.nextDouble();
        }


        //Remind the technician to check the temperature again in 15 minutes
        System.out.println("The temperature is acceptable");
        System.out.println("Check it again in 15 minutes");
    }
}
