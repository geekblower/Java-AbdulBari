import java.util.Scanner;

public class relationalOperators {
    public static void main(String[] args) {
        int A, B;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A & B : ");
        A = sc.nextInt();
        B = sc.nextInt();

        System.out.println(A + " > " + B + "  : " + (A>B));
        System.out.println(A + " >= " + B + " : " + (A>=B));

        System.out.println(A + " < " + B + "  : " + (A<B));
        System.out.println(A + " <= " + B + " : " + (A<=B));

        System.out.println(A + " == " + B + " : " + (A==B));
        System.out.println(A + " != " + B + " : " + (A!=B));
    }
} 