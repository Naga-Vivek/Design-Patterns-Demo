package creational.factory.factorymethod;

public class IOSUI implements UserInterface{

    @Override
    public Button createButton(String label, String color, int width, int height, boolean isEnabled, String style) {
        return new IOSButton(label, color, width, height, isEnabled, "ios "+style);
    }
}
