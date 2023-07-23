import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        int l, b, h;
        int totalArea, volume;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length, breadth and height : ");
        l = sc.nextInt();
        b = sc.nextInt();
        h = sc.nextInt();

        double floor, walls;

        totalArea = 2 * (l*b + b*h + h*l);
        volume = l * b * h;

        System.out.println("Total Area : " + totalArea);
        System.out.println("Volume : " + volume);
    }
}
