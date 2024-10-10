package creational.prototype;

// Child class: Classmate
public class Classmate extends Notebook {

    private boolean ecoFriendly;

    // Constructor for Classmate
    public Classmate(int numberOfPages, String paperQuality, boolean ecoFriendly ) {
        // Calling the parent constructor
        super("Classmate", numberOfPages, paperQuality, "A5" );
        this.ecoFriendly = ecoFriendly;
    }

    // Getter and Setter for ecoFriendly
    public boolean isEcoFriendly() {
        return ecoFriendly;
    }

    public void setEcoFriendly(boolean ecoFriendly) {
        this.ecoFriendly = ecoFriendly;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", ecoFriendly=" + (ecoFriendly ?"yes":"no") +
                '}';
    }
}
