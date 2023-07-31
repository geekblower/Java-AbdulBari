class rectangle {
    private double length;
    private double breadth;

    // Non-parameterized constructor
    public rectangle() {
        length = breadth = 1;
    }

    // Parameterized constructor
    public rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    public rectangle(double s) {
        length = breadth = s;
    }

    // Setter function for length
    public void setLength(double l) {
        if(length > 0) {
            length = l;
        } else {
            length = 0;
        }
    }

    // Getter function for length
    public double getLength() {
        return length;
    }
    
    // Setter function for breadth
    public void setBreadth(double b) {
        if(breadth > 0) {
            breadth = b;
        } else {
            breadth = 0;
        }
    }

    // Getter function for breadth
    public double getBreadth() {
        return breadth;
    }

    public double area() {
        return (length * breadth);
    }

    public double perimeter() {
        return (2 * (length + breadth));
    }

    public boolean isSquare() {
        if(length == breadth) {
            return true;
        } else {
            return false;
        }
    }
}

public class constructors {
    public static void main(String[] args) {
        rectangle r1 = new rectangle();
        rectangle r2 = new rectangle(15.5, 8.8);
        rectangle r3 = new rectangle(17.5);

        System.out.println("\nLength of r1 : " + r1.getLength());
        System.out.println("Breadth of r1 : " + r1.getBreadth());
        System.out.println("Area of r1 : " + r1.area());
        System.out.println("Perimeter of r1 : " + r1.perimeter());
        
        System.out.println("\nLength of r2 : " + r2.getLength());
        System.out.println("Breadth of r2 : " + r2.getBreadth());
        System.out.println("Area of r2 : " + r2.area());
        System.out.println("Perimeter of r2 : " + r2.perimeter());
        
        System.out.println("\nLength of r3 : " + r3.getLength());
        System.out.println("Breadth of r3 : " + r3.getBreadth());
        System.out.println("Area of r3 : " + r3.area());
        System.out.println("Perimeter of r3 : " + r3.perimeter());
    }
}
