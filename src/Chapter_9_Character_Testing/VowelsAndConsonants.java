package Chapter_9_Character_Testing;

import java.util.Scanner;

/**
 * @author Christian Aguirre
 */
public class VowelsAndConsonants {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int choice;
        String str;
        System.out.println("Enter a string sentence");
        str = input.nextLine();
        System.out.println("1) Make a choice of what you want to do\n"
                + "2) Count the number of vowels in the string\n" +
                "3) Count the number of consonants in the string\n" +
                "4) Count both the vowels and consonants in the string\n" +
                "5) Enter another string\n" +
                "6)Exit the program\n");

        VowelsAndConsonants test = new VowelsAndConsonants();
        test.countVowels(str);
        test.countConsonants(str);



    }

    public void countVowels(String str){
        int count = 0;

        for(int i =0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch =='i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                count++;
            }
        }
        System.out.println("Number of vowels is " + count);

    }

    public void countConsonants(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch =='i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                System.out.print("");
            }
            else if(ch != ' '){
                count++;
            }
        }
        System.out.println("Number of consonants is " + count);
    }



    }

