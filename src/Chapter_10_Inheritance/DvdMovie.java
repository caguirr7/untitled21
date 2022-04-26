package Chapter_10_Inheritance;

/**
 * @author Christian Aguirre
 */
public class DvdMovie implements RetailItem {
    private String title; //The DVD's title
    private int runningTime; //Running time in minutes
    private double retailPrice; //The DVD's retail price

    /**
     * Constructor
     * @param title The DVD title
     * @param runningTime The running time in minutes
     * @param retailPrice The DVD's price
     */
    public DvdMovie(String title, int runningTime, double retailPrice){
        this.title = title;
        this.runningTime = runningTime;
        this.retailPrice = retailPrice;

    }

    /**
     * getTitle method
     * @return The DVD's title
     */
    public String getTitle() {
        return title;
    }

    /**
     * getRunningTime method
     * @return The running time in minutes
     */
    public int getRunningTime() {
        return runningTime;
    }

    /**
     * getRetailPrice method(Required by the RetailItem interface)
     * @return The retail price of the DVD
     */
    public double getRetailPrice() {
        return retailPrice;
    }
}
