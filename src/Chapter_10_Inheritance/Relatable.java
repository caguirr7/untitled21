package Chapter_10_Inheritance;

/**
 * @author Christian Aguirre
 */
public interface Relatable {
    boolean equals(GradedActivity g);
    boolean isGreater(GradedActivity g);
    boolean isLess(GradedActivity g);
}
