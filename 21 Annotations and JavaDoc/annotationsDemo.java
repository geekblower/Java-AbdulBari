package annodemo;
import java.util.*;

class Parent {
    public void display() {}
}

class Child extends Parent {
    @Override
    public void display() {}
}

class OldClass {
    public void display() {
        System.out.println("Display Method");
    }

    @Deprecated
    public void show() {
        System.out.println("Show Method");
    }
}

public class annotationsDemo {
    static List l;
    // @SuppressWarnings("unchecked")
    
    public void main(String[] args) {
        // OldClass O1 = new OldClass();
        // O1.show();

        l .add(10);
    }
}
