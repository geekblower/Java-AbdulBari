abstract class Super {
    public void meth1() {System.out.println("Abstract Super Mthod 1");}

    abstract public void meth2();
}

class Sub extends Super {
    public void meth2() {System.out.println("Abstract Sub Method 2");}
}

public class abstractRules {
    public static void main(String[] args) {
        // Objects of abstract classes are not allowed
        // Super S1 = new Super();
        
        Super S1 = new Sub();
    }
}
