import java.io.*;

class Sample {
	int a;
	Sample(){}
	Sample(int x){	
		a=x;
		
		System.out.println("The value passed is :"+x);
	}
	
	public int getValue() {
		return a;
	}
	
	public void setValue(int y) {
		System.out.println("The value to set is :"+y);
		
		
	}
}
public class SampleClass {

	public static void main(String[] args) {

		int d;
		
		Sample s=new Sample(22); //creation of an object for class Sample
		
		System.out.println("The value of variable accessed is :"+s.a); //accessing a variable of class Sample using its object
		
		s.setValue(10); //accessing a method of class Sample

		d=s.getValue();
		
		System.out.println("The value received is :"+d);
	}

}
