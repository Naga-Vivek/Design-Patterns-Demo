package creational.prototype;


public class NotebookPrototypeClient {
    public static void main(String[] args) {
        NotebookRegistry registry = new NotebookRegistry();

        Classmate classmatePrototype = new Classmate(200,"80GSM" ,true);
        Navneet navneetPrototype = new Navneet(200 , "68GSM" ,"Soft Cover" );

        // Register prototypes with a key
        registry.registerNotebook("classmate", classmatePrototype);
        registry.registerNotebook("navneet", navneetPrototype);

        System.out.println("-------------Original Prototypes-----------");
        System.out.println(classmatePrototype);
        System.out.println(navneetPrototype);


        System.out.println("-------------Cloning Prototypes------------");
        try {
            // Retrieve clones of the prototypes
            Notebook classmateCopy = registry.getNotebook("classmate");
            Notebook navneetCopy = registry.getNotebook("navneet");

            // Modifying the cloned copy doesn't affect the prototype
            classmateCopy.setNumberOfPages(300);
            classmateCopy.setPaperQuality("90GSM");
            navneetCopy.setNumberOfPages(300);
            navneetCopy.setPaperQuality("85GSM");
            System.out.println(classmateCopy);
            System.out.println(navneetCopy);

            System.out.println("-------------Cloning again------------");
            Classmate classmateCopy2 = (Classmate) registry.getNotebook("classmate");
            Navneet navneetCopy2 = (Navneet) registry.getNotebook("navneet");
            classmateCopy2.setNumberOfPages(150);
            classmateCopy2.setPaperQuality("70GSM");
            classmateCopy2.setEcoFriendly(false);
            navneetCopy2.setNumberOfPages(150);
            navneetCopy2.setPaperQuality("67GSM");
            navneetCopy2.setCoverType("Hard Cover");
            System.out.println(classmateCopy2);
            System.out.println(navneetCopy2);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

