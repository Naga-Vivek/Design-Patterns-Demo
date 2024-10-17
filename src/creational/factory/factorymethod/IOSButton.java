package creational.factory.factorymethod;

public class IOSButton extends Button {
    private String iosStyle;

    // Constructor
    public IOSButton(String label, String color, int width, int height, boolean isEnabled, String iosStyle) {
        super(label, color, width, height, isEnabled);
        this.iosStyle = iosStyle;
    }

    // Getter and Setter for iosStyle
    public String getIosStyle() {
        return iosStyle;
    }

    public void setIosStyle(String iosStyle) {
        this.iosStyle = iosStyle;
    }

    // Implement the render method specific to iOS
    @Override
    public void render() {
        System.out.println("Rendering an iOS button:");
        System.out.println("Label: " + getLabel());
        System.out.println("Color: " + getColor());
        System.out.println("Width: " + getWidth() + "px");
        System.out.println("Height: " + getHeight() + "px");
        System.out.println("Style: " + iosStyle);
        System.out.println("Enabled: " + isEnabled());
    }
}
