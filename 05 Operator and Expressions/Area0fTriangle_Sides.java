import java.util.Scanner;

public class Area0fTriangle_Sides {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double s, area;

        System.out.print("Enter the three sides : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        s = (a+b+c) / 2.0;
        area = Math.sqrt(s * (s-a) * (s-b) * (s-c));

        System.out.println("Area of the triangle : " + area);
    }
}
