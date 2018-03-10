import java.io.*;
class OuterClass {
    private int i = 11;

    public void createInner() {    // creating instance for inner class
        InnerCls innerCls = new InnerCls();
        innerCls.getValue();
    }

    class InnerCls {    // inner class declaration
        public void getValue() {
            System.out.println("Value of i : " + i); // accessing private variable of outer class
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();    //creating outer class instance
        OuterClass.InnerCls inner = outer.new InnerCls();    //creating inner class instance
        inner.getValue();    //calling inner class method
        outer.createInner();
    }
}
