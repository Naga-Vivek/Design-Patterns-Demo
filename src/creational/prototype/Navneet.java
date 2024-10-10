package creational.prototype;

// Child class: Navneet
public class Navneet extends Notebook {

    private String coverType;

    // Constructor for Navneet
    public Navneet(int numberOfPages, String paperQuality, String coverType ) {
        // Calling the parent constructor
        super("Navneet",numberOfPages, paperQuality ,"A4" );
        this.coverType = coverType;
    }

    // Getter and Setter for coverType
    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", coverType='" + coverType + '\'' +
                '}';
    }
}
