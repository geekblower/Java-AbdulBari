import java.util.Scanner;

public class Quadratic_Equation {
    public static void main(String[] args) {
        int a, b, c;
        double r1, r2, d;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the co-efficients : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        d = ((b*b) - (4*a*c));
        
        r1 = (-b + Math.sqrt(d)) / (2*a);
        r2 = (-b - Math.sqrt(d)) / (2*a);

        System.out.println("Roots are : " + r1 + " & " + r2);
    }
}
