import java.io.*;
class PersonalDetail {
String name;
int age;
long mobileno;
String location;

public PersonalDetail(String persName) {  //Constructor with parameters
	
	name=persName;

}

public void setAge(int persAge) {
	
	age=persAge; //assign persAge to age
	
}

public void setMobile(long persMobile) {
	
	mobileno=persMobile; //assign persMobile to mobileno
	
}

public void setLocation(String persLoc) {
	
	location=persLoc; //assign persLoc to location
	
}

public void printDetail() {
	System.out.println("Name : "+name);
	System.out.println("Age : "+age);
	System.out.println("Mobile Number : "+mobileno);
	System.out.println("Location : "+location);
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
