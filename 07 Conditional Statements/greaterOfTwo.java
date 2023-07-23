import java.util.Scanner;

public class greaterOfTwo {
    public static void main(String[] args) {
        int A, B;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A & B : ");
        A = sc.nextInt();
        B = sc.nextInt();

        if(A > B) {
            System.out.println(A + " is greater");
        } else {
            System.out.println(B + " is greater!");
        }
    }    
}
