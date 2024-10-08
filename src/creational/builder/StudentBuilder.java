package creational.builder;

public class StudentBuilder {
    private int id;
    private String name;
    private int age;
    private double psp;
    private int batchId;
    private String collegeName;
    private int gradYear;
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public double getPsp() {
        return psp;
    }

    public int getBatchId() {
        return batchId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public int getGradYear() {
        return gradYear;
    }
}
