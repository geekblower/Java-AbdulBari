abstract class Shape {
    abstract public double perimeter();
    abstract public double area();
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        this.radius = r;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;

    Rectangle(double l, double b) {
        this.length = l;
        this.breadth = b;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

    public double area() {
        return length * breadth;
    }
}

public class shapeChallenge {
    public static void main(String[] args) {
        Shape C1 = new Circle(12.5);
        Shape R1 = new Rectangle(15, 20.5);

        System.out.println("Perimeter of Circle : " + C1.perimeter());
        System.out.println("Area of Circle : " + C1.area());

        System.out.println();

        System.out.println("Perimeter of Rectangle : " + R1.perimeter());
        System.out.println("Area of Rectangle : " + R1.area());
    }    
}
