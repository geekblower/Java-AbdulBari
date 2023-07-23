import java.util.Scanner;

public class Area_Of_Triangle {
    public static void main(String[] args) {
        float base, height, area;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base of triangle : ");
        base = sc.nextFloat();

        System.out.print("Enter the height of triangle : ");
        height = sc.nextFloat();

        area = (base * height) / 2;
        System.out.println("Area of the triangle = " + area);
    }   
}
