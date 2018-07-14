class DefConstructor {
	public DefConstructor () { //default constructor
		System.out.println("This is my default constructor");
	}
	
	public DefConstructor(int number) { //parameterized constructor
		System.out.println("I can calculate the square of : " + number + " and my result is :" +number*number);
	}
}

class ChainedConstructor {
	
	public ChainedConstructor() {
		System.out.println("I am default for ChainedConstructor");
	}
	
	public ChainedConstructor(int value) {		
		this();		
		System.out.println("The value is :" +value);
	}
	
	public ChainedConstructor(int value1, int value2) {
		this(value1);		
		System.out.println("The multiplied value is :"+ value1*value2);
	}
}

public class MyConstructors {
	public static void main(String []args) {
	new DefConstructor(); 
	new DefConstructor(342);
	new ChainedConstructor(90,100);
	}
}
