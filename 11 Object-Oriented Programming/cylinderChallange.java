class cylinder {
    private double radius;
    private double height;

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public void setHeight(double h) {
        height = h;
    }

    public void setDimensions(double r, double h) {
        radius = r;
        height = h;
    }

    public cylinder() {
        radius = height = 1;
    }

    public cylinder(double r) {
        radius = r;
        height = 1;
    }

    public cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    public double volume() {
        return (Math.PI * radius * radius * height);
    }

    public double surfaceArea() {
        return (Math.PI * radius * height);
    }

    public double lidArea() {
        return (2 * Math.PI * radius * radius);
    }
}

public class cylinderChallange {
    public static void main(String[] args) {
        cylinder c1 = new cylinder();
        cylinder c2 = new cylinder(5.5, 10);
        cylinder c3 = new cylinder(7.5);

        System.out.println("\nRadius of c1 : " + c1.getRadius());
        System.out.println("Height of c1 : " + c1.getHeight());
        System.out.println("Volume of c1 : " + c1.volume());
        System.out.println("Surface Area of c1 : " + c1.surfaceArea());
        System.out.println("Lid Area of c1 : " + c1.lidArea());
        
        System.out.println("\nRadius of c2 : " + c2.getRadius());
        System.out.println("Height of c2 : " + c2.getHeight());
        System.out.println("Volume of c2 : " + c2.volume());
        System.out.println("Surface Area of c2 : " + c2.surfaceArea());
        System.out.println("Lid Area of c2 : " + c2.lidArea());
        
        System.out.println("\nRadius of c3 : " + c3.getRadius());
        System.out.println("Height of c3 : " + c3.getHeight());
        System.out.println("Volume of c3 : " + c3.volume());
        System.out.println("Surface Area of c3 : " + c3.surfaceArea());
        System.out.println("Lid Area of c3 : " + c3.lidArea());
    }
}
