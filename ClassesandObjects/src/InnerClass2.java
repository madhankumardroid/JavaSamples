class MyOuter {
	private int x;

	MyOuter(int x, int y) {
		this.x = x;
		new MyInner(y).privateDisplay(); // instantiating inner class object and accessing the private method of inner
											// class
		new MyInner(y).publicDisplay();// instantiating inner class object and accessing the public method of inner
		// class
	}

	public class MyInner {
		private int y;

		MyInner(int y) {
			this.y = y;
		}

		private void privateDisplay() {
			System.out.println("Private Display x = " + x + " and y = " + y); // here the outer class data member x is
																			// accessed
		}

		public void publicDisplay() {
			System.out.println("Public Display x= " + x + " and y = " + y); // here the outer class data member x is
																			// accessed
		}

	}
}

public class InnerClass2 {
	public static void main(String[] args) {
		new MyOuter(1, 2); // instantiating outer class object
	}
}
