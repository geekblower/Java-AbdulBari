import java.util.Scanner;

public class greaterOfThree {
    public static void main(String[] args) {
        int A, B, C;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A, B & C : ");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        if(A > B) {
            if(A > C) {
                System.out.println(A + " is greatest");
            } else {
                System.out.println(C + " is greatest!");
            }
        } else {
            if(B > C) {
                System.out.println(B + " is greatest!");
            } else {
                System.out.println(C + " is greatest!");
            }
        }
    }    
}
