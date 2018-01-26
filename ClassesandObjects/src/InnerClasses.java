class MyStaticClass { //static inner class
	
	public static String staticVar = "You can access me";
	
	private String privVar = "You cannot access me";
	
	public static class MyStaticMember {
		
		public void printStatus() {
			
			System.out.println("This is inside static member class");
			
			System.out.println(staticVar);
			
			// System.out.println(privVar); cannot make a non-static member reference
		}
	}
}

class MyNonStaticClass {	//non static inner class
	
	public class ChildNonstatic {
		
		public void myMethod() {
			
		System.out.println("You have called me");
		
		}
	}
		public ChildNonstatic getInnerInstance() {
			
			return this.new ChildNonstatic();
	}
}

public class InnerClasses {
	
	public static void main(String []args) {
		
		//instantiating static inner class
		MyStaticClass.MyStaticMember myinstat = new MyStaticClass.MyStaticMember();
		myinstat.printStatus();
		
		//instantiating non-static inner class
		MyNonStaticClass myNon = new MyNonStaticClass();
		myNon.getInnerInstance().myMethod();
		
		MyNonStaticClass mns = new MyNonStaticClass();
		MyNonStaticClass.ChildNonstatic cc = mns.getInnerInstance();
		cc.myMethod();
		
		MyNonStaticClass.ChildNonstatic cc1 = mns.new ChildNonstatic();
		cc1.myMethod();
	}
}
