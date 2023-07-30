public class areaOverloaded {
    static double area(double l, double b) {
        return l * b;
    }

    static double area(double r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        System.out.println("Area of rectangle with l=10.65 & b=23.54 : " + area(10.65, 23.54));
        System.out.println("Area of radius r=12.35 : " + area(12.35));
    }
}