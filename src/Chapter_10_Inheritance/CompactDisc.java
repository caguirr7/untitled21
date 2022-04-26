package Chapter_10_Inheritance;

/**
 * @author Christian Aguirre
 */
public class CompactDisc implements RetailItem {
    private String title; //The CD's title
    private String artist; //The CD's artist
    private double retailPrice; //The CD's retail price


    /**
     * Constructor
     * @param title The CD Title
     * @param artist The name of the artist
     * @param retailPrice The CD's price
     */
    public CompactDisc(String title, String artist, double retailPrice){

        this.title = title;
        this.artist = artist;
        this.retailPrice = retailPrice;
    }

    /**
     * getTitle method
     * @return The CD's title
     */
    public String getTitle(){
        return title;
    }

    /**
     * getArtist method
     * @return The name of the artist
     */
    public String getArtist(){
        return artist;
    }

    /**
     * getRetailPrice method(Required by the RetailItem interface)
     * @return The retail price of a CD
     */
    public double getRetailPrice() {
        return retailPrice;
    }
}
