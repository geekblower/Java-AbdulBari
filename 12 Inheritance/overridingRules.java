class A {}
class B extends A {}

class Super {
    public void meth1() {System.out.println("Super Method 1");}

    final public void meth2() {System.out.println("Super Method 2");}
    static public void meth3() {System.out.println("Super Method 3");}

    public A meth4() {
        System.out.println("Super Method 4");
        return new A();
    }
}

class Sub extends Super {
    @Override
    public void meth1() {System.out.println("Sub Method 1");}

    // final & static methods cannot be overriden
    /* 
        public void meth2() {System.out.println("Sub Method 2");}
        public void meth3() {System.out.println("Sub Method 3");}
    */

    // Only case in which different return type is allowed in overriding
    public B meth4() {
        System.out.println("Sub Method 4");
        return new B();
    }
}

public class overridingRules {
    public static void main(String[] args) {
        Super S1 = new Sub();

        S1.meth1();
        S1.meth2();
        S1.meth3();
        S1.meth4();
    }    
}
