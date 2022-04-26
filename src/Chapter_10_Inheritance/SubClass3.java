package Chapter_10_Inheritance;

/**
 * @author Christian Aguirre
 */
public class SubClass3 extends SuperClass3 {


    public void showValue(int arg){
        System.out.println("SUBCLSS: The int argument was " + arg);
    }

    public void showValue(double arg){
        System.out.println("SUBCLASS: The double argument was " + arg);
    }
}
