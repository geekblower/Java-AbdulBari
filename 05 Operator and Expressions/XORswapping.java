import java.util.Scanner;

public class XORswapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Before swapping : a = " + a + " & b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        
        System.out.println("After swapping : a = " + a + " & b = " + b);
    }
}
