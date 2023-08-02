class Super {
    public void display() {
        System.out.println("Super Class Display");
    }
}

class Sub extends Super {
    public void display() {
        System.out.println("Sub Class Display");
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        Super SP1 = new Super();
        Sub SB1 = new Sub();

        SP1.display();
        SB1.display();
    }
}
