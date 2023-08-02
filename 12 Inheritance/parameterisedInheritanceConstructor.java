class Parent {
    public Parent() {
        System.out.println("Non-Parameterised Parent Constructor");
    }

    public Parent(int x) {
        System.out.println("Parameterised Parent Constructor " + x);
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("Non-Parameterised Child Constructor");
    }

    public Child(int x) {
        System.out.println("Parameterised Child Constructor");
    }
    
    public Child(int x, int y) {
        super(x);
        System.out.println("Second Parameterised Child Constructor" + y);
    }
}

public class parameterisedInheritanceConstructor {
    public static void main(String[] args) {
        Child C1 = new Child();

        System.out.println();

        Child C2 = new Child(10, 20);
    }
}