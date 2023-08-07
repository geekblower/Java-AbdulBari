class Test {
    static int s1 = 10;
    static int s2;
    static int s3;
    int a, b;

    static {
        s2 = 20;
    }

    Test() {
        s3 = 30;
    }

    public static void meth1() {
        System.out.println("Static method called " + s1 + " & " + s2 + " & " + s3);
    }

    public void meth2() {
        System.out.println("Non-static method called " + s1 + " & " + s2 + " & " + s3 + "\n" + a + " & " + b);
    }
}

public class staticMethods {
    public static void main(String[] args) {
        Test.meth1();
        
        Test T = new Test();
        T.meth1();
        T.meth2();
    }
}