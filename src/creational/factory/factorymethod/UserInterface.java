package creational.factory.factorymethod;

public interface UserInterface {
    // Factory Method
    public Button createButton(String label , String color , int width , int height , boolean isEnabled , String style);
}
