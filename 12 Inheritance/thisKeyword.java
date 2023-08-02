class Rectangle {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        // length = length;
        // breadth = breadth;

        this.length = length;
        this.breadth = breadth;
    }

    public void display() {
        System.out.println("Length  : " + this.length);
        System.out.println("Breadth : " + this.breadth);
    }
}

public class thisKeyword {
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle(15, 10);
        R1.display();
    }
}
