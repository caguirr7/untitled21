package Chapter_9_Character_Testing;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author Christian Aguirre
 */
public class PersonSearch {
    public static void main(String[] args){
        String lookup; //To hold a lookup string

        //Create an array of names
        String[] people = {"Cutshaw, Will", "Davis, George",
                           "Davis, Jenny", "Russert, Phil",
                            "Russell, Cindy", "Setzer, Charles",
                            "Smathers, Holly", "Smith, Chris",
                           "Smith, Brad", "Williams, Jean"};

        //Create a scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        //Get a partial name to search for
        System.out.print("Enter the first few characters of the last name to look up: ");

        lookup = keyboard.nextLine();

        lookup = lookup.substring(0,1).toUpperCase() + lookup.substring(1);

        //Display all of the names that begin with the string entered by the user
        System.out.println("Here are the names that match:");
        for(String person : people){
            if(person.startsWith(lookup))
                System.out.println(person);
        }
    }
}
