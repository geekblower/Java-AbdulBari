class circle {
    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class cylinder extends circle {
    public double height;

    public double volume() {
        return area() * height;
    }
}

public class shapeInheritance {
    public static void main(String[] args) {
        cylinder c1 = new cylinder();
        
        c1.radius = 12.5;
        c1.height = 20;

        System.out.println("Area of cylinder " + c1.area());
        System.out.println("Volume of cylinder " + c1.volume());
    }
}
