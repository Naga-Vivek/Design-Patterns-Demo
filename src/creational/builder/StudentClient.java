package creational.builder;

public class StudentClient {
    public static void main(String[] args) {
        StudentBuilder sb = new StudentBuilder();
        sb.setId(1);
        sb.setAge(25);
        sb.setName("Ajay");
        sb.setBatchId(1);
        sb.setCollegeName("NIT");
        sb.setPsp(98.0);
        sb.setGradYear(2020);
        sb.setPhoneNumber("+91 6999999999");
        Student st = new Student(sb);

        System.out.println(st);

        StudentBuilder sb1 = new StudentBuilder();
        sb1.setId(2);
        sb1.setAge(22);
        sb1.setName("Santhosh");
        sb1.setBatchId(1);
        sb1.setCollegeName("IIT");
        sb1.setPsp(93.4);
        sb1.setGradYear(2020);
        sb1.setPhoneNumber("91 9999998888");
        Student st1 = new Student(sb1);

        System.out.println(st1);


    }
}
