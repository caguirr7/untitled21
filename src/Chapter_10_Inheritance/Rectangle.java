package Chapter_10_Inheritance;

/**
 * @author Christian Aguirre
 */
public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double len, double w){
        length = len;
        width = w;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    public double getArea(){
        return length * width;
    }
}
