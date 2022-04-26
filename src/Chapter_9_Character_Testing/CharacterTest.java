package Chapter_9_Character_Testing;

import javax.swing.*;

/**
 * @author Christian Aguirre
 */
public class CharacterTest {
    public static void main(String[] args){

        String input; // To hold the user's input
        char ch; //To hold a single character

        //Get the character from the user and store
        //it in the ch variable

        input = JOptionPane.showInputDialog("Enter any single character.");

        ch = input.charAt(0);

        //Test the character);
        if(Character.isLetter(ch)){
            JOptionPane.showMessageDialog(null, "That is a letter");
        }
        if(Character.isDigit(ch)){
            JOptionPane.showMessageDialog(null, "This is a digit");

        }
        if(Character.isLowerCase(ch)){
            JOptionPane.showMessageDialog(null, "This is a lowercase letter");

        }
        if(Character.isUpperCase(ch)){
            JOptionPane.showMessageDialog(null, "This is an upppercase letter");

        }
        if(Character.isSpaceChar(ch)){
            JOptionPane.showMessageDialog(null, "This is a space");

        }
        if(Character.isWhitespace(ch)){
            JOptionPane.showMessageDialog(null, "This is an whitespace character");

        }

        System.exit(0);
    }
}
