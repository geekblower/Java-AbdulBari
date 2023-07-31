class rectangle {
    public double length;
    public double breadth;

    public double area() {
        return (length * breadth);
    }

    public double perimeter() {
        return (2 * (length + breadth));
    }
}

public class rectangleClass {
    public static void main(String[] args) {
        rectangle r1 = new rectangle();

        r1.length = 15.5;
        r1.breadth = 8.8;

        System.out.println("Length of r1 : " + r1.length);
        System.out.println("Breadth of r1 : " + r1.breadth);
        System.out.println("Area of r1 : " + r1.area());
        System.out.println("Perimeter of r1 : " + r1.perimeter());
    }
}