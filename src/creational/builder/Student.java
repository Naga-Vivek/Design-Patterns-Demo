package creational.builder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Student {
    private int id;
    private String name;
    private int age;
    private double psp;
    private int batchId;
    private String collegeName;
    private int gradYear;
    private String phoneNumber;
    // Regular expression for Indian mobile number
    private static final String INDIAN_MOBILE_REGEX = "^(\\+91\\s|91\\s)?[6-9][0-9]{9}$";

    Student(StudentBuilder builder) {
        //validations
        /*
        1. Phone Number should start with +91 and a 10-digit number
        2. Age should be more than 21
        3. Grad year to be 2020
        4. College name should be valid

         */
        this.id = builder.getId();
        this.name = builder.getName();
        if(builder.getAge() >= 21){
            this.age = builder.getAge();
        }
        else{
            throw new IllegalArgumentException("Age must be greater than 20");
        }
        this.psp = builder.getPsp();
        this.batchId = builder.getBatchId();
        if(isValidCollegeName(builder.getCollegeName())){
            this.collegeName = builder.getCollegeName();
        }
        else{
            throw new IllegalArgumentException("College name is invalid : "+builder.getCollegeName());
        }
        if(builder.getGradYear() == 2020){
            this.gradYear = builder.getGradYear();
        }
        else{
            throw new IllegalArgumentException("Grad Year must be 2020");
        }
        this.gradYear = builder.getGradYear();
        if(isValidIndianMobileNumber(builder.getPhoneNumber())){
            this.phoneNumber = builder.getPhoneNumber();
        }
        else{
            throw new IllegalArgumentException("Phone number is invalid : "+builder.getPhoneNumber());
        }
    }

    private boolean isValidCollegeName(String collegeName) {
        for(Colleges college: Colleges.values()){
            if(college.name().equalsIgnoreCase(collegeName)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", psp=" + psp +
                ", batchId=" + batchId +
                ", collegeName='" + collegeName + '\'' +
                ", gradYear=" + gradYear +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
    // Method to validate the mobile number
    public static boolean isValidIndianMobileNumber(String mobileNumber) {
        // Compile the regex
        Pattern pattern = Pattern.compile(INDIAN_MOBILE_REGEX);
        Matcher matcher = pattern.matcher(mobileNumber);

        // Check if the number matches the pattern
        return matcher.matches();
    }
}
