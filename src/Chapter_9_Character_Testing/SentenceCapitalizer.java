package Chapter_9_Character_Testing;

import java.util.Scanner;

/**
 * @author Christian Aguirre
 */
public class SentenceCapitalizer {
    public static void main(String[] args){
        SentenceCapitalizer test = new SentenceCapitalizer();

        String str;
        Scanner input = new Scanner(System.in);

        str = input.nextLine();

        test.sentenceCapitalizer(str);

    }

    public void sentenceCapitalizer(String str){

        int pos = 0;
        boolean capitalize = true;
        StringBuilder sb = new StringBuilder(str);
        while(pos < sb.length()){
            if(sb.charAt(pos) == '.'){
                capitalize = true;
            }else if(capitalize && !Character.isWhitespace(sb.charAt(pos))){
                sb.setCharAt(pos, Character.toUpperCase(sb.charAt(pos)));
                capitalize = false;
            }

            pos++;

        }

        System.out.println(sb);
    }

}
