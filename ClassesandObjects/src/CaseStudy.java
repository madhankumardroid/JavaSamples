import java.io.*;
class PersonalDetail {
    private String name;
    private int age;
    private long mobileNo;
    private String location;

    PersonalDetail(String personName) {  //Constructor with parameters
        name = personName;
    }

    void setAge(int persAge) {
        age = persAge; //assign persAge to age
    }

    void setMobile(long persMobile) {
        mobileNo = persMobile; //assign persMobile to mobileNo
    }

    public void setLocation(String persLoc) {
        location = persLoc; //assign persLoc to location
    }

    void printDetail() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Mobile Number : " + mobileNo);
        System.out.println("Location : " + location);
    }
}

public class CaseStudy {
    public static void main(String[] args) {
        //creating objects using constructors
        PersonalDetail perOne = new PersonalDetail("Madhan Kumar S");
        PersonalDetail perTwo = new PersonalDetail("Joe");

        //calling methods using objects created
        perOne.setAge(20);
        perTwo.setAge(22);

        perOne.setMobile(9000000000L);
        perTwo.setMobile(8000000000L);

        perOne.setLocation("Karur");
        perTwo.setLocation("Chennai");

        perOne.printDetail();
        perTwo.printDetail();
    }
}
