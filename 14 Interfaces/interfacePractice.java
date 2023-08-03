interface Test {
    void meth1();
    void meth2();
}

class MyTest implements Test {
    public void meth1() {System.out.println("Method 1 of MyTest");}
    public void meth2() {System.out.println("Method 2 of MyTest");}
    public void meth3() {System.out.println("Method 3 of MyTest");}
}

public class interfacePractice {
    public static void main(String[] args) {
        // Reference of Interface is allowed
        Test T;
        
        // Object of Interface is not allowed
        // Test T = new Test();

        // Dynamic Method Dispatch - Runtime Polymorphism
        T = new MyTest();
        T.meth1();
        T.meth2();
    }
}
