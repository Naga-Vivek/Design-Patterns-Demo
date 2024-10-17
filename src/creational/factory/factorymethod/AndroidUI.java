package creational.factory.factorymethod;

public class AndroidUI implements  UserInterface{

    @Override
    public Button createButton(String label, String color, int width, int height, boolean isEnabled, String style) {
        return new AndroidButton(label, color, width, height, isEnabled, "android "+style);
    }
}
