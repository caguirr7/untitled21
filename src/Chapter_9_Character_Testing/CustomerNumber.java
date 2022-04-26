package Chapter_9_Character_Testing;

import javax.swing.*;

/**
 * @author Christian Aguirre
 */
public class CustomerNumber {
    public static void main(String[] args){

        //Get a customer number
        String input; // To hold the user's input

        input = JOptionPane.showInputDialog("Enter a customer number in the form LLLNNNN\n" +
                "(LLL = letters and NNNN = numbers)");

        //Validate the input
        if(isValid(input)){
            JOptionPane.showMessageDialog(null, "That's a valid customer number");
        }
        else{
            JOptionPane.showMessageDialog(null, "That is not the proper format of a " +
                    "customer number.\nHere is an example: ABC1234");
        }

        System.exit(0);
    }


    private static boolean isValid(String customerNumber){

        boolean goodSoFar = true; //Flag
        int i = 0; //Control variable

        //Test the length
        if(customerNumber.length() != 7)
            goodSoFar = false;

        //Test the first three character for letters.
        while(goodSoFar && i < 3){
            if(!Character.isLetter(customerNumber.charAt(i)))
                goodSoFar = false;
            i++;
        }

        //Test the last four characters for digits
        while(goodSoFar && i < 7){
            if(!Character.isDigit(customerNumber.charAt(i)))
                goodSoFar = false;
            i++;
        }
        return goodSoFar;
    }
}
