package Chapter_9_Character_Testing;

/**
 * @author Christian Aguirre
 */
public class BackwardString {
    public static void main(String[] args){

        BackwardString test = new BackwardString();

        test.reverseWordInMyString("gravity");
        test.reverseWordInMyString("testing with spaces");

    }


   public void reverseWordInMyString(String str){

        String[] words = str.split(" ");
        StringBuilder reversedString = new StringBuilder();

       for (String word : words) {
           StringBuilder reverseWord = new StringBuilder();

           for (int j = word.length() - 1; j >= 0; j--) {
               reverseWord.append(word.charAt(j));
           }
           reversedString.append(reverseWord).append(" ");

       }

       System.out.println(str);
       System.out.println(reversedString);
   }
}
