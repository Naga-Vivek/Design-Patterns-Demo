package creational.factory.factorymethod;

public class UserInterfaceClient {
    public static void main(String[] args) {
        UserInterface ui1 = new IOSUI();
        Button submit = ui1.createButton("Submit" , "Blue" , 150 , 50 , true , "rounded");
        submit.render();
        submit.click();
        System.out.println();
        UserInterface ui2 = new AndroidUI();
        Button cancel = ui2.createButton("Cancel" , "Black" , 120 , 40 , false , "flat");
        cancel.render();
        cancel.click();
    }
}
