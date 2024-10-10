package creational.prototype;

// Base class: Notebook
public class Notebook implements Cloneable{
    private String brand;
    private String size;
    private int numberOfPages;
    private String paperQuality;

    // Constructor for Notebook
    public Notebook(String brand, int numberOfPages, String paperQuality,String size) {
        this.brand = brand;
        this.numberOfPages = numberOfPages;
        this.paperQuality = paperQuality;
        this.size = size;
    }

    // Getter and Setter methods
    public String getBrand() {
        return brand;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getPaperQuality() {
        return paperQuality;
    }

    public void setPaperQuality(String paperQuality) {
        this.paperQuality = paperQuality;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "brand='" + brand + '\'' +
                ", size='" + size + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", paperQuality='" + paperQuality + '\'' ;
    }

    @Override
    public Notebook clone() {
        try {
            Notebook clone = (Notebook) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
