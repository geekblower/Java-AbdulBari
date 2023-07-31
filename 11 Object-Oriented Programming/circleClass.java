class circle {
    public double radius;

    public double area() {
        return (Math.PI * radius * radius);
    }

    public double perimeter() {
        return (2 * Math.PI * radius);
    }
}

public class circleClass {
    public static void main(String[] args) {
        circle c1 = new circle();
        circle c2 = new circle();

        c1.radius = 7.5;
        c2.radius = 13.0;

        System.out.println("Radius of c1 : " + c1.radius);
        System.out.println("Area of c1 : " + c1.area());
        System.out.println("Perimeter of c1 : " + c1.perimeter());

        System.out.println();
        
        System.out.println("Radius of c2 : " + c2.radius);
        System.out.println("Area of c2 : " + c2.area());
        System.out.println("Perimeter of c2 : " + c2.perimeter());
    }
}