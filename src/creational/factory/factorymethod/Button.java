package creational.factory.factorymethod;

public abstract class Button {
    private String label;
    private String color;
    private int width;
    private int height;
    private boolean isEnabled;

    // Constructor
    public Button(String label, String color, int width, int height, boolean isEnabled) {
        this.label = label;
        this.color = color;
        this.width = width;
        this.height = height;
        this.isEnabled = isEnabled;
    }

    // Getters and Setters
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    // Abstract method to render the button (to be implemented by child classes)
    public abstract void render();

    // Method to simulate a button click
    public void click() {
        if (isEnabled) {
            System.out.println(label + " button clicked!");
        } else {
            System.out.println(label + " button is disabled.");
        }
    }
}
