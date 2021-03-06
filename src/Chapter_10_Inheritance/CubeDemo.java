package Chapter_10_Inheritance;

import java.util.Scanner;

/**
 * @author Christian Aguirre
 */
public class CubeDemo {
    public static void main(String[] args){

        double length;
        double width;
        double height;

        //Create a scanner
        Scanner keyboard = new Scanner(System.in);

        //Get cube's length
        System.out.println("Enter the following dimensions of a cube:");

        System.out.print("Length: ");
        length = keyboard.nextDouble();

        //Get the cube's width
        System.out.print("Width: ");
        width = keyboard.nextDouble();

        //Get the cube's height
        System.out.print("Height: ");
        height = keyboard.nextDouble();

        //Create a cube object and pass the
        //dimensions to the constructor
        Cube myCube = new Cube(length, width, height);

        //Displayu the cube's properties
        System.out.println("Here are the cube's properties");

        System.out.println("Length: " + myCube.getLength());
        System.out.println("Width: " + myCube.getWidth());
        System.out.println("Height: " + myCube.getHeight());
        System.out.println("Base Area: " + myCube.getArea());
        System.out.println("Surface Area: " + myCube.getSurfaceArea());
        System.out.println("Volume: " + myCube.getVolume());
    }
}
