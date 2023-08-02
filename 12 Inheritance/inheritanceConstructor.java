class GrandParent {
    public GrandParent() {
        System.out.println("GrandParent Constructor");
    }
}

class Parent extends GrandParent {
    public Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("Child Constructor");
    }
}

class GrandChild extends Child {
    public GrandChild() {
        System.out.println("GrandChild Constructor");
    }
}

public class inheritanceConstructor {
    public static void main(String[] args) {
        GrandChild GC1 = new GrandChild();
    }
}