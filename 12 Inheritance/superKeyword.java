class Rectangle {
    int length, breadth;
    int x = 20;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

class Cuboid extends Rectangle {
    int height;
    int x = 10;

    Cuboid(int l, int b, int h) {
        super(l,b);
        this.height = h;
    }

    public void display() {
        System.out.println(super.x);
        System.out.println(x);
    }
}

public class superKeyword {
    public static void main(String[] args) {
        Cuboid C1 = new Cuboid(15, 10, 5);
        C1.display();
    }
}
