class blockDemo {
    static int s = 10;
    int a, b;

    static {
        System.out.println("Static block called");
    }

    public static void meth1() {
        System.out.println("Static method called");
    }

    public void meth2() {
        System.out.println("Non-static method called");
    }
}

public class staticBlocks {
    public static void main(String[] args) {
        
    }
}
