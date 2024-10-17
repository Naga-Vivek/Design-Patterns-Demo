package creational.factory.factorymethod;

public class AndroidButton extends Button {
    private String androidStyle;

    // Constructor
    public AndroidButton(String label, String color, int width, int height, boolean isEnabled, String androidStyle) {
        super(label, color, width, height, isEnabled);
        this.androidStyle = androidStyle;
    }

    // Getter and Setter for androidStyle
    public String getAndroidStyle() {
        return androidStyle;
    }

    public void setAndroidStyle(String androidStyle) {
        this.androidStyle = androidStyle;
    }

    // Implement the render method specific to Android
    @Override
    public void render() {
        System.out.println("Rendering an Android button:");
        System.out.println("Label: " + getLabel());
        System.out.println("Color: " + getColor());
        System.out.println("Width: " + getWidth() + "px");
        System.out.println("Height: " + getHeight() + "px");
        System.out.println("Style: " + androidStyle);
        System.out.println("Enabled: " + isEnabled());
    }
}
