package Chapter_10_Inheritance;

/**
 * @author Christian Aguirre
 */
public class ShowValueDemo {
    public static void main(String[] args){
        //Create a SubClass3 object
        SubClass3 myObject = new SubClass3();

        myObject.showValue(10); //Pass an int
        myObject.showValue(1.2); //Pass a double
        myObject.showValue("Hello"); //Pass a string
    }
}
