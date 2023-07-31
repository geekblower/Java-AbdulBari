class rectangle {
    private double length;
    private double breadth;

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

public class dataHiding {
    public static void main(String[] args) {
        rectangle r1 = new rectangle();

        r1.setLength(15.5);
        r1.setBreadth(8.8);

        System.out.println("Length of r1 : " + r1.getLength());
        System.out.println("Breadth of r1 : " + r1.getBreadth());
        System.out.println("Area of r1 : " + r1.area());
        System.out.println("Perimeter of r1 : " + r1.perimeter());
    }
}
